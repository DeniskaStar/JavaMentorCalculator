public class Operation {
    private static int result;

    public static int arithmOper(int i1, int i2, String op) {
        switch (op) {
            case ("+") -> result = i1 + i2;
            case ("-") -> result = i1 - i2;
            case ("*") -> result = i1 * i2;
            case ("/") -> result = i1 / i2;
        }
        return result;
    }
}
