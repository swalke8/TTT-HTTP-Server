public class Board {

  private int gameBoard[][];

  public Board() {
    gameBoard = new int[3][3];
    initializeBoard();
  }

  public int[][] getBoard() {
    return gameBoard;
  }

  public int valueAt(Position position) {
    return gameBoard[position.row()][position.column()];
  }

  public void setValueAt(Position position, int value) {
    gameBoard[position.row()][position.column()] = value;
  }

  public boolean isOpenPosition(Position position) {
    return valueAt(position) == 0;
  }

  public int rowValue(int row) {
    int rowSum = 0;
    for(int value : gameBoard[row])
      rowSum += value;
    return rowSum;
  }

  public int columnValue(int column) {
    int columnSum = 0;
    for(int row = 0; row < 3; row++)
      columnSum += gameBoard[row][column];
    return columnSum;
  }

  public int[] arrayOfRowSums() {
    int[] rowSums = new int[3];
    for(int row = 0; row < 3; row++)
      rowSums[row] = rowValue(row);
    return rowSums;
  }

  public int[] arrayOfColumnSums() {
    int[] columnSums = new int[3];
    for(int column = 0; column < 3; column++)
      columnSums[column] = columnValue(column);
    return columnSums;
  }

  public int leftDiagonalValue() {
    int diagonalSum = 0;
    for(int i = 0; i < 3; i++)
      diagonalSum += gameBoard[i][i];
    return diagonalSum;
  }

  public int rightDiagonalValue() {
    int diagonalSum = 0;
    for(int i = 0; i < 3; i++)
      diagonalSum += gameBoard[2-i][i];
    return diagonalSum;
  }

  private void initializeBoard() {
    for(int[] row : gameBoard)
      for(int column : row)
        column = 0;
  }
}
