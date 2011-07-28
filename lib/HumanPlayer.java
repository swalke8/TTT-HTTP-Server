class HumanPlayer extends Player {

  public HumanPlayer(Board board, IO io) {
    super(board, io);
  }

  public void makeMove() {
    do {
      promptForMove("Row");
      getRow();
      promptForMove("Column");
      getColumn();
    } while (invalidMove());
  }

  public void getRow() {
    move.setRow(getMove());
  }

  public void getColumn() {
    move.setColumn(getMove());
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
