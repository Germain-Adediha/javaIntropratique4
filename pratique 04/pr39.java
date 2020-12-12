import java.util.*;
public class pr39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("trouble()");
                System.out.println("Enter the first number :");
                String a9 = sc.nextLine();
                System.out.println("Enter the second number :");
                String b9 = sc.nextLine();
                System.out.println("Result : " + trouble(a9, b9));
                sc.close();
    }
    public static boolean trouble(String a, String b) { 
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        boolean result = false;
        int[] num1 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 1; i < aChar.length; i++) {
            if (aChar[i] == aChar[i-1]) {
                num1[Character.getNumericValue(aChar[i])] += 1;
            }
        }
        for (int i = 1; i < bChar.length; i++) {
            if (bChar[i] == bChar[i-1]) {
                num2[Character.getNumericValue(bChar[i])] += 1;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (num1[i] == 2 && num2[i] == 1) {
                result = true;
                break;
            }
        }
        return result;
    }
}
