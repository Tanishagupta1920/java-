public class SearchMin {
    public static void main(String[] args) {
        int[] a={41,62,895,76,92,2,61,52};
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("minimum element is: " +min);
    }
    
}
