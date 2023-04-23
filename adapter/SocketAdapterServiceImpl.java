package adapter;

import socket.Socket;
import volt.Volt;

public class SocketAdapterServiceImpl implements SocketAdapterService {

    private final Socket sock = new Socket();

    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = sock.getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = sock.getVolt();
        return convertVolt(v, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}