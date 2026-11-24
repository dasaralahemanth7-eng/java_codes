 class Shape {
    void display() {
        System.out.println("Calculating Area of Shapes");
    }
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Square extends Shape {
    double side = 4;

    void area() {
        double result = side * side;
        System.out.println("Area of Square: " + result);
    }
}

class Rectangle extends Shape {
    double length = 6;
    double breadth = 4;

    void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

class Main1{
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        s.area();

        r.area();
    }
}