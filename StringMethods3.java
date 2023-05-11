public class StringMethods3 {
    public static void main(String[] args) {
        //is.empty()method
        String s1="abcdefghij" ;
        boolean b=s1.isEmpty();
        if(b==true){
            System.out.println("String is Empty");
        }else{
            System.out.println("Valid Name");
        }

        //Trim()method
        String s2="     abc     ";
        System.out.println(s2.trim());
        String s3="   abc   xyz   ";
        System.out.println(s3.trim());

        //Trim.length()method
        String name="    ";
        if(name.trim().length()==0){
            System.out.println("String is Empty");
        }else{
            System.out.println("Valid Name");
        }

        //Trim.isEmpty()method
        String s4="   ";
        if(s4.trim().length()==0){
            System.out.println("String is Empty");
        }else{
            System.out.println("Valid Name");
        }


    }
    
}
