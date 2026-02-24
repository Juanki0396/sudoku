package pio.daw;

import java.util.List;

public class Sudoku implements Playable {
    private Integer[][] matrix; // Holds info about the number in the sudoku
    private List<SudokuChange> changes; // Register every change
    private Boolean isFinish = false;
    private Boolean playerWin = false;

    /**
     * Data structure to store information about changes accesible
     */
    private record SudokuInput(Integer row, Integer col, Integer value) {
        public SudokuInput(String input) throws Playable.InvalidUserInputException {
            // TODO Take an input of the form "B37" and store row = 1, col = 2, value = 7
            this(null, null, null);
            if input.length(!=3){
                throw new Playable.InvalidUserInputException("Input lenght must be 3");
            } 
                         
            

        }
        
        @Override
        public final String toString() {
            Character rowChar = (char) ('A' + this.row);
            return String.format("%c%d%d", rowChar, this.col + 1, this.value);
        }
    }

    private record SudokuChange(SudokuInput before, SudokuInput after) {
    }

    public Sudoku(){
        //TODO Create a Sudoku with the matrix fill with 0 and an empty list of changes;
    }

    public Sudoku(String sudokuString){
        //TODO Create a sudoku from a string of len 9x9 where every 9 chars correspond to a row
    }

    @Override
    public Boolean isFinished() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean didPlayerWin() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void surrender() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void renderToConsole() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        
    }

    private Boolean checkRows(){
        // TODO Return true if there is no error related to rows;
        return false;
    }

    private Boolean checkCols(){
        // TODO Return true if there is no error related to columns;
        return false;
    }

    private Boolean checkSquares(){
        // TODO Return true if there is no error related to squares;
        return false;
    }

    @Override
    public void nextRound(String userInput) throws InvalidUserInputException, InvalidMovementException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void printRules() {
        // TODO Auto-generated method stub
    }

    @Override
    public String toString() {
        // TODO Convert the sudoku matrix in a one line string of len 9x9;
        return "";
    }

}
