import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        System.out.println("Hello world.");
        System.out.println("I'm testing ArrayList here.");
        System.out.println("ääääääkk");

        ArrayList<String> lista = new ArrayList<>();
        Scanner lukija = new Scanner(System.in, "UTF-8");

        lista.add("ensimmäinen");
        lista.add("toinen");

        String teksti = lukija.nextLine();
        System.out.println("kirjoitit: " + teksti);
        System.out.println("Syötä myös luku välillä 0-1");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötit luvun: " + luku);

        lukija.close();
    }
}
