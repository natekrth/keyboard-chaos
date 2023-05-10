public class Game {
    private Board word;
    private Setting setting;
    private Stopwatch stopwatch;

    public Game(){
        word = new Board(5, 20);
        setting = Setting.getInstance();
        stopwatch = new Stopwatch();
    }
    public void start(){
        stopwatch.start();
        // TODO: something here
    };
}
