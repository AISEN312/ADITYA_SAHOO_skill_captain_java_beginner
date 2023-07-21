public class MAIN {public static void main(String[] args){
    Car car = new Car("Bugatti", "Supersport", 2022, 2000.0, 5);
    Motorcycle motorcycle = new Motorcycle("Honda", "Hero608", 2022, 100.0, 500);
    car.display();
    System.out.println("Number of Seats: " + car.getNumberOfSeats());

    System.out.println();

    motorcycle.display();
    System.out.println("Engine Capacity: " + motorcycle.getEngineCapacity());
}
}
