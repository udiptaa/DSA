// Question:
// Write a Java program using while loops to print 
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

public class HW3 {
    public static void main(String[] args) {
        int n = 5;  
        int i = 1;

   
        while (i <= n) {
            int space = 1;
            while (space <= n - i) {
                System.out.print(" ");
                space++;
            }

            int star = 1;
            while (star <= 2 * i - 1) {
                System.out.print("*");
                star++;
            }

            System.out.println();
            i++;
        }

       
        i = n - 1;
        while (i >= 1) {
            int space = 1;
            while (space <= n - i) {
                System.out.print(" ");
                space++;
            }

            int star = 1;
            while (star <= 2 * i - 1) {
                System.out.print("*");
                star++;
            }

            System.out.println();
            i--;
        }
    }
}
