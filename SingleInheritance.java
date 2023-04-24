class A{
    void showA(){
        System.out.println("a is method");
    }
}
public class SingleInheritance extends A {
    void showB(){
        System.out.println("b is method");
    }
    public static void main(String[] args) {
        A ob1=new A();
        ob1.showA();
        SingleInheritance ob2=new SingleInheritance();
        ob2.showA();
        ob2.showB();

    }
    
}
