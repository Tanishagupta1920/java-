//Write a function that takes in age as
// input and returns if that person is 
//eligible to vote or not. A person of 
//age > 18 is eligible to vote.


import java.util.*;
public class Criteria {
    public static int getEligibility(int age){
        if(age<18){
            System.out.println("Not eligibe to vote");
        }else{
            System.out.println("Eligible to vote");
        }
        return age ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        getEligibility(age);
    }
    
}
