package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][]board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        List<String> column = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            column.add(board[i][value]);
        }
        return column.toArray(new String[0]);
    }


    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        for(int i = 0; i < row.length; i++){
            if(!row[i].equals(row[0])){
                return false;
            }

        }

        return true;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {

        String[] row = getColumn(columnIndex);

        return allValuesTheSame(row);
    }

    private Boolean allValuesTheSame(String[] row) {
        for (int i = 1; i < row.length; i++) {
            if (!row[i].equals(row[0])) {
                return false;
            }
        }

        return true;
    }

    public String getWinner() {

        for(int i = 0; i < board.length; i++) {
            if (isRowHomogenous(i)) {
                return board[i][0];
            }
        }

        for(int i = 0; i < board.length; i++) {
            if (isColumnHomogeneous(i)) {
                return board[0][i];
            }
        }

        //Check matches Diagonal From Left To Right
        String[] diagonal = getDiagonal();
        if (allValuesTheSame(diagonal)) {
            return diagonal[0];
        }

        //Check matches Diagonal From Right To Left
        String[] otherDiagonal = getOtherDiagonal();
        if (allValuesTheSame(otherDiagonal)) {
            return otherDiagonal[0];
        }

        return null;
    }

    public String[] getDiagonal(){
        String[] diagonal = new String[board.length];
        for (int i = 0; i < board.length; i++) {
            diagonal[i] = board[i][i];
        }
        return diagonal;
    }

    public String[] getOtherDiagonal(){
        String[] diagonal = new String[board.length];
        for (int i = 0; i < board.length; i++) {
            int row = board.length - 1 - i;
            diagonal[i] = board[row][i];
        }
        return diagonal;
    }



    public String[][] getBoard() {
        return this.board;
    }
}
