package nl.novi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};
        Boolean play = true;
        String ongeldig = "Ongeldige invoer";

        Translator translate = new Translator(numeric, alphabetic);
        Scanner scannerInput = new Scanner(System.in);
        Scanner scannerNumber = new Scanner(System.in);

        while (play) {
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scannerInput.nextLine();

            if (input.equalsIgnoreCase("x")) {
                play = false;
            } else if (input.equalsIgnoreCase("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = scannerNumber.nextInt();
                if (number < 10) {
                    translate.translate(number);
                } else {
                    System.out.println(ongeldig);
                }
            } else {
                System.out.println(ongeldig);
            }
        }
    }
}
