import java.util.*;
public class   pr31 {
    
public static void main(String[] args) {
    Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
    Scanner sc = new Scanner(System.in);
                System.out.println("Value of N = ");
                int n1 = in.nextInt();
                System.out.println("Value of K = ");
                int k1 = in.nextInt();
                System.out.println("Enter the essay :");
                String c1 = sc.nextLine();
                essay(n1, k1, c1);
                in.close();
                sc.close();
}

public static int isSpace(String a, String b) { 
    String withSpaces = a + " " + b;
    int count = 0;
    for (int i = 0; i < withSpaces.length(); i++) {
        char c = withSpaces.charAt(i);
        if (c == ' ') {
            count++;
        }
    }
    return withSpaces.length() - count;
}

public static void essay(int n, int k, String str) {
    String[] arrStr = str.split(" ");
    for (int i = 1; i < n; i++) {
        if (isSpace(arrStr[i-1], arrStr[i]) <= k) {
            arrStr[i] = arrStr[i-1] + " " + arrStr[i];
            arrStr[i-1] = "";
        }
    }
    for (int i = 0; i < n; i++) {
        if (arrStr[i].length() > 0) {
            System.out.println(arrStr[i]);
        }
    }
}

}