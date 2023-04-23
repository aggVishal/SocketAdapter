package adapter;

import volt.Volt;

public interface SocketAdapterService {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}