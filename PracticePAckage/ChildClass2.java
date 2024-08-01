package PracticePAckage;

public class ChildClass2 extends AbstractionConcepts{
    public static void main(String[] args) {
        ChildClass2 obj = new ChildClass2();
        int mysum = obj.sum();
        int mymulti = obj.multiply(4,100);

        System.out.println(mysum + " " + mymulti);
    }

    @Override
    public int multiply(int a , int b ) {
        return a*b;
    }

    

    

    
}
