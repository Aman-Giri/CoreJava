package CoreJavaConcepts.FinalKeyword;

public class FinalDemo {
    
    //Final methods cannot be over-ridden in case of the inheritance
    final void getData(){
        System.out.println("I am inside the final method");
    }
    // Class name as final: means you cannot extends that class
    public static void main(String[] args) {

        final int i = 4; // constant variable whose value cannot be changed
        
    }
}
