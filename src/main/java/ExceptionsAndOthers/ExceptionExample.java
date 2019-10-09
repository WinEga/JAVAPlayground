package ExceptionsAndOthers;



public class ExceptionExample {

    public static void main(String[] args) {
        int a =3;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Result is " +c);
        }
        catch (Exception e){
            System.err.println("Error: Divided by Zero");
        }
        finally {
            System.out.println("Thanks for running the programme");
        }
    }
}
