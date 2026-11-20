class Darts {
    int score(double xOfDart, double yOfDart) {
        int score = 0;
        double result = Math.sqrt((xOfDart * xOfDart) + Math.pow(yOfDart, 2));
        if(result > 10){
            score = 0;
        } else if (result <= 10 && result > 5){
            score = 1;
        } else if (result <= 5 && result > 1){
            score = 5;
        } else {
            score = 10;
        }
        return score;
    }
}
