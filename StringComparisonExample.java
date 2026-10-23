
 // 3: Important String Comparison Methods

public class StringComparisonExample {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = "Python";
        String str5 = new String("Java");

        // 1. equals()
        System.out.println("Method 1. equals(): "
                + str1.equals(str2));

        // 2. equalsIgnoreCase()
        System.out.println("Method 2. equalsIgnoreCase(): "
                + str1.equalsIgnoreCase(str3));

        // 3. compareTo()
        System.out.println("Method 3. compareTo Java To Python: " + str1.compareTo(str4));

        System.out.println("Method 3. compareTo Apple To Apple: "+ "Apple".compareTo("Apple"));
        System.out.println("Method 3. compareTo Apple To Banana: "+ "Apple".compareTo("Banana"));
        System.out.println("Method 3. compareTo Banana to Apple: "+ "Banana".compareTo("Apple"));

        // 4. compareToIgnoreCase()
        System.out.println("Method 4. compareToIgnoreCase(): "
                + str1.compareToIgnoreCase(str3));

        // 5. == Operator
        System.out.println("Method 5. == operator: "
                + (str1 == str2));

        // 6. != Operator
        System.out.println("Method 6. != operator: "
                + (str1 != str5));

        // 7. contentEquals()
        System.out.println("Method 7. contentEquals(): "
                + str1.contentEquals(new StringBuffer("Java")));

        // 8. regionMatches()
        System.out.println("Method 8. regionMatches(): "
                + str1.regionMatches(0, str3, 0, 4));

        // 9. regionMatches() ignoring case
        System.out.println("Method 9. regionMatches(ignore case): "
                + str1.regionMatches(true, 0, str3, 0, 4));

        // 10. equals() with different content
        System.out.println("Method 10. Different strings: "
                + str1.equals(str4));

        // 11. compareTo() with equal content
        System.out.println("Method 11. compareTo(equal): "
                + str1.compareTo(str2));

        // 12. compareTo() reverse comparison
        System.out.println("Method 12. Reverse comparison: "
                + str4.compareTo(str1));

        // 13. compareToIgnoreCase() with different content
        System.out.println("Method 13. Ignore case comparison: "
                + str1.compareToIgnoreCase(str4));

        // 14. startsWith() for prefix comparison
        System.out.println("Method 14. startsWith(): "
                + str1.startsWith("Ja"));

        // 15. endsWith() for suffix comparison
        System.out.println("Method 15. endsWith(): "
                + str1.endsWith("va"));

        // 16. contains() for content checking
        System.out.println("Method 16. contains(): "
                + str1.contains("av"));

        // 17. Objects.equals() for null-safe comparison
        System.out.println("Method 17. Objects.equals(): "
                + java.util.Objects.equals(str1, str5));

        // 18. Compare with null
        String str6 = null;
        System.out.println("Method 18. Compare with null: "
                + java.util.Objects.equals(str6, str1));

        // 19. Compare two empty strings
        String str7 = "";
        String str8 = "";
        System.out.println("Method 19. Empty strings: "
                + str7.equals(str8));

        // 20. Compare strings with different cases
        System.out.println("Method 20. Case comparison: "
                + str1.equals(str3));
    }
}

