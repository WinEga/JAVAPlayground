//This programme to find output without running the programme
public class MixedOperators {

    public static void main(String[] args) {
        byte num1 = 7;
        byte num2 = 2;
        byte bodmas;
        float n = 5.5f;

        bodmas = (byte) (num1 / num2 - num1 + num2 * num1 - num1);
        byte mod = (byte) (num1 % num2);
        byte val1 = num1++;
        byte val2 = ++num2;
        byte mul1 = (byte) (num1 * num2);
        System.out.println("value of bodmas = " + bodmas);
        System.out.println("Post increment value = " + val1);
        System.out.println("Pre increment value = " + val2);
        System.out.println(++mod);

        for (num1 = num2; num1 < 10; num1++) {

            System.out.println(num1);

            if (num1 == 7) {
                System.out.println("This is Seven");

            } else System.out.println("**");
        }
        System.out.println("Final value of num1 = " + num1);
        System.out.println("Final value of num2 = " + num2);
        System.out.println("Value of mul1 = " + mul1);
    }
}
