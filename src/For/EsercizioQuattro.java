package For;

import java.util.Scanner;

public class EsercizioQuattro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero per cronometro");
        int number = Integer.parseInt(scanner.nextLine());
        int number1 = number;
        for (int i = 0; i < number1; i++) {
            System.out.println(number = number - 1);
        }


    }
}
