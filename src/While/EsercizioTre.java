package While;

import java.util.Scanner;

public class EsercizioTre {
    public static void main(String[] args) {
        // while
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String str1 = scanner.nextLine();
        int i = 0;
        while (i < str1.length() && (str1.contains(":q"))) {
            System.out.println(str1.charAt(i) + ",");
            i++;
        }
    }
}
