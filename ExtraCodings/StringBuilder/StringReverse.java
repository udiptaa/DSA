
public class StringReverse {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("hello");
       for(int i=0;i<sb.length()/2;i++){
        int front =i;
        int back = sb.length()-i-1;//5-1-0
        char frontchar = sb.charAt(front);
        char backchar = sb.charAt(back);
                
        sb.setCharAt(back,frontchar);
        sb.setCharAt(front,backchar);

        System.out.println(sb);
       } 
    }
}
