class NeedForSpeed {
    int speed;
    int batteryDrain;
    int battery;
    int mile;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
    }

    public boolean batteryDrained() {    // 배터리 방전
        boolean isDrained;
        if(this.battery < this.batteryDrain){
            isDrained = true;
        } else{
            isDrained = false;
        }
        return isDrained;
    }

    public int distanceDriven() {    // 주행거리
        return this.mile;
    }

    public void drive() {
        if(this.battery >= this.batteryDrain){
            this.mile += this.speed;
            this.battery -= this.batteryDrain;
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
        boolean isFinish;
        int n = (int)Math.ceil((double)this.distance / car.speed);
        int drain = n * car.batteryDrain;
        if(drain <= car.battery){
            isFinish = true;
        } else{
            isFinish = false;
        }
        return isFinish;
    }
}
