public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5,3,6,9,10,1};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array :");
        for(int num : arr){
            System.out.println(num+" ");
            
        }
    }
    
}
