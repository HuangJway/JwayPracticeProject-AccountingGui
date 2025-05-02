/**
 * @author chanway
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        boolean isFlag = true;
        int balance = 10000;
        String info = ""; //紀錄資訊
        while (isFlag) {
            Utility.printmenu();
            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("========Income and expenditure details========");
                    System.out.println("Type\t Balance\tIncomeAmount\tDetials");
                    System.out.println(info);
                    System.out.println("==============================================");
                    break;
                case '2':
                    System.out.println("Income amount ?");
                    int income = Utility.readNumber();
                    if (income > 0) balance += income;
                    System.out.println("Income type ?");
                    String incomeDesc = Utility.readString();

                    info += "Income\t " + balance + "\t\t" + income + "\t\t\t" + incomeDesc + "\n";

                    System.out.println("Register Complete");
                    break;
                case '3':
                    System.out.println("Expense amount ?");
                    int expenses = Utility.readNumber();
                    if (expenses > 0) balance -= expenses;
                    System.out.println("Expense type ?");
                    String expensesDesc = Utility.readString();

                    info += "Expense\t " + balance + "\t\t" + expenses + "\t\t\t" + expensesDesc + "\n";
                    System.out.println("Register Complete");

                    break;
                case '4':
                    System.out.println("Exit? Y/N");
                    char IsExit = Utility.readConfirmSelection();
                    if (IsExit == 'Y' || IsExit == 'y') isFlag = false;

            }
        }


    }
}
