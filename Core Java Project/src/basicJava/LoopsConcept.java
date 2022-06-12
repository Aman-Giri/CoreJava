package basicJava;

public class LoopsConcept {
	public static void main(String[] args) {
		//1.while loop
		//disadvtg : it will generate infinite loop if you dont give increment/decrement condition.
		
		//print 1 to 10
		int i=1; //initialisation
		while(i<=10) { // conditional
			System.out.println(i);
			i=i+1; //incremental/decremental
		}
		
		System.out.println("**************");
		
		//j++ means j = j+1;
		
		//2. for loop : 
		//print 1 to 10
		for(int k=1;k<=10;k++) {
			System.out.println(k);
		}
	
		System.out.println("*********");
		
		//3. print 10 to 1
		for(int j=10;j>=1;j--) {
			System.out.println(j);
		}
		
}
}
