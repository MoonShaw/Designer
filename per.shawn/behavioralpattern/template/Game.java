package behavioralpattern.template;

/**
 * Created by shawn on 2017/3/27.
 * 抽象类
 */
public abstract class Game {

    /**
     * 基本最好使用 protected 方法,
     * 实现方法最好用final修饰
     */
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
