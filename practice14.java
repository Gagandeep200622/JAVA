
// check whether a character is upper case or lower case

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'a'&& ch <= 'z'  ){
            System.out.println("lowercase");
        }
        else if(ch >= 'A' && ch <= 'Z' ){
            System.out.println("Uppercase");
        }
        else{
            System.out.println("not an alphabet");
        }

    }
}
