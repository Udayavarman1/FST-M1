import java.lang.reflect.Array;
import java.util.Arrays;

public class Activity2 {

    public static void main (String[] args){
        int[] num = {10, 77, 10, 54, -11, 10};
        System.out.println("original Array: " + Arrays.toString(num));
        int findNum = 10;
        int sumNum = 30;
    }

    public static boolean result(int[] numbers, int findNum, int sumNum) {
        int tempNum = 0;
        for (int number : numbers) {
            if (number == findNum) {
                tempNum += findNum;
            }
            if (tempNum > sumNum) {
                break;
            }

        }
        return tempNum == sumNum;

    }
}
