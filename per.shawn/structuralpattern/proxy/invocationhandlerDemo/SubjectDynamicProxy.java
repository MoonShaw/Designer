package structuralpattern.proxy.invocationhandlerDemo;

import java.lang.reflect.InvocationHandler;

/**
 * Created by shawn on 2017/4/5.
 */
public class SubjectDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(Subject subject){


        ClassLoader loader = subject.getClass().getClassLoader();

        Class<?>[] classes = subject.getClass().getInterfaces();

        InvocationHandler handler = new MyInvocationHandler(subject);

        return newProxyInstance(loader,classes,handler);
    }
}
