class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = 0;
        for(int i=0; i<input; i++){
            sum += i+1;
        }
        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for(int j=0; j<input; j++){
            sum += (j+1) * (j+1);
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
