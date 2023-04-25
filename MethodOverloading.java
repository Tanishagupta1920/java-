import java.rmi.server.SocketSecurityException;

class MethodOverloading{
    int a;
    int b;
    void show(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println( a+" "+b);
    }
    void show(int a){
        System.out.println("2");
    }
    public static void main(String[] args) {
        MethodOverloading a=new MethodOverloading();
        a.show(10,20);
    }
}