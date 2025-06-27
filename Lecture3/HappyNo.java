import java.util.Scanner;
public class HappyNo {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a number: ")
    int n=sc.nextInt();
    int temp=0;
    for(int i=1;i<+1000;i++){
        int sum=0;

        while(n>0){
            sum+=(n%10)*(n%10);
            n=n/10;

        }
        if (sum==1){
            temp=1;
            break;
        }
    }n=sum;
     System.out.print(temp==1?"happy":"sad");

   

}