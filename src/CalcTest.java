import java.io.IOException;

public class CalcTest {
    public static void main(String[] args) throws IOException {
        try {
            InputStr.inputStream();
        } catch (IOException | ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Вы ввели некорректное выражение");
        }
        InputStr.inputStream();
    }
}





