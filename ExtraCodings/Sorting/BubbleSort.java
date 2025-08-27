public class BubbleSort {
    public static void main(String[] args) {
        int arr[]= {1,5,3,7,2,6,8,9,4};
        for(int i=0;i<arr.length-1;i++){       //ye walal line ka matlab hua ki i ka value 1 5 3 7 2 6 8 9 tk jayeg
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
