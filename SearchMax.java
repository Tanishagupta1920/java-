public class SearchMax {
    public static void main(String[] args) {
        int[] a={41,62,895,76,92,2,61,52};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("max element is: " +max);
    }
    
}
