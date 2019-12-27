package jvm_components;

public class ClassLoaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class c = ClassLoaderExample.class;
		
		//This would be the system / application classloader.
		
		System.out.println(c.getClassLoader());
		
		/* This will print null as this class is loaded by rt.jar, 
		so it is loaded by BootStrap ClassLoader */
		
		System.out.println(String.class.getClassLoader());

	}

}
