package creationalpattern.abstractfactory;

/**
 * Created by shawn on 2017/3/27.
 */
public class AbstractShapeFactory extends AbstractFactory {
    @Override
    <T extends AbstractShape> T getShape(Class<T> tClass) {
        AbstractShape shape = null;

        try {
            shape = (AbstractShape) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T)shape;
    }

    @Override
    <T extends AbstractColor> T getColor(Class<T> tClass) {
        return null;
    }
}
