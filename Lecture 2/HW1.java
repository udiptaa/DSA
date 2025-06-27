public class HW1 {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;

        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }

            int stars = 1;
            while (stars <= 2 * i - 1) {
                System.out.print("*");
                stars++;
            }

            System.out.println();
            i++;
        }
    }
}
