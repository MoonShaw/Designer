package behavioralpattern.mediator;

/**
 * Created by shawn on 2017/4/6.
 * 通用中介者
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething() {
        //调用同事类的方法
        super.concreteColleague.selfMethod2();
    }
}
