package creationalpattern.builder;

/**
 * Created by shawn on 2017/3/27.
 */
public abstract class ColdDrink implements Item {

    public Packing packing(){
        return new Bottle();
    }

    public abstract float price();
}
