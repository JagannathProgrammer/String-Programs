// //String intern() Method and String Immutability
public class StringImmutabilityExample {
    public static void main(String[] args) {
    // 1. Java intern() Method
    System.out.println("1. Java intern() Method");

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

    // 2: String immutability program
    System.out.println("2: String immutability program");
    
      // Method 1: Original string
        String str5 = "Hello";
        System.out.println("Method 1. Original: " + str5);

        // Method 2: concat()
        str5.concat(" Java");
        System.out.println("Method 2. After concat(): " + str5);

        // Method 3: Reassignment
        str5 = str5.concat(" Java");
        System.out.println("Method 3. After reassignment: " + str5);

        // Method 4: toUpperCase()
        String str6 = "java";
        str6.toUpperCase();
        System.out.println("Method 4. After toUpperCase(): " + str6);

        // Method 5: Reassignment with toUpperCase()
        str6 = str6.toUpperCase();
        System.out.println("Method 5. After reassignment: " + str6);

        // Method 6: Original and new string
        String str7 = "Hello";
        String str8 = str7.concat(" World");

        System.out.println("Method 6. Original string: " + str7);
        System.out.println("Method 7. New string: " + str8);

        // Method 8: Reference comparison
        System.out.println("Method 8. Same reference: " + (str7 == str8));
    }
}
