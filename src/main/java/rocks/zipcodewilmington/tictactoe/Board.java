package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] matrixRef;

    public Board(Character[][] matrix) {
        matrixRef = matrix;

    }



    public Boolean isInFavorOfX() {
        if (matrixRef[0][0] == 'X' && matrixRef[0][1] == 'X' && matrixRef[0][2] == 'X') { // this says, if 'X' is equal to 'X' (for the first row)
            return true;
        } else if (matrixRef[1][0] == 'X' && matrixRef[1][1] == 'X' && matrixRef[1][2] == 'X') {
            return true;
        } else if (matrixRef[2][0] == 'X' && matrixRef[2][1] == 'X' && matrixRef[2][2] == 'X') {
            return true;
        } else if (matrixRef[0][0] == 'X' && matrixRef[1][0] == 'X' && matrixRef[2][0] == 'X') {
            return true;
        } else if (matrixRef[0][1] == 'X' && matrixRef[1][1] == 'X' && matrixRef[2][1] == 'X') {
            return true;
        } else if (matrixRef[0][2] == 'X' && matrixRef[1][2] == 'X' && matrixRef[2][2] == 'X') {
            return true;
        } else if (matrixRef[0][0] == 'X' && matrixRef[1][1] == 'X' && matrixRef[2][2] == 'X') {
            return true;
        } else if (matrixRef[2][0] == 'X' && matrixRef[1][1] == 'X' && matrixRef[0][2] == 'X') {
            return true;
        } else
            return false;
    }

    public Boolean isInFavorOfO() {
        if (matrixRef[0][0] == 'O' && matrixRef[0][1] == 'O' && matrixRef[0][2] == 'O') { // this says, if 'X' is equal to 'X' (for the first row)
            return true;
        } else if (matrixRef[1][0] == 'O' && matrixRef[1][1] == 'O' && matrixRef[1][2] == 'O') {
            return true;
        } else if (matrixRef[2][0] == 'O' && matrixRef[2][1] == 'O' && matrixRef[2][2] == 'O') {
            return true;
        } else if (matrixRef[0][0] == 'O' && matrixRef[1][0] == 'O' && matrixRef[2][0] == 'O') {
            return true;
        } else if (matrixRef[0][1] == 'O' && matrixRef[1][1] == 'O' && matrixRef[2][1] == 'O') {
            return true;
        } else if (matrixRef[0][2] == 'O' && matrixRef[1][2] == 'O' && matrixRef[2][2] == 'O') {
            return true;
        } else if (matrixRef[0][0] == 'O' && matrixRef[1][1] == 'O' && matrixRef[2][2] == 'O') {
            return true;
        } else if (matrixRef[2][0] == 'O' && matrixRef[1][1] == 'O' && matrixRef[0][2] == 'O') {
            return true;
        } else
            return false;
    }

    public Boolean isTie() {
        if ( isInFavorOfX() == isInFavorOfO() ) {
            return true;

        } else                 // if is in favor of x = false (no full rows/cols/diags of 'X') && if in favor of O == false (says if neither of them won), then return true. a tie
                               // else return false
            return false;
    }

    public String getWinner() {
        // if isTie == true --> it's a tie, return empty string
        // if isInFavorX == true --> return "X" make String!! not char

        if (this.isInFavorOfX()) {  //says if this instance of the array board is true
            return "X";
        } else if (this.isInFavorOfO()) {
            return "O";
        } else
            return "";
    }

}
