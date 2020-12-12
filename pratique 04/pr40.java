import java.util.*;

public class pr40 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("countUniqueBooks()");
    System.out.println("Enter string:");
    String a = sc.nextLine();
    System.out.println("Enter symbol:");
    String b = sc.nextLine();
    System.out.println("Result : " + countUniqueBooks(a, b));
    sc.close();
}


    public static int countUniqueBooks(String a, String b) { 
        if (b.length() == 1) {
            String partA = a;
            String[] parts = new String[0];
            while (partA.length() != 0) {
                int beginPart = partA.indexOf(b);
                if (beginPart == -1) {
                    break;
                }
                partA = partA.substring(beginPart + 1);
                int endPart = partA.indexOf(b);
                parts = Arrays.copyOf(parts, parts.length + 1);
                parts[parts.length - 1] = partA.substring(0, endPart);
                partA = partA.substring(endPart + 1);
            }
            String resStr = "";
            for (String i: parts) {
                resStr += i;
            }
            String lowerRes = resStr.toLowerCase();
            boolean[] isItThere = new boolean[Character.MAX_VALUE];
            for (int i = 0; i < lowerRes.length(); i++) {
                isItThere[lowerRes.charAt(i)] = true;
            }
            int count = 0;
            for (boolean value: isItThere) {
                if (value) {
                    count++;
                }
            }
            return count;
        }
        else {
            return -1;
        }
    }
 
}
