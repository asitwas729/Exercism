class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return (knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true);
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return (prisonerIsAwake == true && archerIsAwake == false);
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent == true){
            return !archerIsAwake;
        } else{
            if(prisonerIsAwake == true && knightIsAwake == false && archerIsAwake == false){
                return true;
            }
            return false;
        }
    }
}
