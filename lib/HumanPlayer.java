class HumanPlayer extends Player {

  public HumanPlayer(Board board, IO io) {
    super(board, io);
  }

  public boolean makeMove() {
    do {
      promptForMove();
      move.setRow(getMove());
    } while (move.row() > 3);
    return true;
  }
  public int getMove() {
    return Integer.parseInt(ioStream.read());
  }
  public void promptForMove() {
    ioStream.print("Please Enter a Row Value [1-3]:");
  }
}
