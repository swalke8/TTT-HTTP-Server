import junit.framework.TestCase;
import java.util.*;

public class MockIOTest extends TestCase {
  MockIO IOStream = new MockIO();

  public void testStoresOutput() throws Exception {
    IOStream.print("Hello World!");
    assertEquals(IOStream.getOutputString(), "Hello World!");
  }

  public void testStoresInput() throws Exception {
    Queue<String> testInput = new LinkedList<String>();
    testInput.add("Stephen");
    IOStream.setInput(testInput);
    assertEquals(IOStream.read(), "Stephen");
  }
}
