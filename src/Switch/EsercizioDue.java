package Switch;

import java.util.Scanner;

public class EsercizioDue {
    public static void main(String[] args) {
        //switch case
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int num = Integer.parseInt(scanner.nextLine());
        switch (num) {
            case 0:
                System.out.println("zero");
                break;

            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println(" Errore hai inserito un numero maggiore di 3");
        }
    }
}