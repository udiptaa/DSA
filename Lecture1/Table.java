public class Table {
    public static void main(String[] args){
        int t=2;
        while(t<=5){
            int i = 1;
            while(i <= 10) {
                System.out.print( (t * i) + " "); 
                i++;
            }System.out.println();
            t++;
        }
    }
}
