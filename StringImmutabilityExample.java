// String intern() Method and String Immutability
public class StringImmutabilityExample {
    public static void main(String[] args) {

        // Method 1: String literals
        String str1 = "Java";
        String str2 = "Java";

        System.out.println("Method 1. Using literals: " + (str1 == str2));

        // Method 2: Using new keyword
        String str3 = new String("Java");

        System.out.println("Method 2. Using new: " + (str1 == str3));

        // Method 3: Using intern()
        String str4 = str3.intern();

        System.out.println("Method 3. After intern(): " + (str1 == str4));

        // Method 4: Compare content
        System.out.println("Method 4. Using equals(): " + str1.equals(str3));

        // Method 5: Check references
        System.out.println("Method 5. str3 == str4: " + (str3 == str4));

    }
}

