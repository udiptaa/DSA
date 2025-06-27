// Question:
// Write a Java program using a while loop to print the following pattern:
//
// * * * * *
// * * * *
// * * *
// * *
// *
//
// 

public class HW2 {
    public static void main(String[] args) {
        int n = 5; 
        int i = n;

        while (i >= 1) {  
            int j = 1;
            while (j <= i) {  
                System.out.print("* ");
                j++;
            }
            System.out.println();  
            i--;
        }
    }
}
