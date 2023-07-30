import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        int[] arrey = {10, 20, 20, 10, 10, 20, 5, 20};

        HashMap <Integer, Integer> frequencies = new HashMap<>();

        // Dizideki elemanların frekanslarını hesaplayalaım.
        for (int element : arrey) {
            if (frequencies.containsKey(element)) {
                int frequency = frequencies.get(element);
                frequencies.put(element, frequency + 1);
            } else {
                frequencies.put(element, 1);
            }
        }

        // Frekansları ekrana yazdıralım.
        for (int element : frequencies.keySet()) {
            int frequency = frequencies.get(element);
            System.out.println(element + " sayısı " + frequency + " kere tekar edildi. ");
        }
    }
}