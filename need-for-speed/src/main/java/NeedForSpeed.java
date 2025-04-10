class NeedForSpeed {
    private int speed;
    private int batteryPercent = 100;
    private int batteryDrain;
    private int distanceDriven = 0;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public int getSpeed(){
        return speed;
    }
    public int getBatteryDrain(){
        return batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryPercent < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if(!batteryDrained()) {
            this.distanceDriven += speed;
            this.batteryPercent -=  batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int maxDrives = 100 / car.getBatteryDrain();
        int maxDistance = maxDrives * car.getSpeed();
        return maxDistance >= this.distance;
    }
}
