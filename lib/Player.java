abstract class Player {
  Board gameBoard;
  IO ioStream;
  Position move = new Position();

  public Player(Board board, IO io) {
    gameBoard = board;
    ioStream = io;
  }

  abstract void makeMove();
  abstract int getMove();
}
