public class GameObserver {

  private Board gameBoard;

  public GameObserver() {
    gameBoard = new Board();
  }

  public GameObserver(Board myBoard) {
    gameBoard = myBoard;
  }

  public boolean hasWinner() {
    return checkForWin(gameBoard.arrayOfRowSums()) ||
           checkForWin(gameBoard.arrayOfColumnSums()) ||
           checkForWin(gameBoard.leftDiagonalValue()) ||
           checkForWin(gameBoard.rightDiagonalValue());
  }

  private boolean checkForWin(int [] sums) {
    for(int sum : sums)
      if(Math.abs(sum) == 3)
        return true;
    return false;
  }

  private boolean checkForWin(int sum) {
    if(Math.abs(sum) == 3)
      return true;
    else
      return false;
  }
}
