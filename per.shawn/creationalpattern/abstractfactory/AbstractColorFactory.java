package creationalpattern.abstractfactory;

/**
 * Created by shawn on 2017/3/27.
 */
public class AbstractColorFactory extends AbstractFactory {
    @Override
    <T extends AbstractShape> T getShape(Class<T> tClass) {
       return null;
    }

    @Override
    <T extends AbstractColor> T getColor(Class<T> tClass) {
        AbstractColor color = null;

        try {
            color = (AbstractColor) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T)color;
    }
}
