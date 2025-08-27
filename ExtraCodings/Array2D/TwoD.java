// package Array2D;
import java.util.Scanner;
public class TwoD {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter row and column : ");
    int row=sc.nextInt();
    int col = sc.nextInt();
    int arr[][]=new int[row][col];
    System.out.println("Enter elements of array: ");
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        arr[i][j]=sc.nextInt();
      }System.out.println();
    }


    System.out.println("Array is: ");
     for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }

    System.out.println( "Enter target element: ");
    int num = sc.nextInt();
    SearchElement(arr,num);

  }  

       //Searching elements 

       public static void SearchElement(int arr[][],int target){
        int temp=0;
        for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==target){
              System.out.println("["+i+"]"+"["+j+"]");temp=1;
              break;
        }
      }
        
    }if (temp==0){
      System.out.println("Element not found.");
    }
       }
}
