
package Game;

public class TimeManager {

    private int totalTime;    
    private int estimateTime;   

    public TimeManager(int totalTime) {
        this.totalTime = totalTime;
        this.estimateTime = 0;
    }

    public void tickTotal() {
        totalTime--;
    }

    public boolean isTimeOver() {
        return totalTime <= 0;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void startEstimate() {
        estimateTime = 15;
    }

    public void tickEstimate() {
        estimateTime--;
    }

    public boolean isEstimateOver() {
        return estimateTime <= 0;
    }

    public int getEstimateTime() {
        return estimateTime;
    }
}
