class Pen{
       String color;
       String type;

       public void write(){
        System.out.println("Write");
       }
       }
public class Class{
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color="Red";
        pen1.type="ball";
        pen1.write();


    }

}