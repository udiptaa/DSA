//FINDING ELEMENT IN ARRAY USING LINEAR SEARCH first index jahan wo element mile use likhna hai 
import java.util.Scanner;
public class ElementFound {
    public static void main(String[] args) {
        int arr[]= {1,2,3,62,63,6,8,3,62,6,8,5,85,75,33};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        LinearSearch(arr,target);
    }
    public static void LinearSearch(int arr[],int target){
        int temp=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target ){
                System.out.println("element is found at index "+i);
                temp=1;
                break;
            }else{
                temp=0;
            }

        } if(temp==0){
            System.out.println("element not found");
        }
    }
}
