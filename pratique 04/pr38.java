import java.util.*;
public class pr38 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("doesRhyme()");
    System.out.println("First string:");
    String a8 = sc.nextLine();
    System.out.println("Second string:");
    String b8 = sc.nextLine();
    System.out.println("Result : " + doesRhyme(a8, b8));
    sc.close();
}
    public static boolean doesRhyme(String s, String s2) { 
        String c = "";
        String k = "";
        int a = s.lastIndexOf(" ");
        int b = s2.lastIndexOf(" ");
        String subs = s.substring(a);
        String subs2 = s2.substring(b);
        for (char l:subs.toCharArray()) {
            if ((l=='a')||(l=='e')||(l=='i')||(l=='o')||(l=='u')||(l=='y')||(l=='A')||(l=='E')||(l=='I')||(l=='O')||(l=='U')||(l=='Y')){
                c += l;
            }
        }
        for (char l:subs2.toCharArray()){
            if ((l=='a')||(l=='e')||(l=='i')||(l=='o')||(l=='u')||(l=='y')||(l=='A')||(l=='E')||(l=='I')||(l=='O')||(l=='U')||(l=='Y')){
                k += l;
            }
        }
        return c.equalsIgnoreCase(k);
    }
}
