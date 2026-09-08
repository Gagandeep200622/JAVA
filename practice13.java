// check whether a character is vowel or consonant

import java.util.*;

public class Practice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(     ch == 'a'  || ch =='A'|| ch == 'e'  || ch == 'E'||
                ch == 'i'  || ch == 'I'|| ch == 'o'  || ch == 'O' ||
                ch == 'u'  || ch == 'U'     ){
            System.out.println("given characte is vowel");
        }
        else{
            System.out.println("consonant");
        }

    }
}