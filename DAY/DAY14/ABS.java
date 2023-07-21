import java.util.ArrayList;
import java.util.List;
public class ABS {
    public static void main(String[] args) {
        List<Vehicle> inventory = new ArrayList<>();


        inventory.add(new Car("BMW", "80", 2020, 55000.0, 4, "Petrol"));
        inventory.add(new Motorcycle("HERO", "SPLENDOR", 2021, 9000.0, false, 500));


        for (Vehicle vehicle : inventory) {
            vehicle.displayDetails();
        }
    }
}
