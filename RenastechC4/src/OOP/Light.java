package OOP;

public class Light {

    boolean isOn;
    String lightType;

    void turnOn(){
        isOn=true;
        System.out.println("The light is on ? " + isOn );
    }
    void turnOff(){
        isOn=false;
        System.out.println("The light is on ? " + isOn);
    }

    public String getLightType() {
        return lightType;
    }

    public void setLightType(String lightType) {
        this.lightType = lightType;
    }
}
