class Vehicle {
    String brand;

    void start() {
        System.out.println("The vehicle is starting");
    }
}

class Car extends Vehicle {
    String modelName;

    void accelerate() {
        System.out.println("The car is accelerating");
    }
}

class Main3 {
    public static void main(String[] args) {
        Car obj = new Car();

        obj.brand = "Toyota";
        obj.modelName = "Fortuner";

        System.out.println("Brand: " + obj.brand);
        System.out.println("Model: " + obj.modelName);

        obj.start();
        obj.accelerate();
    }
}
