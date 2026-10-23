
// 2: Important String Methods

import java.util.Arrays;
import java.nio.charset.StandardCharsets;

public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

    // 1. Basic Methods

        // Method 1: length()
        System.out.println("Method 1. Length: " + str.length());

        // Method 2: isEmpty()
        String str2 = "";
        System.out.println("Method 2. Is empty: " + str2.isEmpty());

        // Method 3: isBlank()
        String str3 = "   ";
        System.out.println("Method 3. Is blank: " + str3.isBlank());

        // Method 4: charAt()
        System.out.println("Method 4. Character at index 7: " + str.charAt(7));

        // Method 5: toString()
        System.out.println("Method 5. String: " + str.toString());


    // 2. Case Conversion Methods

        // Method 6: toUpperCase()
        System.out.println("Method 6. Uppercase: " + str.toUpperCase());

        // Method 7: toLowerCase()
        System.out.println("Method 7. Lowercase: " + str.toLowerCase());


    // 3. Comparison Methods

        // Method 8: equals()
        String str4 = "Hello, World!";
        System.out.println("Method 8. Equals: " + str.equals(str4));

        // Method 9: equalsIgnoreCase()
        String str5 = "hello, world!";
        System.out.println("Method 9. Equals ignoring case: "
                + str.equalsIgnoreCase(str5));

        // Method 10: compareTo()
        String str6 = "Apple";
        String str7 = "Banana";
        System.out.println("Method 10. compareTo: "
                + str6.compareTo(str7));

        // Method 11: compareToIgnoreCase()
        String str8 = "apple";
        String str9 = "Banana";
        System.out.println("Method 11. compareToIgnoreCase: "
                + str8.compareToIgnoreCase(str9));

        // Method 12: contentEquals()
        System.out.println("Method 12. contentEquals: "
                + str.contentEquals(new StringBuffer("Hello, World!")));


    // 4. Searching Methods

        // Method 13: contains()
        System.out.println("Method 13. Contains World: "
                + str.contains("World"));

        // Method 14: indexOf()
        System.out.println("Method 14. Index of World: "
                + str.indexOf("World"));

        // Method 15: lastIndexOf()
        System.out.println("Method 15. Last index of l: "
                + str.lastIndexOf('l'));

        // Method 16: startsWith()
        System.out.println("Method 16. Starts with Hello: "
                + str.startsWith("Hello"));

        // Method 17: endsWith()
        System.out.println("Method 17. Ends with World!: "
                + str.endsWith("World!"));


    // 5. Extracting Methods

        // Method 18: substring(start, end)
        System.out.println("Method 18. Substring (7, 12): "
                + str.substring(7, 12));

        // Method 19: substring(start)
        System.out.println("Method 19. Substring from index 7: "
                + str.substring(7));

        // Method 20: subSequence()
        System.out.println("Method 20. SubSequence (7, 12): "
                + str.subSequence(7, 12));


    // 6. Replacing Methods

        // Method 21: replace()
        System.out.println("Method 21. Replace: "
                + str.replace("World", "Java"));

        // Method 22: replaceFirst()
        System.out.println("Method 22. Replace first l: "
                + str.replaceFirst("l", "L"));

        // Method 23: replaceAll()
        System.out.println("Method 23. Replace all l: "
                + str.replaceAll("l", "L"));


    // 7. Removing Spaces

        // Method 24: trim()
        String str10 = "   Hello, World!   ";
        System.out.println("Method 24. Trim: '" + str10.trim() + "'");

        // Method 25: strip()
        String str11 = "   Hello, World!   ";
        System.out.println("Method 25. Strip: '" + str11.strip() + "'");

        // Method 26: stripLeading()
        String str12 = "   Hello, World!   ";
        System.out.println("Method 26. Strip leading: '"
                + str12.stripLeading() + "'");

        // Method 27: stripTrailing()
        String str13 = "   Hello, World!   ";
        System.out.println("Method 27. Strip trailing: '"
                + str13.stripTrailing() + "'");


    // 8. Splitting and Joining

        // Method 28: split()
        String fruits = "Apple,Banana,Mango";
        System.out.println("Method 28. Split: "
                + Arrays.toString(fruits.split(",")));

        // Method 29: join()
        System.out.println("Method 29. Join: "
                + String.join(" - ", "Apple", "Banana", "Mango"));


    // 9. Concatenation and Repetition

        // Method 30: concat()
        System.out.println("Method 30. Concat: "
                + str.concat(" Java"));

        // Method 31: repeat()
        String str14 = "Hello! ";
        System.out.println("Method 31. Repeat: " + str14.repeat(3));


    // 10. Checking and Matching

        // Method 32: matches()
        System.out.println("Method 32. Matches: "
                + str.matches("Hello, .*!"));

        // Method 33: regionMatches()
        System.out.println("Method 33. Region matches: "
                + str.regionMatches(true, 7, "world!", 0, 6));


    // 11. Conversion Methods

        // Method 34: toCharArray()
        System.out.println("Method 34. Character array: "
                + Arrays.toString(str.toCharArray()));

        // Method 35: valueOf()
        int number = 42;
        String str15 = String.valueOf(number);
        System.out.println("Method 35. Value of: " + str15);

        // Method 36: copyValueOf()
        char[] letters = {'J', 'a', 'v', 'a'};
        System.out.println("Method 36. Copy value of: "
                + String.copyValueOf(letters));

        // Method 37: getBytes()
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println("Method 37. Bytes: "
                + Arrays.toString(bytes));


    // 12. Formatting Methods

        // Method 38: format()
        String str16 = String.format(
                "My name is %s and I am %d years old.",
                "Jagannath", 25);
        System.out.println("Method 38. Format: " + str16);

        // Method 39: formatted()
        String formattedText = "Name: %s, Age: %d".formatted(
                "Jagannath", 25);
        System.out.println("Method 39. Formatted: " + formattedText);


    // 13. Other Useful Methods

        // Method 40: hashCode()
        System.out.println("Method 40. Hash code: " + str.hashCode());

        // Method 41: intern()
        String str18 = new String("Java");
        System.out.println("Method 41. Intern: "
                + (str18.intern() == "Java"));

        // Method 42: isEmpty()
        System.out.println("Method 42. Is empty: "
                + "".isEmpty());

        // Method 43: isBlank()
        System.out.println("Method 43. Is blank: "
                + "   ".isBlank());

        // Method 44: lines()
        String str17 = "Hello\nWorld\nJava";
        System.out.println("Method 44. Lines:");
        str17.lines().forEach(System.out::println);


    // 14. Static and Utility Methods

        // Method 45: String.valueOf()
        System.out.println("Method 45. Value of boolean: "
                + String.valueOf(true));

        // Method 46: String.join()
        System.out.println("Method 46. Join: "
                + String.join(", ", "Java", "Python", "C++"));


    // 15. String Immutability

        // Method 47: Original after concat()
        String original = "Hello";
        original.concat(" Java");
        System.out.println("Method 47. Original: " + original);

        // Method 48: After reassignment
        original = original.concat(" Java");
        System.out.println("Method 48. After reassignment: " + original);
    }
    
}
