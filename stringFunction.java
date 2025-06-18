public class stringFunction{
public static void main(String[] args) {
    System.out.println("\n--- String Functions ---");
    String message = "Java Programming";
    
    // Basic operations
    System.out.println("Original: " + message);
    System.out.println("Length: " + message.length());
    System.out.println("Uppercase: " + message.toUpperCase());
    System.out.println("Lowercase: " + message.toLowerCase());
    
    // Character access
    System.out.println("First character: " + message.charAt(0));
    System.out.println("Last character: " + message.charAt(message.length()-1));
    
    // Substring and searching
    System.out.println("Substring (5-12): " + message.substring(5, 12));
    System.out.println("Index of 'Pro': " + message.indexOf("Pro"));
    
    // Modification
    System.out.println("Replace 'Java' with 'Python': " + 
        message.replace("Java", "Python"));
    
    // Comparison
    String other = "java programming";
    System.out.println("Equals (case-sensitive): " + message.equals(other));
    System.out.println("Equals (ignore case): " + message.equalsIgnoreCase(other));
    
    // Trimming
    String withSpaces = "   Hello World   ";
    System.out.println("Trimmed: '" + withSpaces.trim() + "'");
    
    // Splitting
    String csv = "apple,orange,banana";
    String[] fruits = csv.split(",");
    System.out.println("Split fruits: " + Arrays.toString(fruits));
}
}
