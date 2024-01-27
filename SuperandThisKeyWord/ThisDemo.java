package SuperandThisKeyWord;

public class ThisDemo {
    int a =2;

    public void getData(){
        int a = 3;
        int c = a + this.a;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println("The sum is: " + c);

        //this refer to the current object - Object scope lies in class level
    }

    public static void main(String[] args) {
        ThisDemo td = new ThisDemo();
        td.getData();
    }
}
