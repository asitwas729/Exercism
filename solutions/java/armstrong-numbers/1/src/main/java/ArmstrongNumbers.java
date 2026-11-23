class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        
        String str = numberToCheck + "";
        int leng = str.length();
        int[] arr = new int[leng];
        int sum = 0;
        int remain = numberToCheck;
        for(int i=0; i<leng; i++){
            arr[i] = remain % 10;
            sum += Math.pow(arr[i], leng);
            remain = remain / 10;
        }
        
        return numberToCheck == sum;
        
    }

}
