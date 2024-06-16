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
        technicalInspection(carExamination);
        technicalInspection(truckExamination);
        technicalInspection(bicycleExamination);


    }

    public static void technicalInspection(Transport[] transportExamination) {
        for (int i = 0; i < transportExamination.length; i++) {
            transportExamination[i].serviceStation();
        }
    }
}