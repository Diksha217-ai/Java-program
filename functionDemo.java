public class functionDemo{
public static void main(String[] args) {
        System.out.println("\n--- Function with Parameters ---");
        int sum = additionDemo(45, 78, 12);
        System.out.println("The sum is: " + sum);
    }
    
    public static int additionDemo(int a, int b, int c) {
        return a + b + c;
    }
}
