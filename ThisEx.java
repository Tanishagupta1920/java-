class ThisEx{
    int i;
    void setValues(int x){
     this.i=x;
    }
    void showing(){
        System.out.println(i);
    }
    public static void main(String args[]){
        ThisEx t=new ThisEx();
        t.setValues(11111);
        t.showing();
    }
}