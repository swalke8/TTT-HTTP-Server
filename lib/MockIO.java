import java.util.*;

class MockIO extends IO {

  private Queue<String> userInput;
  private String inputString;
  private String outputString;

  public MockIO() {
    userInput = new LinkedList<String>();
    inputString = new String();
    outputString = new String();
  }

  public void setInput(Queue<String> inputArray) {
    userInput = inputArray;
  }

  public String read() {
    String input = new String(userInput.poll());
    inputString = inputString.concat(input);
    return input;
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
