//Write a function which takes in 2 numbers
// and returns the greater of those two.
import java.util.*;
public class GReater {
    public static void greaterNum(int a,int b){
        if(a>b){
            System.out.println(" greater number is:"+a);
        }
        else{
            System.out.println(" greater number is:"+b);
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        greaterNum(a, b);
    }
}
