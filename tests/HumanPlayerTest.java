import junit.framework.TestCase;
import java.util.*;

public class HumanPlayerTest extends TestCase {

  Board myBoard = new Board();
  GameObserver observer = new GameObserver(myBoard);
  MockIO testIO = new MockIO();
  HumanPlayer testPlayer = new HumanPlayer(myBoard, testIO);
  Queue<String> inputArray = new LinkedList<String>();

  public void testUserGetsPromptedRow() throws Exception {
    testPlayer.promptForMove();
    assertTrue(testIO.getOutputString().contains("Please Enter a Row Value [1-3]:"));
  }

  public void testUserMoveReceived() throws Exception {
    inputArray.add("2");
    testIO.setInput(inputArray);
    assertEquals(2, testPlayer.getMove());
  }

  public void testRepromptIfInvalid() throws Exception {
    inputArray.add("5");
    inputArray.add("3");
    testIO.setInput(inputArray);
    testPlayer.makeMove();
    assertEquals("Please Enter a Row Value [1-3]:Please Enter a Row Value [1-3]:", testIO.getOutputString());
    assertEquals("53", testIO.getInputString());
  }
}
