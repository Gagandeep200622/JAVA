// take two numbers a and b if a is equal to b then print equal if a is greater than b then print  a is greater and if a is small then print a is smaller

import java.util.*;

public class conditions3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("EQUAL");
        }
        else if (a > b) {
            System.out.println("A IS GREATER");
        }
         else {
            System.out.println("A IS SMALL");
        }
    }
}
