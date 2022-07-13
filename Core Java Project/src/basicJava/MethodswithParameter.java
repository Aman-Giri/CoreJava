package basicJava;

public class MethodswithParameter {
	public static void main(String[] args) {
		MethodswithParameter md1 = new MethodswithParameter();
		System.out.println(md1.addnumbers(24, 20));
		md1.mymethod("My name is Aman", 3, 4);
	}
	
	public int addnumbers(int x , int y) {
		return x+y;
	}
	
	public void mymethod(String s , int m , int n) {
		System.out.println(s);
		System.out.println(m);
		System.out.println(n);
	}
}
