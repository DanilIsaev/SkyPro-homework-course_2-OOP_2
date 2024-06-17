public abstract class MotorTransport extends WheeledTransport {
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
