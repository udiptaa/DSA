// package Function;
import java.util.*;
public class NamePrintFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name please: ");
        String name =sc.nextLine();
        print(name);
    }
    public static void print(String name){
        System.out.println("Your name is "+name+" Kumar");
    }
}
