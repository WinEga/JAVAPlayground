public class SwitchCase {
    public static void main(String[] args) {
        int day = 10;
        String dayString = "";
        switch (day) {
            case 1:
                dayString = "Sunday";
                break;
            case 2:
                dayString = "Monday";
                break;
            case 3:
                dayString = "Tuesday";
                break;
            case 4:
                dayString = "Wednesday";
                break;
            case 5:
                dayString = "Thursday";
                break;
            case 6:
                dayString = "Friday";
                break;
            case 7:
                dayString = "Saturday";
                break;

            default:
                System.out.println("Oops, Invalid Day! since given number is not in [1,7]");
        }
        System.out.println(dayString);
    }
}
