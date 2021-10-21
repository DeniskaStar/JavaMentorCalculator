import java.util.Collections;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

public class RomanTranslate {

    public static void romanToArab(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            switch (list.get(i)) {
                case ("I") -> list.set(i, "1");
                case ("II") -> list.set(i, "2");
                case ("III") -> list.set(i, "3");
                case ("IV") -> list.set(i, "4");
                case ("V") -> list.set(i, "5");
                case ("VI") -> list.set(i, "6");
                case ("VII") -> list.set(i, "7");
                case ("VIII") -> list.set(i, "8");
                case ("IX") -> list.set(i, "9");
                case ("X") -> list.set(i, "10");
            }
        }
    }


    public static String intToRoman(int number) {
        if (number >= 101 || number <= 0)
            return null;
        StringBuilder result = new StringBuilder();
        for (Integer key : units.descendingKeySet()) {
            while (number >= key) {
                number -= key;
                result.append(units.get(key));
            }
        }
        return result.toString();
    }

    private static final NavigableMap<Integer, String> units;

    static {
        NavigableMap<Integer, String> initMap = new TreeMap<>();
        initMap.put(100, "C");
        initMap.put(90, "XC");
        initMap.put(50, "L");
        initMap.put(40, "XL");
        initMap.put(10, "X");
        initMap.put(9, "IX");
        initMap.put(5, "V");
        initMap.put(4, "IV");
        initMap.put(1, "I");
        units = Collections.unmodifiableNavigableMap(initMap);
    }
}
