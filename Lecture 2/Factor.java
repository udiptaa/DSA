// wap to find factor 
import java.util.Scanner;
public class Factor {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter number to find factor: ");
    int num=sc.nextInt();
    int fact=2;
    while(num>1){
        if(num%fact==0){
            System.out.print(" "+fact+ " "+"|");
            num=num/fact;
        }
        else{
            fact++;
        }
    
    }
  }  
}
