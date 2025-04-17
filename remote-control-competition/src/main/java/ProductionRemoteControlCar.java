class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTravelled = 0;
    private int numberOfVictories;

    @Override
    public void drive() {
        this.distanceTravelled += 10;
    }

    @Override
    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }


    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.getNumberOfVictories(), this.numberOfVictories);
    }

}

