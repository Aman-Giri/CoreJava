package Abstraction;

public abstract class ParentAircraft {
    
    public void engine(){
        System.out.println("Follow Engine Guidelines");
    }

    public void safetyGuidelines(){
        System.out.println("Follow Safety Guidelines");
    }

    public abstract void bodyColor();
}
