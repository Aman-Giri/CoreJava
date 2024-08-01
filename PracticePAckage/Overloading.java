package PracticePAckage;

public class Overloading {
    public static void main(String[] args) {
        
    }

    public int sum(){
        return 10+15;
    }

    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public String sum(String a , String b){
        return a+b;
    }

    //function overloading : Class has more than one function with same name
//either argument count should be different or 
//argument data type should be different
}
