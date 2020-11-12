import java.util.Scanner;

public class Utility {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Get the user´s selection, only the number 1-4 can accepted
     * @return selection The user´s selection
     */
    public static int getMenuSelection() {
        int selection;
        while (true) {
            String input = getInput(1);
            try {
                selection = Integer.parseInt(input.charAt(0) + "");
            } catch (Exception e) {
                System.out.print("          False input, please input again: ");
                continue;
            }
            if (selection != 1 && selection != 2 && selection != 3 && selection != 4) {
                System.out.print("          False selection, please input again: ");
            } else {
                break;
            }
        }
        return selection;
    }

    /**
     * Used for input of income and expenditure amount
     * @return number The input of income and expenditure amount
     */
    public static int readNumber() {
        int number;
        while (true) {
            String input = getInput(4);
            try {
                number = Integer.parseInt(input);
                break;
            } catch (Exception e) {
                System.out.print("          False input, please input again: ");
            }
        }
        return number;
    }

    /**
     * Used for input of description
     * @return The input of description
     */
    public static String readString() {
        return getInput(20);
    }

    /**
     * User for confirm the selection, only "Y" and "N" is allowed
     * @return selection The selection
     */
    public static char getConfirmSelection() {
        char selection;
        while (true) {
            String input = getInput(1).toLowerCase();
            selection = input.charAt(0);
            if (selection == 'y' || selection == 'n') {
                break;
            } else {
                System.out.print("          False selection, please input again: ");
            }
        }
        return selection;
    }

    /**
     * Get the user´s input
     * @param lengthOfInput Allowed length of the input
     * @return input The user´s input
     */
    private static String getInput(int lengthOfInput) {
        String input;
        for (;;) {
            input = scanner.next();
            if (input.length() > lengthOfInput) {
                System.out.print("          False input, please input a value not longer than " + lengthOfInput + ": ");
            } else {
                break;
            }
        }
        return input;
    }
}
