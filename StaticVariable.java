public class StaticVariable {
    static String company="sp";
    int empid;
    String name;
    StaticVariable (String name,int empid){
        this.empid=empid;
        this.name=name;
    }
    void display(){
        System.out.println(empid+" "+name+" "+company);
    }

    public static void main(String[] args) {
        StaticVariable e1=new  StaticVariable("Xyz",0);
        e1.display();
        StaticVariable e2=new  StaticVariable ("abc",1);
        e2.display();
    }
    
}
