class Employee{
    public int Empid;
    public void setEmpid(int Empid_1){
        Empid=Empid_1;
    }public int getEmpid(){
        return Empid;
    }
}
class Encapsulation{
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setEmpid(100);
        System.out.println(e.getEmpid());
    }
}