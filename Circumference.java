//Write a function that takes in the radius
// as input and returns the circumference of a circle
//circumference=2*22/7*r
import java.util.*;
public class Circumference {
    public static Double circumferenceCircle(Double r){
     Double circumference=  2*3.14*r;
     return circumference;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double r=sc.nextDouble();
        System.out.println("Circumference of circle is:" +circumferenceCircle(r) );
    }
}
