package structuralpattern.proxy.invocationhandlerDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by shawn on 2017/4/5.
 *
 * 动态代理类
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h){

        if(true){

            (new BeforeAdvice()).exec();

        }

        return (T) Proxy.newProxyInstance(loader,interfaces,h);

    }
}
