package behavioralpattern.mediator;

/**
 * Created by shawn on 2017/4/6.
 * 具体同事类
 */
public class ConcreteColleague  extends Colleague{


    //通过构造函数传递中介者
    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    //自由方法 self-method
    public void selfMethod(){
        //处理自己的业务逻辑
        System.out.println("我是同事类，我在处理垃圾");
    }


    public void selfMethod2(){
        //处理自己的业务逻辑
        System.out.println("我是同事类，我通过中介类在干别的！");
    }

    //依赖方法 dep-method
    public void depMethod(){
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑，委托给中介者处理
        System.out.println("我需要中介类帮助！");
        super.mediator.doSomething();
    }
}
