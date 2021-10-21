import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputStr {

    public static void inputStream() throws IOException {
        System.out.println("Введите выражение, состоящие из 2х чисел и знака операции. (Например: 1 + 2)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String strings = bufferedReader.readLine();

        List<String> list = new ArrayList<>();

        Pattern pattern = Pattern.compile("(10|[\\d])|(\\+|-|\\*|/)|(IX|X|VIII|VII|IV|VI|V|III|II|I)");
        Matcher matcher = pattern.matcher(strings);

        while (matcher.find()) {
            list.add(matcher.group());
        }

        if (list.size() < 4 && list.get(0).matches("(IX|X|VIII|VII|IV|VI|V|III|II|I)") && list.get(1).matches("(\\+|-|\\*|/)") && list.get(2).matches("(IX|X|VIII|VII|IV|VI|V|III|II|I)")){
            RomanTranslate.romanToArab(list);
            int a = Operation.arithmOper(Integer.valueOf(list.get(0)), Integer.valueOf(list.get(2)), list.get(1));
            if (a > 0) {
                System.out.println(RomanTranslate.intToRoman(a));
            }else System.out.println("Резульат меньше нуля");

        }
        else if (list.size() < 4 && list.get(0).matches("(10|[1-9])") && list.get(1).matches("(\\+|-|\\*|/)") && list.get(2).matches("(10|[1-9])")) {
            System.out.println(Operation.arithmOper(Integer.valueOf(list.get(0)), Integer.valueOf(list.get(2)), list.get(1)));
                    } else System.out.println("Вы ввели некорректное выражение");
        inputStream();
    }
}




