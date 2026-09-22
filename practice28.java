public class ReverseString {
    public static void main(String[] args) {
        String original = "JavaProgramming";
        
        // Best approach: In-place reversal using StringBuilder
        String reversed = new StringBuilder(original).reverse().toString();
        
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}

