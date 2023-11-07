package uk.ac.rgu.cm2115.devices.factories;

public enum DeviceType {
    LIGHT,
    SMART_PLUG,
    THERMOSTAT,
    SMART_SPEAKER;

    @Override
    public String toString(){
        String name = this.name().toLowerCase();

        name = name.substring(0,1).toUpperCase() + name.substring(1);
        name = name.replaceAll("_", " ");

        return name;
    }
}
