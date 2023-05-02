//Two numbers are entered by the user, x and n.
// Write a function to find the value of one 
//number raised to the power of another i.e. xn.

import java.util.*;
public class Power {
    public static int powerOfNum(int x,int n){
        int result=1;
        for(int i=0; i<n;i++) {
        result=result*x;
        System.out.println(result);
        return int();

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        
     powerOfNum( x,n);
    }
    
}
