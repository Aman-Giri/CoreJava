package PracticePAckage;

public class ChildClass extends InheritanceConcepts {
    
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.animal();
        


    //    ChildClass obj = new InheritanceConcepts(); -- error
    //    InheritanceConcepts obj1 = new ChildClass();
        

    }

    //method overRiding: whenever we overwrite a parent method inside the child class

    public void animal(){
        System.out.println("Random in child class");
    }

    public void childMethod(){
        System.out.println("I am inside the child class");
    }

    int age = 26;


}
