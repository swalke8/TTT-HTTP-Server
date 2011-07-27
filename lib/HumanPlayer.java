class HumanPlayer extends Player {

  public HumanPlayer(Board board, IO io) {
    super(board, io);
  }

  public void makeMove() {
    do {
      promptForMove("Row");
      move.setRow(getMove());
      promptForMove("Column");
      move.setColumn(getMove());
    } while (invalidMove());
  }

  public int getMove() {
    return Integer.parseInt(ioStream.read());
  }

  public void promptForMove(String rowOrColumn) {
    ioStream.print("Please Enter a " + rowOrColumn + " Value [1-3]:");
  }

  private boolean invalidMove() {
    return (move.invalidRow() || move.invalidColumn());
  }
}
