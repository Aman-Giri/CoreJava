package PracticePAckage;

public abstract class AbstractionConcepts {
    
    //what is the meaning of abstraction
    //within abstract there will be abstract and non abstract method

    public int sum(){ // non abstract method/normal methods : Methods which has implementation/body
        return 2+3;
    }

    public abstract int multiply(int a, int b);//abstract method: methods which do not has any implementation/body

    public static void main(String[] args) {
        //AbstractionConcepts obj = new AbstractionConcepts();// we cannot create the object of Abstract class
    }

        
    



}
