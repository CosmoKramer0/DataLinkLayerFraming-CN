import java.util.*;

public class stuffed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 if you want to continue\nEnter 0 to exit");
        int choice = in.nextInt();
        in.nextLine();
        while (choice == 1) {
            switch (choice) {
                case 1:
                    System.out.println("Enter the data you want to send :");
                    String data = in.nextLine();
                    System.out.println("_________________");
                    String ans = stuff(data, '<', '>', '!');
                    System.out.println("/nStuffed Data: ");
                    System.out.println(ans);
                    System.out.println("_________________");
                    System.out.println("/nUnstuffed Data: ");
                    ans = unstuff(ans, '<', '>', '!');
                    System.out.println(ans);
                    System.out.println("Enter 1 if you want to continue\nEnter 0 to exit");
                    choice = in.nextInt();
                    in.nextLine();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    static String stuff(String targetString, char SOF, char EOF, char esc) {
        StringBuilder stuffedString = new StringBuilder("");
        for (int i = 0; i < targetString.length(); i++) {
            if (targetString.charAt(i) == SOF || targetString.charAt(i) == EOF) {
                stuffedString.append(esc).append(targetString.charAt(i));
            } else if (targetString.charAt(i) == esc) {
                stuffedString.append(esc).append(targetString.charAt(i));
            } else {
                stuffedString.append(targetString.charAt(i));
            }
        }
        return SOF + stuffedString.toString() + EOF;
    }

    static String unstuff(String targetString, char SOF, char EOF, char esc) {
        StringBuilder unstuffedString = new StringBuilder("");
        // System.out.println(targetString.charAt(0));
        int i = 0;
        while (i < targetString.length()) {
            if (targetString.charAt(i) == esc) {
                i++;
                unstuffedString.append(targetString.charAt(i));
                // System.out.println("1 " + unstuffedString);
            } else {
                unstuffedString.append(targetString.charAt(i));
                // System.out.println("2 " + unstuffedString);
            }
            i++;
        }
        return unstuffedString.deleteCharAt(0).deleteCharAt(unstuffedString.length() - 1).toString();
    }
}