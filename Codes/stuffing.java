import java.util.*;

public class stuffing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String target = in.nextLine();
        String ans = stuff(target, '<', '>', '!');
        System.out.println(ans);
        ans = unstuff(ans, '<', '>', '!');
        System.out.println(ans);
    }
        
    static String stuff(String targetString, char SOF, char EOF, char esc) {
        StringBuilder stuffedString = new StringBuilder("");
        for (int i = 0; i < targetString.length(); i++) {
            if (targetString.charAt(i) == SOF || targetString.charAt(i) == EOF) {
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
        while(i < targetString.length())
        {
            if(targetString.charAt(i) == esc)
            {   
                i++;
                unstuffedString.append(targetString.charAt(i));
                // System.out.println("1 " + unstuffedString);
            }
            else
            {
                unstuffedString.append(targetString.charAt(i));
                // System.out.println("2 " + unstuffedString);
            }
            i++;
        }
        return unstuffedString.deleteCharAt(0).deleteCharAt(unstuffedString.length() - 1).toString();
    }
}