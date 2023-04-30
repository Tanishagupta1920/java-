import java.util.Scanner;
class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String message){
        super(message);
    }
}
public class ThrowKeyword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        try{
        int age=sc.nextInt();
        if(age<18){
            throw new YoungerAgeException("You are not aligible to vote");
        }else{
            System.out.println("vote success");
        }
    }
        catch(YoungerAgeException e){
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
