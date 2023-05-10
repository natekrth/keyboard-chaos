import java.lang.*;

public class Stopwatch {
    private final long time = 0;
    long begin;

    public void start() {
        begin = System.currentTimeMillis();
    }

    public long getBegin() {
        return begin;
    }

    public long elapsedTime() {
        long now = System.currentTimeMillis();
        return (long) ((now - getBegin()) / 1000.0);
    }

}
