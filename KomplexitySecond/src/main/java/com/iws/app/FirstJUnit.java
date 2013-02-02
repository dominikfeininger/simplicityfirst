package main.java.com.iws.app;

public class FirstJUnit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		String name = null;// = "name";
		if (name != null) {
			name = "name2";
		}
		name = "name2";
	}
	
	/**
	 * 
	 * @return Stirng Fertig
	 */
	public static String returnFertig(){
		return "Fertig";
	}
	
	/**
	 * 
	 * @return 5
	 */
	public static int return5(){
		return 5;
	}
	
	/**
	 * 
	 * @return 17.9
	 */
	public static double return179(){
		return 17.9;
	}
	
	/**
	 * 
	 *  @return NULL
	 */
	public static Object returnNull(){
		return null;
	}
	
	/**
	 * 
	 * @return initialized object
	 */
	public static Object returnNotNull(){
		Object obj = new Object();
		return obj;
	}
	
	
	public static void findBug(){
		String aString = "bob";
		aString.replace('b', 'p');
		if(aString.equals("pop")){
			System.out.println("relpaced");
		}else{
			System.out.println("original");
		}
	}
}
