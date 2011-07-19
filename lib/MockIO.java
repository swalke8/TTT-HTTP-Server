import java.util.*;

class MockIO extends IO {

  private List<String> inputList;
  private List<String> outputList;

  public MockIO() {
    inputList = new ArrayList<String>();
    outputList = new ArrayList<String>();
  }

  public void getInput(String input) {}

  public void print(String output) {}

}
