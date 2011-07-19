import junit.framework.TestCase;

public class BoardTest extends TestCase {

  private Board myBoard = new Board();
  private Position position1 = new Position(0,0);
  private Position position2 = new Position(2,2);

  public void testHasEmptyBoard() throws Exception {
    for(int row = 0; row < 3; row++)
      for(int column = 0; column < 3; column++)
        assertEquals(myBoard.valueAt(new Position(row, column)), 0);
  }

  public void testSetValueOfBoard() throws Exception {
    myBoard.setValueAt(position1, 1);
    assertEquals(myBoard.valueAt(position1), 1);
  }

  public void testPositionIsOccupied() throws Exception {
    myBoard.setValueAt(position2, 1);
    assertEquals(myBoard.isOpenPosition(position2), false);
  }

  public void testRowValue() throws Exception {
    myBoard.setValueAt(position1, 1);
    myBoard.setValueAt(new Position(0,1), 1);

    assertEquals(myBoard.rowValue(0), 2);
  }

  public void testColumnValue() throws Exception {
    myBoard.setValueAt(position2, -1);
    myBoard.setValueAt(new Position(1, 2), -1);

    assertEquals(myBoard.columnValue(2), -2);
  }

  public void testArrayOfRowSums() throws Exception {
    myBoard.setValueAt(position1, 1);
    myBoard.setValueAt(position2, -1);

    int[] rowSums = new int[3];
    rowSums[0] = 1; rowSums[1] = 0; rowSums[2] = -1;
    for(int i = 0; i < 3; i++)
      assertEquals(myBoard.arrayOfRowSums()[i], rowSums[i]);
  }

  public void testArrayOfColumnSums() throws Exception {
    myBoard.setValueAt(position1, 1);
    myBoard.setValueAt(position2, -1);
    
    int[] columnSums = new int[3];
    columnSums[0] = 1; columnSums[1] = 0; columnSums[2] = -1;
    for(int i = 0; i < 3; i++)
      assertEquals(myBoard.arrayOfColumnSums()[i], columnSums[i]);
  }

  public void testLeftDiagonalValue() throws Exception {
    myBoard.setValueAt(position1, 1);
    myBoard.setValueAt(position2, 1);

    assertEquals(myBoard.leftDiagonalValue(), 2);
  }

  public void testRightDiagonalValue() throws Exception {
    myBoard.setValueAt(new Position(0,2), 1);
    myBoard.setValueAt(new Position(2,0), 1);

    assertEquals(myBoard.rightDiagonalValue(), 2);
  }
}
