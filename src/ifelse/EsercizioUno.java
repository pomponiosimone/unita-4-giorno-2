package ifelse;

import java.util.Scanner;

public class EsercizioUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // esercizio pari dispari
        System.out.println("Inserisci una stringa:");
        String str1 = scanner.nextLine();
        boolean stringResult = stringaPariDispari(str1);


        // esercizio anno bisestile
        System.out.println("Inserisci un anno:");
        int anno = scanner.nextInt();
        boolean annoResult = annoBisestile(anno);
        if (annoResult) {
            System.out.println(anno + " è un anno bisestile.");
        } else {
            System.out.println(anno + " non è un anno bisestile.");
        }
    }

    public static boolean stringaPariDispari(String str1) {
        return str1.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
    }
}