package TLOSUNG._390_Kopfrechnen;


public class Stopwatch {

    private long startTime;
    private long lapTime;

    public void start() {
        startTime = System.nanoTime();
        lapTime = startTime;
    }

    public double stop() {
        return (System.nanoTime() - startTime) / 1000000000.0;
    }

    public double lapTime() {
        long now = System.nanoTime();
        long elapsed = now - lapTime;
        lapTime = now;
        return elapsed / 1000000000.0;
    }

}
