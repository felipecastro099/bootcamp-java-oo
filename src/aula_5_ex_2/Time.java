package aula_5_ex_2;

public class Time {
    private long start;
    private long stop;

    public void start() {
         this.start = System.currentTimeMillis();
    }

    public void stop() {
        this.stop = System.currentTimeMillis();
    }

    public long elapsedTime() {
        return this.stop - this.start;
    }
}
