class A{
    int i=10;
}
public class SuperExample extends A{
    int i=20;
    void show(int i){
        System.out.println(super.i);
    }
    public static void main(String[] args) {
        SuperExample s=new SuperExample();
        s.show();
    }
}
