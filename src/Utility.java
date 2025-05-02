import java.util.Scanner;
/**
 Utility工具類：
 將不同的功能封裝為方法，就是可以直接透過呼叫方法使用它的功能，而無需考慮具體的功能實現細節。
 */
public class Utility {
    private static Scanner scanner = new Scanner(System.in);

    /**
     用於介面選單的選擇。該方法讀取鍵盤輸入，如果使用者輸入的是 '1'-'4' 中的任意字元，則方法返回。返回值為使用者輸入的字元。
     */
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("選擇錯誤，請重新輸入：");
            }
            else
                break;
        }
        return c;
    }

    /**
     用於收入和支出金額的輸入。該方法從鍵盤讀取一個不超過4位數長度的整數，並將其作為方法的返回值。
     */
    public static int readNumber() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(4);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("數字輸入錯誤，請重新輸入：");
            }
        }
        return n;
    }

    /**
     用於收入和支出說明的輸入。該方法從鍵盤讀取一個不超過8位長度的字串，並將其作為方法的返回值。
     */
    public static String readString() {
        String str = readKeyBoard(8);
        return str;
    }

    /**
     用於確認選擇的輸入。該方法從鍵盤讀取 'Y' 或 'N'，並將其作為方法的返回值。
     */
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("選擇錯誤，請重新輸入：");
            }
        }
        return c;
    }

    // 讀取鍵盤輸入的私有方法，限制長度並回傳輸入內容
    private static String readKeyBoard(int limit) {
        String line = "";

        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("輸入長度（不大於" + limit + "）錯誤，請重新輸入：");
                continue;
            }
            break;
        }

        return line;
    }


    public static void printmenu(){
        System.out.println("========AccountingSystem========");
        System.out.println("1.Income and expenditure details");
        System.out.println("2.Register income");
        System.out.println("3.Register expenses");
        System.out.println("4.Exit");
        System.out.println("================================");
    }
}
