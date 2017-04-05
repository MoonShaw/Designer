package structuralpattern.proxy.invocationhandlerDemo;

/**
 * Created by shawn on 2017/4/5.
 */
public class ClientDemo {

    public static void main(String[] args){
        Subject subject = new RealSubject();

        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);

        proxy.doSomething("Finish");
    }
}
