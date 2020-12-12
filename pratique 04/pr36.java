import java.util.*;
public class pr36 {


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("bugger()");
    int a = sc.nextInt();
    System.out.println("Результат: " + bugger(a));
    sc.close();
}


    public static int bugger(int a) { 
        int count = 0;
        while (a >= 10) {
            int mlt = 1, mod;
            while (a != 0) {
                mod = a % 10;
                mlt *= mod;
                a = a / 10;
            }
            a = mlt;
            count++;
        }
        return count;
    } 
}
