abstract class Vehicle{
    abstract void start();
}class Car extends Vehicle{
    void start(){
        System.out.println("Car starts with key");
    }
}class Abstractionex extends Vehicle{
    void start(){
        System.out.println("Scooter starts with key");
    }
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        Abstractionex s=new Abstractionex();
        s.start();
    }
}