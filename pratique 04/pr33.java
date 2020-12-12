import java.util.*;

public class pr33 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("for toCamelCase() enter 1");
                System.out.println("for toSnakeCase() enter  2");
                int n3 = in.nextInt();
                if (n3 == 1) {
                    System.out.println("toCamelCase()");
                    System.out.println(" Enter the string ");
                    String a3 = sc.nextLine();
                    System.out.println(" Result : " + toCamelCase(a3));
                }
                else if (n3 == 2) {
                    System.out.println("toSnakeCase()");
                    String a3 = sc.nextLine();
                    System.out.println("Result : " + toSnakeCase(a3));
                }
                in.close();
                sc.close();
    }


    public static String toCamelCase(String a) {
        while (a.contains("_")) {
            int find = a.indexOf("_");
            if (find == 0) {
                a = a.substring(1);
            }
            else if (find < a.length() - 2) {
                a = a.substring(0, find) + a.substring(find+1, find + 2).toUpperCase() + a.substring(find + 2);
            }
            else if (find < a.length() - 1) {
                a = a.substring(0, find) + a.substring(find+1, find + 2).toUpperCase();
            }
            else if (find < a.length()) {
                a = a.substring(0, find);
            }
        }
        return a;
    }

    public static String toSnakeCase(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                if (i == 0) {
                    a = a.substring(0, 1).toLowerCase() + a.substring(1);
                }
                else if (i < a.length() - 1) {
                    a = a.substring(0, i) + "_" + a.substring(i, i + 1).toLowerCase() + a.substring(i + 1);
                }
                else {
                    a = a.substring(0, i) + "_" + a.substring(i).toLowerCase();
                }
            }
        }
        return a;
    }
}
