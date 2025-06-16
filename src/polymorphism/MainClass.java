package polymorphism;

public class MainClass {
    public static void main(String[] args) {
        ServiceClass serviceClass = new ServiceClass();
        System.out.println(serviceClass.executeOperation("Passenger","Takeoff"));
        System.out.println(serviceClass.executeOperation("Cargo","Landing"));


    }
}
