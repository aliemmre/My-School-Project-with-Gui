
package Game;


public class WordState {
  private String answer;
    private char[] current;

    public WordState(String answer) {
        setNewAnswer(answer);
    }
    
    public  String fillingArrayAsANotVisible(char[] empthyAnswerArray) {
        String output="";
        for (int i = 0; i < empthyAnswerArray.length; i++) {

            empthyAnswerArray[i] = '-';
            output+=empthyAnswerArray[i]+" ";
        }
        return output;

    }
     public  String  printCurrentArr(char []currentArray) {
         String output="";
        for (int i = 0; i < currentArray.length; i++) {
           output+=currentArray[i];
            
        }
      return output;
        
    }

    public void setNewAnswer(String answer) {
        this.answer = answer;
        this.current = new char[answer.length()];

        for (int i = 0; i < current.length; i++) {
            current[i] = '-';
        }
    }

    public boolean isCompleted() {
        for (char c : current) {
            if (c == '-') return false;
        }
        return true;
    }

    public String getAnswer() {
        return answer;
    }

    public char[] getCurrent() {
        return current;
    }
}