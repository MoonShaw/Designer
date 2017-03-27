package behavioralpattern.template;

/**
 * Created by shawn on 2017/3/27.
 */
public class Cricket extends Game {
    @Override
    protected void initalize() {
        System.out.println("Cricket game Initialized!Start playing.");
    }

    @Override
    protected void startPlay() {

        System.out.println("Cricket game Started!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Cricket game end!");
    }
}
