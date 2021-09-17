package ClassDemo;

public class A {
	public static void main(String arg[]) {
		
		B.add(5,6); //static method
		
		B obj=new B(); // non-static method
		obj.add2(10, 11);
	
	}

}
