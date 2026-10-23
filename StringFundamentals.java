// 1: Introduction to String
public class StringFundamentals {

    public static void main(String[] args) {
        // String program
		        String Name = "Jagannath";   // String variable to store the name
		        String Language = "Java";   // String variable to store the programming language
		        String Message = "Welcome To The Java Programming World!";  // String variable to store a message

		        System.out.println("Name: " + Name);
		        System.out.println("Language: " + Language);
		        System.out.println("Message: " + Message);

		// Different ways to create a String

		        // Method 1: Using a String literal
		        String str1 = "Hello, World!";    // Creates a String object in the string pool

		        // Method 2: Using the new keyword
		        String str2 = new String("Hello, Java!");  // Creates a String object in the heap

		        // Method 3: Using String concatenation
		        String str3 = "Hello, " + "Java!";    // Creates a String object in the string pool

		        System.out.println("String 1: " + str1);   // Prints: String 1: Hello, World!
		        System.out.println("String 2: " + str2);   // Prints: String 2: Hello, Java!
		        System.out.println("String 3: " + str3);   // Prints: String 3: Hello, Java!

		// String declaration and initialization
		        String name;
		        name = "Jagannath";   // Assigning a value to the String variable
		        String city = "Pune";   // Declaring and initializing a String variable in one line

		        System.out.println("Name: " + name);
		        System.out.println("City: " + city);
                
    }
}