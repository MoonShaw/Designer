package creationalpattern.factory;

/**
 * Created by shawn on 17/3/23.
 */
public class FactoryPatternDemo {


    public static void main(String[] args){

        ShapeFactory shapeFactory = new ShapeFactory();

        // 画圆形
        Shape circleShape = shapeFactory.drawShape(Circle.class);
        circleShape.draw();

        //画三角形
        Shape rectangleShape = shapeFactory.drawShape(Rectangle.class);
        rectangleShape.draw();

        //画正方形
        Shape SquareShape = shapeFactory.drawShape(Square.class);
        SquareShape.draw();




    }
}
