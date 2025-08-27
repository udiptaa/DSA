public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");

        //charAt Index 
        System.out.println(sb.charAt(0));

        //Set char at index
        sb.setCharAt(0,'p');
        System.out.println(sb);

        //Insert 
        sb.insert(0,'S');
        System.out.println(sb);
        sb.insert(2,'n');
        System.out.println(sb);

        //Deleting from string builder 
        sb.delete(2,3);
        System.out.println(sb);

        sb.delete(2,3);
        System.out.println(sb);


        //appending in sb at end 
        sb.append("e");
        sb.append("y");
        sb.append("e");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
