package Practice;


public class a1 {
    static String age;
    String name;
    static{
        age = "20";
        System.out.println("Static block executed");
    }
    {
        name = "John";
        System.out.println("Instance block executed");
    }
    public static void main(String[] args) {
        a1.age = "25";
        System.out.println("Age: " + a1.age);

    }
}
