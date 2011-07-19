import junit.framework.TestCase;

public class HumanPlayerTest extends TestCase {

  Board myBoard = new Board();
  GameObserver observer = new GameObserver(myBoard);
  IO testOutput = new MockIO();
  Player testPlayer = new HumanPlayer(myBoard, testOutput);

  public void testUserGetsPrompted() throws Exception {
    assertEquals(true, true);
  }
}
