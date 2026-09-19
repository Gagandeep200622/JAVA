import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; sc.hasNextLine(); i++) {
            String line = sc.nextLine();

            System.out.println(i + " " + line);
        }

        sc.close();
    }
}
