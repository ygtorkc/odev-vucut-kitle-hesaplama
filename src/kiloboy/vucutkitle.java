package kiloboy;
import java.util.Scanner;

public class vucutkitle {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        double kilo, boy ;

        System.out.println("Lütfen Kilonuzu Yazınız:");
         kilo = input.nextDouble();
        System.out.println("Lütfen Boyunuzu Yazınız:");
        boy = input.nextDouble();
        double endeks = (kilo/(boy*boy)) ;
        System.out.println("Vücut kitle endeksiniz:" +endeks );





    }
}
