public class AbstractClasses {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(10, 15, 200, 150);
        System.out.println("Площадь прямоугольника: " + shape1.getArea());
        System.out.println("Периметер прямоугольника: " + shape1.getPerimeter());

        Shape shape2 = new Circle(50, 60, 100);
        System.out.println("Площадь круга: " + shape2.getArea());
        System.out.println("Периметер круга: " + shape2.getPerimeter());

        Shape shape3 = new Circle(4, 6, 10);
        System.out.println("Площадь круга: " + shape3.getArea());
        System.out.println("Периметр круга: " + shape3.getPerimeter());
    }
}

abstract class Shape {
    int x;
    int y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract double getPerimeter();

    abstract double getArea();
}

class Rectangle extends Shape {
    int width;
    int height;

    Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }

    double getArea() {
        return this.width * this.height;
    }
}

class Circle extends Shape {
    int radius;

    Circle(int x, int y, int radius) {

        super(x, y);
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return this.radius * 3.14 * 2;
    }

    @Override
    double getArea() {
        return this.radius * 3.14;
    }
}
