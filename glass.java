// import myInterface.*;
// import myInterface.Geometry;
interface Geometry {
    double area();
}

class Circle implements Geometry {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Geometry {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Ellipse implements Geometry {
    private double majorAxis, minorAxis;

    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public double area() {
        return Math.PI * majorAxis * minorAxis;
    }
}

public class glass {
    public static void main(String[] args) {
        Geometry[] geo = new Geometry[3];
        geo[0] = new Circle(5.0);
        geo[1] = new Rectangle(4.0, 5.0);
        geo[2] = new Ellipse(3.0, 4.0);
        double totalArea = 0;
        for (int i = 0; i < 3; i++) {
            totalArea += geo[i].area();
        }
        System.out.println("Total area is: " + totalArea);
    }
}
