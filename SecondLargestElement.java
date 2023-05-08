public class SecondLargestElement {
    public static void main(String[] args) {
        int[] a={7,9,5,2,4,6,8};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
           if(a[i]>largest){
            secondLargest=largest;
            largest=a[i];
           }else if(a[i]>secondLargest && a[i]!=largest){
            secondLargest=a[i];
           }
        }
           if(secondLargest==Integer.MIN_VALUE){
            System.out.println("No second largest element");
            
           }
           else{
            System.out.println("Second Largest Element is: "+secondLargest);     
         }
    }
    
}
