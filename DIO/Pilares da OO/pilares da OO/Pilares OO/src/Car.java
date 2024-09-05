public class Car extends Vehicle {


    public void start(){
        System.out.println("car on");
        checkEngine();
        checkfuel();
    }

    private void checkEngine(){
        System.out.println("engine Check");
    }

    private void checkfuel(){
        System.out.println("Check fuel");
    }
}
