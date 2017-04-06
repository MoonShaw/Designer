package behavioralpattern.mediator;

/**
 * Created by shawn on 2017/4/6.
 * 通用抽象中介者
 */
public abstract class Mediator {

    //定义同事类
    protected ConcreteColleague concreteColleague;


    /**
     * 1. 通过构造函数设置同事类
     * 2. 通过get/set方法设置同事类
     */

    public Mediator() {
        this.concreteColleague = new ConcreteColleague(this);
    }

    /*public ConcreteColleague getConcreteColleague() {
        return concreteColleague;
    }

    public void setConcreteColleague(ConcreteColleague concreteColleague) {
        this.concreteColleague = concreteColleague;
    }*/

    //中介者模式的业务逻辑
    public abstract void doSomething();


}
