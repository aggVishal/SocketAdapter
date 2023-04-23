package adapter;

import volt.Volt;

public class AdapterPatternTest {

    public static void main(String[] args) {
        testAdapter();
    }

    private static void testAdapter() {
        Volt v3 = getVolt(3);
        Volt v12 = getVolt(12);
        Volt v120 = getVolt(120);
        System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
        System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
        System.out.println("v120 volts using Object Adapter=" + v120.getVolts());
    }

    private static Volt getVolt(int i) {
        SocketAdapterService socketAdapterService = new SocketAdapterServiceImpl();

        switch (i) {
            case 3 -> {
                return socketAdapterService.get3Volt();
            }
            case 12 -> {
                return socketAdapterService.get12Volt();
            }
            case 120 -> {
                return socketAdapterService.get120Volt();
            }
            default -> {
                System.out.println("Adapter does not support this voltage");
                return null;
            }
        }
    }

}