package test.java.com.iws.app;

import static org.junit.Assert.*;


import org.junit.*;
import static main.java.com.iws.app.FirstJUnit.*;

public class FirstJUnitTest{// extends HudsonTestCase{
	
	private static Object obj;
	
	/*
	public void setEnvironmentVariables() throws IOException {
	    EnvironmentVariablesNodeProperty prop = new EnvironmentVariablesNodeProperty();
	    EnvVars envVars = prop.getEnvVars();
	    envVars.put("sampleEnvVarKey", "sampleEnvVarValue");
	    super.hudson.getGlobalNodeProperties().add(prop);
	}
	
	public void setup() throws Exception {
        FreeStyleProject project = createFreeStyleProject();
        project.getBuildersList().add(new Shell("echo hello"));

        FreeStyleBuild build = project.scheduleBuild2(0).get();
        System.out.println(build.getDisplayName()+" completed");

        String s = FileUtils.readFileToString(build.getLogFile());
        assertTrue(s.contains("+ echo hello"));
    }
	*/
	
	/**
	 * Asserts
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testAsserts() throws Exception{
		//fail("Let the method fail");
		assertTrue(true); //check for boolean
		assertFalse(false); //check for boolean
		assertTrue("message to identify", true); //check for boolean
		//assertEquals("message to identify", return179(), 17.9);
		assertEquals("messgae to identify", return179(), 17.8, 0.1);
		assertNull(returnNull());
		assertNull("message to identify", returnNull());
		assertNotNull(returnNotNull());
		//assertSame(getObj(), obj);
		//assertNotSame(obj, returnNotNull());
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Object obj = new Object();
		setObj(obj);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	/**
	 * red
	 */
	public void return5Test_Fail() {
		assertEquals(6, return5());
	}
	
	@Test
	/**
	 * red
	 */
	public void returnFertig_Fail(){
		//assertEquals("Erster", returnFertig());
	}
	
	@Test
	/**
	 * green
	 */
	public void returnFertig_Succ(){
		assertEquals("Fertig", returnFertig());
	}
	
	@Test
	/**
	 * green
	 */
	public void return5Test_Succ() {
		assertEquals(5, return5());
	}

	public static Object getObj() {
		return obj;
	}

	public static void setObj(Object o) {
		obj = o;
	}

}
