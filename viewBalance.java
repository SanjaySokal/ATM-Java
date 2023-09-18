import java.util.Scanner;

public class viewBalance {
    public boolean getBalance(int[] accNum, boolean notExit, int pin) {
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
            checkpin checkpin = new checkpin();
            int count = 0;
            if (checkpin.checkPin(0, pin, count, sc)) {
                notExit = false;
            } else {
                notExit = true;
            }
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
        sc.close();
        return notExit;
    }
}
