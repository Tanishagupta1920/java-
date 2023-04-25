class Test{
    void show(){
        System.out.println("1");
    }
}
public class Super extends Test{
    void show(){
        super.show();
        System.out.println("2");
    }
    public static void main(String[] args) {
        Super x=new Super();
        x.show();
    }
    
}
