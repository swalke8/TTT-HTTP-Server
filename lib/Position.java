public class Position {

  private int row;
  private int column;

  public Position() {
    row = 0;
    column = 0;
  }

  public Position(int rowValue, int columnValue) {
    row = rowValue;
    column = columnValue;
  }

  public int row() {
    return row;
  }

  public int column() {
    return column;
  }
}
