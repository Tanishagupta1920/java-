class A{
    void m1(){
        System.out.println("m1 method");
    }
}
public class super2 extends A {
    void show(){
        super.m1();

    }
    public static void main(String[] args) {
        super2 s=new super2();
        s.show();
    }
    
}
