import junit.framework.TestCase;

public class MockIOTest extends TestCase {
  IO IOStream = new MockIO();

  public void testOne() throws Exception {
    assertEquals(true, true);
  }
}
