package behavioralpattern.mediator;

/**
 * Created by shawn on 2017/4/6.
 * 抽象同事类
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
