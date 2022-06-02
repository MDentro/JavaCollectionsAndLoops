package nl.novi;

import java.util.HashMap;

public class Translator {
    private HashMap<Integer, String> numericAlpa = new HashMap<>();

    public Translator(int[] numeric, String[] alphabetic) {
        for (int i = 0; i < alphabetic.length; i++) {
            numericAlpa.put(numeric[i], alphabetic[i]);
        }
    }

    public void translate(Integer number) {
        String result = numericAlpa.get(number);
        System.out.println("De vertaling van " + number + " is " + result + ".");
    }
}
