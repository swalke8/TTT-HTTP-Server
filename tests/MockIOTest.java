import junit.framework.TestCase;

public class MockIOTest extends TestCase {
  MockIO IOStream = new MockIO();

  public void testStoresOutput() throws Exception {
    IOStream.print("Hello World!");
    assertEquals(IOStream.getOutputString(), "Hello World!");
  }

  public void testStoresInput() throws Exception {
    String testInput = new String("Stephen");
    IOStream.read(testInput);
    assertEquals(IOStream.getInputString(), "Stephen");
  }
}
