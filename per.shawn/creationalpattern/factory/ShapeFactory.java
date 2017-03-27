package creationalpattern.factory;

/**
 * Created by shawn on 17/3/23.
 *
 * 形状工厂类
 */
public class ShapeFactory {

    public <T extends Shape> T drawShape(Class<T> c){


        Shape shape = null;

        try {
            shape = (Shape) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T)shape;

    }


}
