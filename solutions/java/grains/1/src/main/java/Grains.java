import java.math.BigInteger;

class Grains {
    BigInteger board = BigInteger.ONE;
    BigInteger[] sq = new BigInteger[64];

    Grains(){
        sq[0] = BigInteger.ONE;
        for(int i=1; i<sq.length; i++){
            sq[i] = sq[i-1].multiply(BigInteger.TWO);
            board = board.add(sq[i]);
        }
    }
        
    BigInteger grainsOnSquare(final int square) {
        if(square < 1 || square > 64){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return sq[square - 1];
    }

    BigInteger grainsOnBoard() {
        return board;
    }

}
