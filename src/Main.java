/*Maps
        Exercise: Map
        Define a testing class with a main() method where you:
        create an HashMap that maps the numbers from 1 to 5 with their respective English names
        create an HashMap that maps the odd number from 1 to 9 with their respective Italian names
        merge (without using merge()) the second hashmap into the first one (duplicate keys' values are overwritten in the first HashMap)
        print the modified firstHashMap
        print on screen the value of the keys 5, 6, 7, 8 and 9
        if there's no mapping for a specific key, print No associated value*/

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> oneToFiveNumbers = new HashMap<>();
        oneToFiveNumbers.put(1, "one");
        oneToFiveNumbers.put(2, "two");
        oneToFiveNumbers.put(3, "three");
        oneToFiveNumbers.put(4, "four");
        oneToFiveNumbers.put(5, "five");

        Map<Integer, String> oddNumbers = new HashMap<>();
        oddNumbers.put(1, "uno");
        oddNumbers.put(3, "tre");
        oddNumbers.put(5, "cinque");
        oddNumbers.put(7, "sette");
        oddNumbers.put(9, "nove");

        oneToFiveNumbers.putAll(oddNumbers);
        System.out.println(oneToFiveNumbers);

        for(int i = 5; i <= 9; i++){
            String value = oneToFiveNumbers.getOrDefault(i, "No associated value");
            System.out.println(value);
        }
    }
}