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

class MultilevelInheritance extends B{
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
        MultilevelInheritance ob3=new MultilevelInheritance();
        ob3.showA();
        ob3.showB();
        ob3.showC();
        
    }
    
}