interface I1{
    public abstract void start();
}
interface I2{
    public abstract void New();
}

public class Interfacesex implements I1,I2 {
    public void start(){
        System.out.println("1");
    }
    public void New(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Interfacesex s= new Interfacesex();
        s.start();
        s.New();
    }
    
}
