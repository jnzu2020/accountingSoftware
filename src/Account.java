public class Account {
    public static void main(String[] args) {
        boolean isExit = false;

        String details = "Type\tTotal\tAmount\tDescription\n";
        // Initial total amount
        int balance = 10000;
        details += ("Initial\t" + balance + "\n");

        while (!isExit) {
            System.out.println("----------Account Software----------\n");
            System.out.println("          1 Details");
            System.out.println("          2 Enter income");
            System.out.println("          3 Enter expenditure");
            System.out.println("          4 Exit\n");
            System.out.print("          Please select (1-4): ");

            // get the user´s selection: 1-4
            int menuSelection = Utility.getMenuSelection();
            switch (menuSelection) {
                case 1:
                    System.out.println("----------Record details----------");
                    System.out.println(details);
                    System.out.println("----------------------------------");
                    break;
                case 2:
                    System.out.print("          Please input the amount of income: ");
                    int income = Utility.readNumber();
                    System.out.print("          Please input the description: ");
                    String descriptionOfIncome = Utility.readString();
                    // process the balance
                    balance += income;
                    // process the details
                    details += ("In.\t\t" + balance + "\t" + income + "\t\t" + descriptionOfIncome + "\n");
                    System.out.print("----------Record successful----------\n");
                    break;
                case 3:
                    System.out.print("          Please input the amount of expenditure: ");
                    int expenditure = Utility.readNumber();
                    System.out.print("          Please input the description: ");
                    String descriptionOfExpenditure = Utility.readString();
                    // process the balance
                    if (balance >= expenditure) {
                        balance -= expenditure;
                        // process the details
                        details += ("Ex.\t\t" + balance + "\t" + expenditure + "\t\t" + descriptionOfExpenditure + "\n");
                        System.out.print("----------Expenditure successful----------\n");
                    } else {
                        System.out.print("----------Insufficient account balance, expenditure isn't successful----------\n");
                    }
                    break;
                case 4:
                    System.out.print("          Do you want to exit? (Y/N): ");
                    char confirmSelection = Utility.getConfirmSelection();
                    if (confirmSelection == 'y') {
                        isExit = true;
                    }
            }
        }
    }
}
