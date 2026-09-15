//Count words in a string

public class Main {
    public static void main(String[] args) {
        String str = "Java is very powerful";
        String[] words = str.split(" ");

        System.out.println("Word count = " + words.length);
    }
}