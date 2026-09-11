
package PlayerBehavior;


public class TakeLetter implements TakeLetterBehavior {

    @Override
    public void takeLetter(char[] currentArr, String answer) {

        while (true) {
            int random = (int) (Math.random() * currentArr.length);

            if (currentArr[random] == '-') {
                currentArr[random] = answer.charAt(random);
                break;
            }

        }
    }
}
