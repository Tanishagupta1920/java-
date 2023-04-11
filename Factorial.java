//Find the factorial of a number.

import java.util.*;
public class Factorial {
    public static int getFactorial(int n){
        int factorial=1;
        for(int i=n;i>=1;i--){
        factorial=factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt ();
        System.out.println("Factorial is:" +getFactorial(n));
        
      }

    
}
