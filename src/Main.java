public class Main {
    public static void main(String[] args) {
        Car[] carExamination = {
                new Car("Car1", 4),
                new Car("Car2", 4)
        };

        Truck[] truckExamination = {
                new Truck("Truck1", 6),
                new Truck("Truck2", 8)
        };

        Bicycle[] bicycleExamination = {
                new Bicycle("Bicycle1", 2),
                new Bicycle("Bicycle2", 2)
        };

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(carExamination);
        serviceStation.check(truckExamination);
        serviceStation.check(bicycleExamination);


    }

}