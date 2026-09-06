// convert from celsius tp fahrenheit

import java.util.*;

public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();

        double fahrenhit = (celsius * 9/5) +32;

        System.out.println(fahrenhit);

    }
}
