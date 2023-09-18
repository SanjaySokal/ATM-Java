import java.util.Scanner;

public class checkpin {
    public boolean checkPin(int uPin, int pin, int count, Scanner sc) {
        if (count == 0) {
            System.out.println("please enter 4 digit pin");
        } else if (count == 1) {
            System.out.println("you have entered a wrong pin please try again");
        } else {
            return false;
        }
        System.out.println("Example pin is " + pin);
        countDigit countDigit = new countDigit();
        try {
            uPin = sc.nextInt();
        } catch (Exception e) {
            System.out.println("please enter a valid input.");
        }
        if (countDigit.countDigits(uPin) != 4) {
            count++;
            checkPin(uPin, pin, count, sc);
        } else {
            if (uPin == pin) {
                return false;
            } else {
                count++;
                checkPin(uPin, pin, count, sc);
            }
        }
        return false;
    }
}
