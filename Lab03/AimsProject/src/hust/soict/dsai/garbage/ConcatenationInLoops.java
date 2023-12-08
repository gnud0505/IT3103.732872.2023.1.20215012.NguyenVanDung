package hust.soict.dsai.garbage;

import java.util.Random;

public class ConcatenationInLoops {

    public static void main(String[] args) {

        // Create a random object
        Random r = new Random(123);

        // Get the current time
        long start = System.currentTimeMillis();

        // Create a string by concatenating 65536 random numbers
        String s = "";
        for (int i = 0; i < 65536; i++) {
            s += r.nextInt(2);
        }

        // Print the time taken
        System.out.println(System.currentTimeMillis() - start); // This prints roughly 4500.

        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Get the current time
        start = System.currentTimeMillis();

        // Create a string by appending 65536 random numbers to the StringBuilder object
        for (int i = 0; i < 65536; i++) {
            sb.append(r.nextInt(2));
        }

        // Convert the StringBuilder object to a string
        s = sb.toString();

        // Print the time taken
        System.out.println(System.currentTimeMillis() - start); // This prints 5.

    }

}

