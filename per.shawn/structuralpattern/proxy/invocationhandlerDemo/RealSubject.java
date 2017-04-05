package structuralpattern.proxy.invocationhandlerDemo;

/**
 * Created by shawn on 2017/4/5.
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("do somthing! ----->"+str);
    }
}
