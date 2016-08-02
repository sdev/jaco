package sdev.tools;

public class PrintObjectClassInfo {
	public static void printClassName(Object obj){
		System.out.println("Object Class Name: " + obj.getClass().getName());
	}
	
	public static void printSimpleClassName(Object obj){
		System.out.println("Object Class Simple Name: " + obj.getClass().getSimpleName());
	}
	
	public static void printClassCanonicalName(Object obj){
		System.out.println("Object Class Canonical Name: " + obj.getClass().getCanonicalName());
	}
}
