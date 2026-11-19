public class JedliksToyCar {
    public int mileage = 0;
    public int battery = 100;
    
    public static JedliksToyCar buy() {
        JedliksToyCar newCar = new JedliksToyCar();
        return newCar;
    }

    public String distanceDisplay() {
        String display = "Driven " + this.mileage + " meters";
        return display;
    }

    public String batteryDisplay() {
        String display;
        
        if(this.battery == 0){
            display = "Battery empty";
        } else{
            display = "Battery at " + this.battery + "%";
        }
        
        return display;
    }

    public void drive() {
        if(this.battery > 0){
            this.mileage += 20;
            this.battery -= 1;
        } 
        
    }
}
