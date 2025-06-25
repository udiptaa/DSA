public class VisaAmount {
    public static void main(String args[]){
        double amount= 60000;
        char visa= 'A';

        if(visa=='A'){
            if(amount>=100000){
                System.out.println("Ultra rich");
            }
            else if(amount<100000 && amount>=50000){
                System.out.println("Rich");
            }
        }
        else {
            if(amount>=100000){
                System.out.println("Rich");
            }
            else if(amount<100000 && amount>=50000){
                System.out.println("Middle Class");
            }
            else{
                System.out.println("avg");
            }
        }
    }
}