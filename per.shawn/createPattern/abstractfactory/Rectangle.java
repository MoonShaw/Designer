package createPattern.abstractfactory;

/**
 * Created by shawn on 2017/3/27.
 * 产品类 shape的实现
 */
public class Rectangle implements AbstractShape {
    @Override
    public void draw() {
        System.out.println("我是三角形");
    }
}
