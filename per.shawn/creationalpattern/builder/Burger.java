package creationalpattern.builder;

/**
 * Created by shawn on 2017/3/27.
 */
public abstract class Burger implements Item {


    public abstract float price();

    public Packing packing(){
        return new Wrpper();
    }



}
