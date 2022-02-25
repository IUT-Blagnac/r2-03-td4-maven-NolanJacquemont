import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClasseEssaiPile {

    private static final Logger logger = Logger.getLogger("ClasseEssaiPile");
    private static final ConsoleHandler handler = new ConsoleHandler();

    public static void main(String[] args) {
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
        Pile<Integer> maPile = new Pile<>();
        if (!maPile.isEmpty()) logger.log(Level.WARNING, "NOK");
        maPile.push(5);
        if (!maPile.isEmpty()) logger.log(Level.FINE, "OK");
        maPile.unpush();
        if (maPile.isEmpty()) logger.log(Level.FINE, "OK");
        maPile.push(7);
        maPile.push(15);
        maPile.push(27);
        if (maPile.top() == 27) logger.log(Level.FINE, "OK");
    }
}