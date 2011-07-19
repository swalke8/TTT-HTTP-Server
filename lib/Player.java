abstract class Player {
  Board gameBoard;
  IO ioStream;

  public Player(Board board, IO io) {
    gameBoard = board;
    ioStream = io;
  }

  abstract boolean makeMove(Position position);
  abstract void getMove();
}
