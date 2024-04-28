public class Linear {
    int ls(int target){
        int arr[] = {10,20,30,40,50};
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        System.out.println("Index not have");
        return -1;
    }
    public static void main(String[] args) {
        Linear linear = new Linear();
        linear.ls(60);
    }

}
