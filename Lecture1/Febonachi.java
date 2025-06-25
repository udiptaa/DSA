public class Febonachi {
    public static void main(String[] args) {
        int i=0,j=1,n=1;
        System.out.print(i + " "+j + " ");
        while(n<=13){
            int k=i+j;
            System.out.print(k + " ");
            i=j;
            j=k;
            n++;

        }
        
    }
}
