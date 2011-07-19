import junit.framework.TestCase;

public class GameObserverTest extends TestCase {

  private Board myBoard = new Board();
  private GameObserver observer = new GameObserver(myBoard);

  public void testCheckForHorizontalWin() throws Exception {
    myBoard.setValueAt(new Position(0,0), 1);
    myBoard.setValueAt(new Position(0,1), 1);
    assertEquals(observer.hasWinner(), false);

    myBoard.setValueAt(new Position(0,2), 1);
    assertEquals(observer.hasWinner(), true);
  }

  public void testCheckForVerticalWin() throws Exception {
    myBoard.setValueAt(new Position(0,0), 1);
    myBoard.setValueAt(new Position(1,0), 1);
    assertEquals(observer.hasWinner(), false);

    myBoard.setValueAt(new Position(2,0), 1);
    assertEquals(observer.hasWinner(), true);
  }

  public void testCheckForLeftDiagonalWin() throws Exception {
    myBoard.setValueAt(new Position(0,0), 1);
    myBoard.setValueAt(new Position(1,1), 1);
    assertEquals(observer.hasWinner(), false);

    myBoard.setValueAt(new Position(2,2), 1);
    assertEquals(observer.hasWinner(), true);
  }

  public void testCheckForRightDiagonalWin() throws Exception {
    myBoard.setValueAt(new Position(0,2), 1);
    myBoard.setValueAt(new Position(1,1), 1);
    assertEquals(observer.hasWinner(), false);

    myBoard.setValueAt(new Position(2,0), 1);
    assertEquals(observer.hasWinner(), true);
  }
}
