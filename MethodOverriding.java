class Test{
    void show(){
        System.out.println("1");
    }
}public class MethodOverriding extends Test{
    void show(){
        System.out.println("2");

    }public static void main(String[] args) {
        Test t=new Test();
        t.show();
        MethodOverriding x= new MethodOverriding();
        x.show();
    }
}