
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};
        return birdsLastWeek;
    }

    public int getToday() {
        int index = birdsPerDay.length - 1;
        return birdsPerDay[index];
    }

    public void incrementTodaysCount() {
        int index = birdsPerDay.length - 1;
        birdsPerDay[index]++;       
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) 
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++ ){
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for (int birds : birdsPerDay){
            if (birds >= 5)
                count++;
        }
        return count;
    }
}
