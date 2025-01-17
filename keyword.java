class Keyword {
    int a, b;

    void get(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void area() {
        int y = a * b;
        System.out.println("Area: " + y);
    }

    public static void main(String[] args) {
        Keyword y = new Keyword();
        y.get(5, 10); // Example values
        y.area();
    }
}
