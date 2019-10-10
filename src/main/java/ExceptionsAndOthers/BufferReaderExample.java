package ExceptionsAndOthers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {
    public static void main(String[] args) throws IOException {
        double n = 0;
        System.out.println("Enter your SSLC mark : ");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            n = Double.parseDouble(br.readLine());
            if (n < 0) {
                System.out.println("Oh negative! Please enter the valid mark");

            } else if (n > 500) {
                System.out.println("Oh my dear, you are more than the total mark 500! Please enter the valid mark");

            } else {
                System.out.println("Your percentage is " + (n / 500) * 100 + "%");
            }


        } catch (Exception e) {
            System.out.println("Requested to enter your mark");

        }
        finally {br.close();}
    }
}
