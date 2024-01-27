package SuperandThisKeyWord;

public class ChildDemo extends ParentDemo {
     String name = "Goswami";

     public void getStringdata(){
        System.out.println(name);
        System.out.println(super.name);
     }

     //Constructor
     public ChildDemo(){
        super(); //this should be always in first line
        System.out.println("Child class constructor");
     }

     public void getData(){
        super.getData(); 
        System.out.println("I am in the Child class");
    }

    public static void main(String[] args) {
        ChildDemo cd = new ChildDemo();
        cd.getStringdata();
        cd.getData();
        
    }
}
