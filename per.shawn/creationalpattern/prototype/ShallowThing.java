package creationalpattern.prototype;

import java.util.ArrayList;

/**
 * Created by shawn on 2017/4/6.
 */
public class ShallowThing  implements Cloneable{

    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected ShallowThing clone() {

        ShallowThing shallowThing = null;

        try {
            shallowThing = (ShallowThing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return shallowThing;
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }
}
