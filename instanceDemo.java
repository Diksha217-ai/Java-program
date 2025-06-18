public class instanceDemo{
public static void main(String[] args) {
        System.out.println("\n--- Instanceof ---");
        String str = "Anudip"; // non primitive data type 
        boolean result; // Verifies if it is an instance of String class 
        result = str instanceof String;
        System.out.println("Is str an instance of String? " + result);
    }
}
