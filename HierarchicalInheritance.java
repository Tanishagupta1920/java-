class A{
    void showA(){
        System.out.println("a is method");
    }
}
class B extends A {
    void showB(){
        System.out.println("b is method");
    }
}
public class HierarchicalInheritance extends A {
    void showC(){
        System.out.println("c is method");
    }
public static void main(String[] args) {
    A ob1=new A();
    ob1.showA();
    System.out.println("----------------------");
    B ob2=new B();
    ob2.showA();
    ob2.showB();
    System.out.println("----------------------");
    HierarchicalInheritance ob3=new HierarchicalInheritance ();
    ob3.showA();
    ob3.showC();
    
}

}
