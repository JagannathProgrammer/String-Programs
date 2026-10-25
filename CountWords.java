public class CountWords {
    public static void main(String[] args) {
        String str = "I am learning Java";

        String trimmed = str.trim();

        int count = trimmed.isEmpty()
                ? 0
                : trimmed.split("\\s+").length;

        System.out.println("Word count: " + count);
    }
}
