import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //these are primitive types
        byte age = 30;
        long viewsCount = 456_789L;
        float price = 10.99F;
        double sum = price + viewsCount;
        char letter = 'A';
        boolean isEligible = false;

        //these are reference types
        Date now = new Date();
//        System.out.println(now);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 3;
//        System.out.println(point2);
        String message = "Hello World";

//        System.out.println(message.endsWith("d"));
//        arrays
        int[] numbers = {2, 4, 6, 2, 6};
        Arrays.sort(numbers);

//        System.out.println(Arrays.toString(numbers));

        int [][] matrix = {{1, 2, 3}, {4, 5, 6}};

//        System.out.println(Arrays.deepToString(matrix));
        final float PI  = 3.14F;

        String num = "1";
        int result = Integer.parseInt(num) + 2;

        String anotherNum = "1.2";
        double anotherResult = Double.parseDouble(anotherNum) + 3;
        System.out.println(anotherResult);
    }
}