public class car {  
class Car { 
    String model;
    int year;
    Car(String model, int year) {
        this.model = model; 
        this.year = year;   
    }
    void displayDetails() {
        System.out.println("Car Model: " + this.model);
        System.out.println("Car Year: " + this.year);
    }
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022);
        myCar.displayDetails();
    }
}
