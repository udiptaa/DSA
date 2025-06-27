// Question:
// Write a Java program using while loops to print 
// 1
// 12
// 123
// 1234
// 12345

public class NumPatternHW{
    public static void main(String[] args) {
        int n = 5;  
        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
