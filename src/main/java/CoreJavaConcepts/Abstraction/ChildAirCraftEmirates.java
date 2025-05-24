package CoreJavaConcepts.Abstraction;

public class ChildAirCraftEmirates extends ParentAircraft{

    public static void main(String[] args){
        ChildAirCraftEmirates obj = new ChildAirCraftEmirates();
        obj.bodyColor();
        obj.safetyGuidelines();
        obj.engine();

        //Note: We cannot make the object of a abstract Class in Java
        //ParentAircraft obj = new ParentAircraft();
            
        
    }

    @Override
    public void bodyColor() {
        System.out.println("The Body of the Aircraft is white and blue color");
    }
    

}
