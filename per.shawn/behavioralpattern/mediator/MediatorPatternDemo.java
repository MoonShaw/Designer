package behavioralpattern.mediator;

/**
 * Created by shawn on 2017/4/6.
 */
public class MediatorPatternDemo {

    public static void main(String[] args){

        //多种实现方法，
        // mediator类中通过getSet方法设置同事类
        //mediatror类通过构造方法初始化同事类


        Mediator concreteMediator = new ConcreteMediator();

        //ConcreteColleague concreteColleague = new ConcreteColleague(concreteMediator);

      //  concreteMediator.setConcreteColleague(concreteColleague);

        concreteMediator.concreteColleague.selfMethod();
        concreteMediator.concreteColleague.depMethod();
    }
}
