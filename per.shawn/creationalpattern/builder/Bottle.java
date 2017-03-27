package creationalpattern.builder;

/**
 * Created by shawn on 2017/3/27.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
