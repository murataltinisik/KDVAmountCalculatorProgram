import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // VARIABLES
        String message;
        double amount, kdvAmount, totalAmount, kdvRatio = 0.18;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("Lütfen Ücret Tutarını Giriniz:");
        amount = sc.nextDouble();

        if(amount > 0 && amount < 1000){
            kdvRatio = 0.18;
        }else{
            kdvRatio = 0.08;
        }

        kdvAmount = amount * kdvRatio;
        totalAmount = amount + kdvAmount;

        message = "Toplam Tutar: " + totalAmount + "\n" + "KDV Oranı: " + kdvRatio;

        // END
        System.out.println(message);

    }
}
