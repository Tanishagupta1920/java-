public class StaticMethod {
    static void show(){
        System.out.println("Hello");
    }void display(){
        System.out.println("Hiee");
    }public static void main(String[] args) {
        StaticMethod s1=new StaticMethod();
        s1.display();
        StaticMethod.show();
    }
    
}
