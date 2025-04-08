public class JedliksToyCar {
    private int distanceDriven;
    private int batteryPercent = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (batteryPercent == 0)
            return "Battery empty";
        return "Battery at " + batteryPercent + "%";
    }

    public void drive() {
        if(batteryPercent > 0){
            distanceDriven += 20;
            batteryPercent -= 1;
        }
    }
}
