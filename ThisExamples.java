public class ThisExamples {

    void show(){
        System.out.println("1");
    }void showing(){
        this.show();
    }
    public static void main(String[] args) {
        ThisExamples t=new ThisExamples();
        t.showing();
    }
}
