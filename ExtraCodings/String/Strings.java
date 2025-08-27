
public class Strings {

    public static void main(String[] args) {
        // String name ="Udipta";
        // String fullName ="Udipta Kumar";
        // String sentence ="My name is Udipta";
        // System.out.println(name+"\n "+fullName+"\n"+sentence);

        // //user input 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String names = sc.next(); //ek word input lega sirf 
        // System.out.println("Your name is: "+names);
        // sc.nextLine(); // consume the leftover newline  is line ko ek bar comment out kr ke dekhna kya concept hai wo niche likha hua hai 
        // System.out.println("Enter your name again : ");
        // String namesFull = sc.nextLine(); //ek sentence para word sab input le sakta haai 
        // System.out.println("Your name is: "+namesFull);
//----------------------------------------------------------------------------------------------------------------
//CONCATINATION
//--------------
        // String a = "Tony ";
        // String b = "Stark";
        // String concat = a + b;
        // System.out.println(concat);

//LENGTH
        // System.out.println(concat.length());

//CHARAT
        // for (int i = 0; i < concat.length(); i++) {
        //     System.out.print(concat.charAt(i) + " ");
        // }
        // System.out.println();

// COMPARE STRING 
//s1>s2   :+ve
//s1==s2  :0
//s1<s2   :-ve

        // String name1 = "a";
        // String name2 = "A";
        // if (name1.compareTo(name2) == 0) {
        //     System.out.println("Strings are equal");
        // } else if (name1.compareTo(name2) > 0) {
        //     System.out.println(name2 + " comes before " + name1);
        // } else {
        //     System.out.println(name1 + " comes before " + name2);
        // }


//SUBSTRING
    String sent ="My name is Tom";   
    String nameHai =sent.substring(3,9); //begning index included and end ndex excluded
    System.out.println(nameHai); 

    //last index tk print krrne ka method 1
    String NAME = sent.substring(2,sent.length());//-1 mat krna excluded hota hai end wala
    System.out.println(NAME);

    //last index tk print krne ka method 2 
    String LastTk = sent.substring(2);//2 se end tk
    System.out.println(LastTk);



    //Strings are immutable 


    }
}







//sc.next() reads only one word (up to the first space) and leaves the newline character (\n) in the input buffer.
// When you then call sc.nextLine(), it immediately consumes that leftover newline without waiting for user input, so namesFull becomes an empty string.
