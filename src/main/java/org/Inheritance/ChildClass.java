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
        String col = cd.color; // this will give error untill we assign it to a variable
        col = "blue";
        System.out.println("the color is: " + col);
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

        //You are trying to store a Parent object in a Child reference — not allowed.
        //ChildClass cd4 = new ParentClass();

        //This is allowed bcz you are forcing Java to believe:
        //“Trust me, this Parent object is actually a Child.”
        //it will pass at compile time but it will fail at runtime
        //ChildClass cd4 = (ChildClass) new ParentClass();











    }
}
