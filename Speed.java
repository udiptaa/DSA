//If speed is over 100km print overspeed
//If speed is under 100km print normal speed
public class Speed {
    public static void main(String[] args) {
        int speed = 120;
        if (speed > 100) {
            System.out.println("Overspeed");
        } else {
            System.out.println("Normal speed");
        }
    }
}
