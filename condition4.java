// print the greetings

import java.util.*;

public class condition4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();
        if (Button == 1) {
            System.out.println("Hello");
        } else if (Button == 2) {
            System.out.println("NAMASKARA");
        } else if (Button == 3) {
            System.out.println("Banjour");

        } else {
            System.out.println("Not found");
        }
    }
}
