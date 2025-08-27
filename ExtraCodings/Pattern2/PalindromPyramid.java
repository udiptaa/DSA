//Ye important wala question hai socho or print kro


// package Pattern2;
public class PalindromPyramid {
    public static void main(String[] args) {
        int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     int j=1;
        //         int val =(n-(n-i));
        //         while(val!=0 && j<=i){
        //         System.out.print(val+" ");
        //         val=val-1;
        //         j++;
        //     }
        //     for(int k=0;k<i-1;k++){
        //         System.out.print((k+2)+" ");
        //     }
        //     System.out.println();
           
        // }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }



    }
}




