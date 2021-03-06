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

  public void setRow(int rowValue) {
    row = rowValue;
  }

  public void setColumn(int columnValue) {
    column = columnValue;
  }

  public boolean invalidRow() {
    return (row < 1 || row > 3);
  }

  public boolean invalidColumn() {
    return (column < 1 || column > 3);
  }
}
