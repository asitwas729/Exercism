public class Lasagna {
    private static final int min = 40;
    public int expectedMinutesInOven(){
        return min;
    }
    
    public int remainingMinutesInOven(int inOven){
        return min - inOven;
    }

    public int preparationTimeInMinutes(int lasagnaF){
        return lasagnaF*2 ;
    }

    public int totalTimeInMinutes(int a, int b){
        return a*2 + b;
    }
}
