public class one {
    static int x=0;

        public static int getX() {
            return x;
        }
    one() {
       static x = 0;
    }
    static void display() {
        System.out.println("x=" + x);
    }
    public static void main(String[] args) {
        x = 5;
        System.out.println("x=" + x);
        System.out.println("X=" + one.x);
        one.display();
    }
}
