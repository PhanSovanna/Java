import java.text.DecimalFormat;
import java.util.Scanner;

public class b_Percentage_Calculator {
    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        number = s.nextInt();
        double result = number/100.0;
        String format_result = new DecimalFormat("##.##").format(result);
        System.out.println(format_result);
    }
}
