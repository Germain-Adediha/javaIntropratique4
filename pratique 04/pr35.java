import java.util.*;
public class pr35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BMI()");
        System.out.println("Enter weight:");
        String a5 = sc.nextLine();
        System.out.println("Enter growth:");
        String b5 = sc.nextLine();
        System.out.println("Result : " + BMI(a5, b5));
        sc.close();

    }
    public static String BMI(String a, String b) { 
        a = a.trim();
        b = b.trim();
        int indexA = a.indexOf(' ');
        int indexB = b.indexOf(' ');
        String weightStr = a.substring(0, indexA);
        String weightStep = a.substring(indexA + 1);
        String heightStr = b.substring(0, indexB);
        String heightStep = b.substring(indexB + 1);
        float weight = Float.parseFloat(weightStr);
        float height = Float.parseFloat(heightStr);
        if (weightStep.contains("pounds")) {
            weight /= (2.205f);
        }
        if (heightStep.contains("inches")) {
            height /= (39.37f);
        }
        if (!(weightStep.contains("kilos") || weightStep.contains("pounds"))) {
            return "incorrect input";
        }
        else if (!(heightStep.contains("meters") || heightStep.contains("inches"))) {
            return "incorrect input";
        }
        else {
            String resConclusion;
            double bmi = weight / (height * height);
            if (bmi < 18.5) {
                resConclusion = " Underweight";
            }
            else if (bmi < 25) {
                resConclusion = " Normal weight ";
            }
            else {
                resConclusion = " Overweight";
            }
            String res = String.valueOf(bmi);
            res += "00";
            res = res.substring(0, res.indexOf(".") + 2);
            return res + resConclusion;
        }
    }
}
