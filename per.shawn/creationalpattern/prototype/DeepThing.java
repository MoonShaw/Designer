package creationalpattern.prototype;

import java.util.ArrayList;

/**
 * Created by shawn on 2017/4/6.
 */
public class DeepThing implements Cloneable {
    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected DeepThing clone() {

        DeepThing deepThing = null;

        try {
            deepThing = (DeepThing) super.clone();
            this.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return deepThing;
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }
}
