import java.util.Scanner;

public class ScannerLoopPrint {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Write numbers to sum up: (0 to stop)");
        int summa = 0;
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            }
            summa += luku;
        }
        System.out.println("Sum of values is: " + summa);
        System.out.println("");
    
    }
}
