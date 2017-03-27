package behavioralpattern.template;

/**
 * Created by shawn on 2017/3/27.
 */
public class Football extends Game {
    @Override
    protected void initalize() {
        System.out.println("Football game Initialized!Start playing.");
    }

    @Override
    protected void startPlay() {

        System.out.println("Football game Started!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football game end!");
    }
}
