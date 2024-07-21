package PracticePAckage;

public class FunctionsandStaticKeywords {
    public static void main(String[] args) {
        // givesum();
        // sum(10, 20);
        // int mysum = sum1(10, 30);
       String myStr = sum2("Hello", "World");

        System.out.println(myStr);

    }


    //static - bound to class

    //Function to add the two numbers - non parameterised
    public static void givesum(){
        System.out.println((2+3));
    }

    //parameterised
    public static void sum(int a, int b){
        System.out.println((a+b));
    }

    //Datatypes in methods/functions

    public static int sum1(int a , int b){
        return a+b;
    }

    public static String sum2(String a, String b){
        return a + b;
    }



    
}
