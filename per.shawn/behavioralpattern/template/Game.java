package behavioralpattern.template;

/**
 * Created by shawn on 2017/3/27.
 * 抽象类
 */
public abstract class Game {

    //基本方法
    protected abstract void initalize();

    //基本方法
    protected abstract void startPlay();

    //基本方法
    protected abstract void endPlay();


    final void play(){

        initalize();

        startPlay();

        endPlay();
    }
}
