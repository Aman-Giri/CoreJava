package org.Inheritance;

public class ChildClass extends ParentClass {
    
    public void engine(){
        System.out.println("New Engine");
    }

    public void colour(){
        System.out.println("I am in "+ color +" colour");
    }

    //CONCEPT OF POLYMORPHISM: FUNCTION OVER-RIDING
    public void audioSystem(){
        System.out.println("child Audio system");
    }

    public static void main(String[] args) {
        ChildClass cd = new ChildClass();
        cd.engine();
        cd.colour();
        cd.Gear();
        cd.audioSystem();
        cd.brakes();

        System.out.println("**************************");

        ParentClass cd1 = new ChildClass();
        //here I can't call the function of the child class because reference variable related to the parentclass only
        cd1.Gear();
        cd1.brakes();
        cd1.audioSystem();

        System.out.println("**************************");

        ParentClass cd2 = new ParentClass();
        //here I can't call the function of the child class because reference variable related to the parentclass only
        cd2.Gear();
        cd2.audioSystem();
        cd2.brakes();

        //this is not possible bcz: you are trying to assign an instance of the parent class (ParentClass) to a 
        ///variable of the child class type (ChildClass) without explicit casting.
        //ChildClass cd4 = new ParentClass();

        


        
        
        
        
        
    }
}
