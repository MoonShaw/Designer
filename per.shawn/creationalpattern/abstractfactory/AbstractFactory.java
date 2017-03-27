package creationalpattern.abstractfactory;


/**
 * Created by shawn on 2017/3/27.
 * 抽象类工厂,所有工厂类的基类
 */
public abstract class AbstractFactory {

    abstract <T extends AbstractShape> T getShape(Class<T> tClass);

    abstract <T extends AbstractColor> T getColor(Class<T> tClass);

}




