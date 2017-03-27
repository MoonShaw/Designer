package creationalpattern.abstractfactory;

/**
 * Created by shawn on 2017/3/27.
 * 产品类 Shape的实现类
 */

public class Square implements AbstractShape {
    @Override
    public void draw() {
        System.out.println("我是方形");
    }
}
