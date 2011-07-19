import java.util.*;

class MockIO extends IO {

  private String inputString;
  private String outputString;

  public MockIO() {
    inputString = new String();
    outputString = new String();
  }

  public void read(String input) {
    inputString = inputString.concat(input);
  }

  public void print(String output) {
    outputString = outputString.concat(output);
  }

  public String getInputString() {
    return inputString;
  }

  public String getOutputString() {
    return outputString;
  }
}
