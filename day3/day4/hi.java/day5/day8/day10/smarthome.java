class Device {
    String name;
    boolean isOn;

    Device(String name) {
        this.name = name;
        this.isOn = false;
    }

    void turnOn() {
        isOn = true;
        System.out.println(name + " is ON");
    }

    void turnOff() {
        isOn = false;
        System.out.println(name + " is OFF");
    }
}

public class smarthome {
    public static void main(String[] args) {
        Device light = new Device("Living Room Light");
        Device fan = new Device("Bedroom Fan");

        light.turnOn();
        fan.turnOn();
        light.turnOff();
    }
}
