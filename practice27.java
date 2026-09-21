//Given a string S and two integers start and end, print the substring of S starting from index start up to, but not including, index end.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(s.substring(start, end));

        sc.close();
    }
}