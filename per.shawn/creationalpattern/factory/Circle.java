package creationalpattern.factory;

/**
 * Created by shawn on 17/3/23.
 *
 * 圆形,继承形状接口类,进行实现
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
