public class Paramconsructor {
    String name;
    int age;
    Paramconsructor(String name,int age){
    this.name=name;
    this.age=age;
}

public static void main(String[] args) {
    Paramconsructor t=new Paramconsructor("tani",20);
    System.out.println(t.name+" "+t.age);
}
}
