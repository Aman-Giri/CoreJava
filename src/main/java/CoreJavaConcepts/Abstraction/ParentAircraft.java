package CoreJavaConcepts.Abstraction;
public abstract class ParentAircraft {

    //Abstract class can have abstract and non abstract methods also
    
    public void engine(){
        System.out.println("Follow Engine Guidelines");
    }

    public void safetyGuidelines(){
        System.out.println("Follow Safety Guidelines");
    }

    public abstract void bodyColor();
}