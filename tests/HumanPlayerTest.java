import junit.framework.TestCase;

public class HumanPlayerTest extends TestCase {

  Board myBoard = new Board();
  GameObserver observer = new GameObserver(myBoard);
  MockIO testOutput = new MockIO();
  HumanPlayer testPlayer = new HumanPlayer(myBoard, testOutput);

  public void testUserGetsPrompted() throws Exception {
    testPlayer.promptForMove();
    assertEquals(testOutput.getOutputString(), "Please Enter a Row Value [1-3]:");
  }
}
