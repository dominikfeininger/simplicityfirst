package harrald;

import java.awt.*;
import javax.swing.*;

import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.geometry.ColorCube;
import javax.media.j3d.*;
import javax.vecmath.*;

public class Main extends JFrame {

	public static void main(String args[]) {
		new Main();
	}

	public Main() {
		//feste Größe für das Hauptfenster
		setPreferredSize(new Dimension(250, 250));

		//wird dem Frame hinzugefügt
		Canvas3D canvas3D = createCanvas3D();
		add(canvas3D, BorderLayout.CENTER);

		//swing; exit ...
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		pack();
		//sichtbar machen
		setVisible(true);
	}

	private Canvas3D createCanvas3D() {

		//iinstatiate
		GraphicsConfiguration config = SimpleUniverse
				.getPreferredConfiguration();

		Canvas3D canvas3D = new Canvas3D(config);

		SimpleUniverse simpleUniverse = new SimpleUniverse(canvas3D);

		//würfel sichtbar setzen
		simpleUniverse.getViewingPlatform().setNominalViewingTransform();

		BranchGroup scene = createSceneGraph();
		simpleUniverse.addBranchGraph(scene);

		return canvas3D;
	}

	public BranchGroup createSceneGraph() {
		BranchGroup scene = new BranchGroup();

		TransformGroup transformGroup = new TransformGroup();
		transformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		scene.addChild(transformGroup);
		
		//würfel
		transformGroup.addChild(new ColorCube(0.4));
		Transform3D axisX = new Transform3D();
		//Transform3D axisY = new Transform3D();
		Alpha rotation = new Alpha(-1,4000);
		RotationInterpolator rotatorX = new RotationInterpolator(rotation, transformGroup, axisX, 0.0f, (float)Math.PI*2.0f);
		//RotationInterpolator rotatorY = new RotationInterpolator(rotation, transformGroup, axisY, 0.0f, (float)Math.PI*2.0f);
		
		rotatorX.setSchedulingBounds(new BoundingSphere(new Point3d(0,0,0),100));
		transformGroup.addChild(rotatorX);
		/*
		rotatorY.setSchedulingBounds(new BoundingSphere(new Point3d(0,0,0),100));
		transformGroup.addChild(rotatorY);
		*/
		
		return scene;
	}
}
