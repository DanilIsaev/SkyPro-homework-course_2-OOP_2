public class ServiceStation {
    public static void check(Transport[] transports) {
        for (int i = 0; i < transports.length; i++) {
            transports[i].service();
        }
    }
}
