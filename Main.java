import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To ATM Machine");
        System.out.println("Please Enter What You Want?");
        System.out.println("Press 0 to exit anytime.");
        System.out.println("1) View Balance         2) Cash Withdrawal");
        System.out.println("3) Change Pin           4) exit");
        boolean notExit = true;

        Scanner sc = new Scanner(System.in);

        int input = 0;

        int[] accNum = new int[4];
        int pin = 1234;

        for (int i = 0; i < accNum.length; i++) {
            accNum[i] = (int) (Math.random() * 1000000000);
        }

        try {
            input = sc.nextInt();
        } catch (Exception e) {
            System.out.println("please enter a valid input.");
            notExit = false;
        }

        if ((input > 0) && (input < 4)) {
            while (notExit) {
                if (input == 1) {
                    viewBalance viewBalance = new viewBalance();
                    notExit = viewBalance.getBalance(accNum, notExit, pin);
                }
            }
        } else {
            if (input > 4) {
                System.out.println("Sorry wrong input");
            }
            exitMessage exitMessage = new exitMessage();
            exitMessage.getExitMessage();
        }
        sc.close();
    }
}