import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no to find factorial: ");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid no.");
        }
        else
            System.out.println(Fact(n));
    }
    public static int Fact(int num){
        
        if (num==0||num==1)return 1;
        else {
            int prod=1;
            while(num!=1){
                prod*=num;
                num--;
            }
            return prod;
        }
    }
}
