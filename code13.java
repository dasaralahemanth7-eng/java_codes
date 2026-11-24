abstract class Appliance {

    abstract void turnOn();

    void plugIn() {
        System.out.println("Appliance is connected to the power source.");
    }
}

class Fan extends Appliance {

    void turnOn() {
        System.out.println("The fan is spinning.");
    }
}

class Main4 {
    public static void main(String[] args) {

        Fan obj = new Fan();

        obj.plugIn();
        obj.turnOn();
    }
}