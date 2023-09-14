import java.util.Scanner;

public class viewBalance {
    public boolean getBalance(int[] accNum, boolean notExit) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        try {
            input = sc.nextInt();
        } catch (Exception e) {
            System.out.println("please enter a valid input.");
        }
        if (input != 0) {
        } else {
            exitMessage exitMessage = new exitMessage();
            exitMessage.getExitMessage();
            notExit = false;
        }
        return notExit;
    }
}
