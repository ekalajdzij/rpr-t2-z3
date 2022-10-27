package ba.unsa.etf.rpr;
import java.util.*;
import java.util.Scanner;

public class Main {
    private static Integer stringuInt(String silir) {
        try {
            return Integer.parseInt(silir);
        } catch (NumberFormatException error) {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("Unosite elemente liste (stop za kraj): ");
        Scanner in = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();
        int broj = 0;
        while (true) {
            String slovo_rijec = in.next();
            if ("stop".equalsIgnoreCase(slovo_rijec))
                break;
            if (stringuInt(slovo_rijec) == null)
                continue;
            else {
                broj = stringuInt(slovo_rijec);
                lista.add(broj);
            }
        }
        System.out.println("Najveci element u listi je: " + Collections.max(lista) + "\nNajmanji element u listi je: " + Collections.min(lista));
        System.out.println("Srednja vrijednost elemenata u listi je: "+ klasaZaMetode.srednjaVrijednost(lista));
        System.out.println("Standardna devijacija elemenata u listi je: "+ klasaZaMetode.standardnaDevijacija(lista));

    }
}

