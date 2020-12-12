import java.util.*;

public class pr37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("toStarShorthand()");
        String a7 = sc.nextLine();
        System.out.println("Result : " + toStarShorthand(a7));
        sc.close();
    }

    
    public static String toStarShorthand(String a) {
        int i = 1, count = 1;
        String res = "";
        while (i < a.length()) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                count++;
                if (a.length() - 1 == i) {
                    res += a.charAt(i) + "*" + count;
                    break;
                }
                else
                    i++;
            }
            else {
                if (count == 1) {
                    res += a.charAt(i - 1);
                    if (i == a.length() - 1) {
                        res += a.charAt(i);
                    }
                }
                else {
                    res += a.charAt(i - 1) + "*" + count;
                }
                count = 1;
                i++;
            }
        }
        return res;
    }
}
