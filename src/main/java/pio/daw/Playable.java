package pio.daw;

public interface Playable {
    
    /**
     * It is thown when the input is not readable by the game.
     * @param input user input pass to the game.
     * @param msg Clue to the user
     */
    public class InvalidUserInputException extends Exception {
        public InvalidUserInputException(String input, String msg){
            super(String.format("Invalid Input: %s. %s", input, msg));
        }
    }

    /**
     * It is thown when the input is valid but it leads to an invalid state game.
     * @param input user input pass to the game.
     * @param msg Clue to the user
     */
    public class InvalidMovementException extends Exception {
        public InvalidMovementException(String input, String msg){
            super(String.format("Invalid movement: %s. %s", input, msg));
        }
    }

    /**
     * Show the list of rules that follows the game
     */
    public void printRules();

    /**
     * Updates the game state using the user input.
     * @param userInput movement encoded in a string
     * @throws InvalidUserInputException
     * @throws InvalidMovementException
     */
    public void nextRound(String userInput) throws InvalidUserInputException, InvalidMovementException;

    /**
     * Delete last movement if the game is not finished
     */
    public void undo();

    /**
     * Print to console the game updated since last input
     */
    public void renderToConsole();

    /**
     * Returns true if the game has finished;
     * @return Boolean
     */
    public Boolean isFinished();

    /**
     * Returns true if the player has won the game.
     * @return
     */
    public Boolean didPlayerWin();

    /**
     * Ends the game and the player lose it
     */
    public void surrender();
}
