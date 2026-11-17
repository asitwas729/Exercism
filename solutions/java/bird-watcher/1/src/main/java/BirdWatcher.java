
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] {0,2,5,3,7,8,4};
    }

    public int getToday() {
        int today = birdsPerDay.length;
        return birdsPerDay[today-1];
    }

    public void incrementTodaysCount() {
        int today = birdsPerDay.length;
        birdsPerDay[today-1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int count : birdsPerDay){
            if(count == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int result = 0;
            for(int i=1; i<=numberOfDays; i++){
                result += birdsPerDay[i-1];
                if(birdsPerDay.length <= i){
                    break;
                }
            }
        return result;
    }

    public int getBusyDays() {
        int busy = 0;
        for(int i : birdsPerDay){
            if(i >= 5){
                busy++;
            }
        }
        return busy;
    }
}
