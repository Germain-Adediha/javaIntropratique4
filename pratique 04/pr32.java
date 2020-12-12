import java.util.*;

public class pr32 {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
                System.out.println("Введите строку:");
                String a2 = sc.nextLine();
                String[] b2 = splitBkt(a2);
                System.out.println("Результат:");
                for (String s : b2) {
                    System.out.println(s);
                }
                sc.close();
}

public static String[] splitBkt(String a) { 
    boolean checkBkt = true;
    char[] aArray = a.toCharArray();
    String[] resArray = new String[0];
    for (char i : aArray) {
        if (!(i == (int) '(' || i == (int) ')')) {
            checkBkt = false;
            break;
        }
    }
    if (checkBkt) {
        int count0 = 0, count1 = 0, preI = 0;
        for (int i = 0; i < aArray.length-1; i++) {
            if (aArray[i] == '(') count0++;
            if (aArray[i] == ')') count1++;
            if (count0 == count1) {
                resArray = Arrays.copyOf(resArray, resArray.length + 1);
                resArray[resArray.length - 1] = a.substring(preI, i+1);
                preI = i + 1;
            }
        }
        resArray = Arrays.copyOf(resArray, resArray.length + 1);
        resArray[resArray.length - 1] = a.substring(preI);
    }
    return resArray;
}

    
}
