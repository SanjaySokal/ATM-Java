import java.util.Scanner;

public class viewBalance {
    public boolean getBalance(int[] accNum, boolean notExit, int[] pin) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        System.out.println("Please select your account number");

        for (int i = 0; i < accNum.length; i++) {
            System.out.println((i + 1) + " : " + accNum[i]);
        }
        System.out.println("----------");

        try {
            input = sc.nextInt();
        } catch (Exception e) {
            System.out.println("please enter a valid input.");
        }
        if ((input > 0) && (input < 4)) {
            System.out.println("please enter 4 digit pin");
            System.out.println("please enter 4 digit pin");
            for (int i = 0; i < pin.length; i++) {
                System.out.print(pin[i] + " ");
            }
            System.out.println();
            notExit = false;
        } else {
            if (input > 4) {
                System.out.println("Sorry wrong input. Please start again");
                notExit = true;
            } else {
                exitMessage exitMessage = new exitMessage();
                exitMessage.getExitMessage();
                notExit = false;
            }
        }
        return notExit;
    }
}
