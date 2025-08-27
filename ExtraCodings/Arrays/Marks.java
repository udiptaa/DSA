import java.util.Scanner;
public class Marks{
    public static void main(String[] args) {
        int marks[]= new int [5];
        marks[0]=95;
        marks[1]=97;
        marks[2]=98;
        marks[3]=95;
        marks[4]=90;

        // System.out.println(marks);  //memory addres dega hexadecimal and hash ke mixture me 
        System.out.println(marks[0]+" "+marks[1]+" "+marks[2]);
        System.out.println("---------");
        // method 2
        for(int i=0;i<5;i++){
            System.out.println(marks[i]);

        }

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size");
            int n= sc.nextInt();
            int arrayhai[]=new int [n];
            System.out.println("Enter elements: ");
            for(int j=0;j<n;j++){
                arrayhai[j]=sc.nextInt();
            }
            System.out.println("______________________");
            for (int idx = 0; idx < arrayhai.length; idx++) {  //use to find size of array
                System.out.print(arrayhai[idx]+" ");
                
            }
            System.out.println("\n----------------------");
        
    }
}