class HumanPlayer extends Player {

  public HumanPlayer(Board board, IO io) {
    super(board, io);
  }

  public boolean makeMove(Position position) {return true;}
  public void getMove() {}
}
