package createPattern;

import createPattern.factory.Shape;

/**
 * Created by shawn on 17/3/23.
 *
 *
 */
public abstract class AbstractShapeFactory {


    public abstract <T extends Shape> T drawShape(Class<T> c);
}
