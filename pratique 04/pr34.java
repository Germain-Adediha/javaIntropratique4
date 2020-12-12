import java.util.*;

public class pr34 {
    

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("overTime()");
                float[] a4 = new float[4];
                System.out.println("Введите начало рабочего дня:");
                a4[0] = in.nextFloat();
                System.out.println("Введите конец рабочего дня:");
                a4[1] = in.nextFloat();
                System.out.println("Введите почасовую ставку:");
                a4[2] = in.nextFloat();
                System.out.println("Введите множитель сверхурочных работ:");
                a4[3] = in.nextFloat();
                System.out.println("Результат: " + overTime(a4));
                in.close();
}
    
    public static String overTime(float[] array) { 
        float overtimeMorning = 0.0f, overtime = 0.0f;
        if (array[0] < 9) {
            overtimeMorning = 9.0f - array[0];
        }
        if (array[1] > 17) {
            overtime = (array[1] - 17.0f) + overtimeMorning;
        }
        float result = (array[1] - array[0] - overtime) * array[2] + overtime * array[2] * array[3];
        String res = String.valueOf(result);
        res += "00";
        res = res.substring(0, res.indexOf(".") + 3);
        return "$" + res;
    }
}
