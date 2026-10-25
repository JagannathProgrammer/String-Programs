public class ReverseAString {
    public static void main(String[] args) {

        // Reverse a String using a for loop
        String str = "Java";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Original: " + str);
        System.out.println("Reverse: " + reverse);

        // Reverse a String using StringBuilder
        String str1 = "Java";

        StringBuilder sb = new StringBuilder(str1);
         
        System.out.println("Original: " + str1);
        System.out.println("Reverse:" + sb.reverse());
    }
}
