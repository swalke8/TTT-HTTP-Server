import junit.framework.TestCase;

public class SocketServiceTest extends TestCase {
  public void testOneConnection() throws Exception {
    SocketService ss = new SocketService();
    ss.serve(999);
    connection(999);
    ss.close();
    assertEquals(1, ss.connections());
  }
}
