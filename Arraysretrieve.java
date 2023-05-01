package Data;

public class Arraysretrieve {
    public static void main(String[] args) {
        int[] a=new int[3];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        System.out.println(a);
        //using for each
        for(int i:a){
            System.out.println(i+" ");
        }
        //using for
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");

        }
    }
    
}
