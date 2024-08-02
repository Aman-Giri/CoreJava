package PracticePAckage;

public class ChildClass3 implements IConcept, I2{

public static void main(String[] args) {
    ChildClass3 obj = new ChildClass3();
    obj.i2Method();
    obj.print();
}


    @Override
    public void print() {
        System.out.println("I am the print");
    }

    @Override
    public void print2() {
        System.out.println("I am the print2");
    }

    @Override
    public void print3() {
        System.out.println("I am the print3");
    }

    @Override
    public void i2Method() {
        System.out.println("I am inside the I2 interface");
    }
    
}

// classes and classes = extends
// classes and interfaces = implements
// interfaces and interfaces = extends
