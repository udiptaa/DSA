import java.util.Scanner;
public class D1c_Age {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age:");
        int age =sc.nextInt();
        if(age<10){
            System.out.println("You can not sit on front seat");
        }
        else if (age>=10 && age<16){
            System.out.println("You can sit on front seat but can't drive");
        } 
        else if(age>=16 &&age<18){
            System.out.println("You can sit on front seat and can drive with a learner's license");
        }
        else if(age>=18 && age<21){
            System.out.println("You can sit on front seat and can drive with a full license");
        }
        else{
            System.out.println("You can sit on front seat and drive any vehicle");
 }
    }
}
    

