package Loops;
public class SwitchCase {
    public static void main(String[] args) {
        int day = 1;
        String dayString = "";
        switch (day) {
            case 1:
                dayString = "Sunday";
                System.out.println(dayString);
                break;
            case 2:
                dayString = "Monday";
                System.out.println(dayString);
                break;
            case 3:
                dayString = "Tuesday";
                System.out.println(dayString);
                break;
            case 4:
                dayString = "Wednesday";
                System.out.println(dayString);
                break;
            case 5:
                dayString = "Thursday";
                System.out.println(dayString);
                break;
            case 6:
                dayString = "Friday";
                System.out.println(dayString);
                break;
            case 7:
                dayString = "Saturday";
                System.out.println(dayString);
                break;

            default:
                System.out.println("Oops, Invalid Day! since given number is not in [1,7]");
        }

    }
}
