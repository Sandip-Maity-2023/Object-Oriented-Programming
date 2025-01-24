public class one {
    static int x = 0; // Static variable x is initialized to 0

    public static int getX() {
        return x; 
    }

    static {
        // Static block: Executed once when the class is loaded
        System.out.println("In static block");
        System.out.println("x = " + x); // Prints "x = 0" (static variable x)
        x = 15; // Updates the static variable x
        System.out.println("x = " + x); // Prints "x = 15"
    }

    static void display() {
        System.out.println("x = " + x); // Prints the value of the static variable x
    }

    public static void main(String[] args) {
        int x = 5; // Local variable x within the main method is initialized to 5

        System.out.println("x = " + x); // Prints "x = 5" (local x)
        System.out.println("X = " + one.x); // Prints "X = 15" (static x)
        one.display(); // Calls the display() method, which prints "x = 15"
    }
}
