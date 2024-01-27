package Interfaces;

public class AustralianTraffic implements InterfacesConcepts, ContinentalTraffic {

    public static void main(String[] args) {
        AustralianTraffic obj = new AustralianTraffic();
        obj.greenGo();
        obj.flashYellow();
        obj.redStop();
        obj.walkingSymbol();
        obj.trainSymbols();
    }

    @Override
    public void greenGo() {
        System.out.println("greenGo Implementation");
    }

    @Override
    public void redStop() {
         System.out.println("Red Stop Implementation");
    }

    public void walkingSymbol(){
        System.out.println("The Person is walking ");
    }

    @Override
    public void flashYellow() {
        System.out.println("flashYellow Implementation");
    }

    @Override
    public void trainSymbols() {
        System.out.println("I am in the train Symbols");
    }
    
}
