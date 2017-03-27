package creationalpattern.abstractfactory;

/**
 * Created by shawn on 2017/3/27.
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[]  args){

        AbstractFactory shapeFactory = FactoryProducer.getFactory(AbstractShapeFactory.class);

        AbstractShape shape1 = shapeFactory.getShape(Circle.class);
        shape1.draw();

        AbstractShape shape2 = shapeFactory.getShape(Square.class);
        shape2.draw();

        AbstractShape shape3 = shapeFactory.getShape(Rectangle.class);
        shape3.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory(AbstractColorFactory.class);


        AbstractColor color1 = colorFactory.getColor(Red.class);
        color1.fill();
        AbstractColor color2 = colorFactory.getColor(Blue.class);
        color2.fill();
        AbstractColor color3 = colorFactory.getColor(Green.class);
        color3.fill();

    }
}
