package basicJava;

public class StaticArray {
	public static void main(String[] args) {
		//array : to store the similar data type values in a array variable
		
		//1.int array : 
		//lowest bound/index = 0
		//upper bound/index = n-1(n is the size of the array)
		//One dimensional Array
		
		//dis-advantage of the array : 
		//1.size is fixed -- to overcome this problem - we use the collection -- ArrayList,Hashtables -- use dynamic array
		//2.Stores only similar data types -- to overcome this - we can object array
		 
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		System.out.println("---------------------");
		
		//System.out.println(i[4]); //Arrayindexoutofboundexception
		System.out.println(i.length); // size of the array
		
		System.out.println("---------------------");
		
		//print all the values of the int array
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//2.Double array : 
		
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.55;
		
		//3.Char array : 
		char c[] = new char[3];
		c[0] = 'q';
		c[1] = 2;
		c[2] = '$';
		
		//4.boolean array : 
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		//5.String array : 
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "Aman Giri";
		s[2] = "Automation Test Engineer";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		//6.Object Array : 
		Object ob[] = new Object[6];
		ob[0] = "Aman Giri";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/2000";
		ob[4] = 'm';
		ob[5] = "London";
		
		for(int k=0;k<ob.length;k++) {
			System.out.println(ob[k]);
		}
		
	}
}
