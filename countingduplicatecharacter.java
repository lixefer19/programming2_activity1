package activity1;
import java.util.List;
import java.util.ArrayList;
public class countingduplicatecharacter {



    private static List chars = new ArrayList();

    public static void main(String[] args) {
        System.out.println("---------Input 1 ------");
        printCountOfDuplicateCharacter("MoonsMoons");
        System.out.println("---------Input 2 ------");
        printCountOfDuplicateCharacter("aaaabbbcccccdddddd");

    }

    // print count of each character in a given string.
    private static void printCountOfDuplicateCharacter(String input) {

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (isProcessedChar(ch))
                continue;

            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (ch == input.charAt(j)) {
                    count++;
                }
            }
            System.out.println(ch + " : " + count);
        }
        chars.clear();
    }

    // checking whether the given char is already processed or not.
    private static boolean isProcessedChar(char ch) {

        if (chars.contains(Character.toString(ch))) {
            return true;
        } else {
            chars.add(Character.toString(ch));
        }
        return false;
    }
 }


