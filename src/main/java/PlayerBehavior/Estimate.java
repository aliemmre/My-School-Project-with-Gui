
package PlayerBehavior;


public class Estimate implements EstimateBehavior {

    @Override
    public boolean estimate(String answer, String estimate, char[] currentArr) {
        if (estimate.equalsIgnoreCase(answer)) {
            for (int i = 0; i < currentArr.length; i++) {

                currentArr[i] = answer.charAt(i);
            }
        }
        return estimate.equalsIgnoreCase(answer);
    }

}
