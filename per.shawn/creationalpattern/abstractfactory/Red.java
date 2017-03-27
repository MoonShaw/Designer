package creationalpattern.abstractfactory;

/**
 * Created by shawn on 2017/3/27.
 * 产品类 Color的实现
 */
public class Red implements AbstractColor {
    @Override
    public void fill() {
        System.out.println("用红色填充");
    }
}
