import java.util.*;

public class switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();

        switch (Button) {
            case 1: System.out.println("NAMASKAR");
            break;
            case 2: System.out.println("Hello");
            break;
            case 3: System.out.println("Bounjour");
            break;
            default : System.out.println("Not a valid button");
        }
    }
}

