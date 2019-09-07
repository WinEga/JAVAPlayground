package Basic;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExample {

    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result1  = currency.format(7867778875.89877);
        String result2 = currency.format(9909089999.0999);
        System.out.println(result1+"\n"+result2);


    }
}
