// First interface
interface Writer {
    void write();
}

// Second interface
interface Reader {
    void read();
}

// Class implementing both interfaces
class Diksha implements Writer, Reader {
    public void write() {
        System.out.println("Diksha is writing Java code.");
    }

    public void read() {
        System.out.println("Diksha is reading Java notes.");
    }
}

// Main class
public class MultipleInheritance {
    public static void main(String[] args) {
        Diksha d = new Diksha();
        d.write();
        d.read();
    }
}
