public class This3 {
    This3 m1()
    {
        System.out.println("1");
        return this;
    }
        
        public static void main(String[] args) {
            This3 td= new This3();
            td.m1();
        }
}
