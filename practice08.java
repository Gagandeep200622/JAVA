// take  marks of 5 subjects and calculate total, average and percentage

import java.util.*;

public class practice08{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int physics =sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();
        int Biology = sc.nextInt();
        int Kannada = sc.nextInt();

        int total =physics + chemistry + maths + Biology + Kannada;

        double average = total/ 5.0;
        double percentage = total / 5.0;
        System.out.println("total marks :" + total);
        System.out.println("average :" +average);
        System.out.println("percentage :"+ percentage);
    }
}
