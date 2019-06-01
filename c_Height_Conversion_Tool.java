import java.text.DecimalFormat;
import java.util.Scanner;

public class c_Height_Conversion_Tool {
    public static void main(String[] args) {
        double km;
        double mile;
        System.out.print("Enter a number(Kilometer):");
        Scanner s = new Scanner(System.in);
        km = s.nextDouble();
        mile = km / 1.609;
        String format_result = new DecimalFormat("##.##").format(mile);
        String format_kilometer = new DecimalFormat("##.##").format(km);
        System.out.println(format_kilometer+"kilometre is " + format_result + " miles");
    }
}
