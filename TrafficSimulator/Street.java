package TrafficSimulator;

public class Street {

    private StopLight light;

    private int length;

    private int lightPosition;


    public Street(int length) {
        lightPosition = length/2;
        light = new StopLight();
    }
}
