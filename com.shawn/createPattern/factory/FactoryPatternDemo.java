package createPattern.factory;

/**
 * Created by shawn on 17/3/23.
 */
public class FactoryPatternDemo {


    public static void main(String[] args){

        ShapeFactory shapeFactory = new ShapeFactory();

        // 画圆形
        Shape circleShape = shapeFactory.drwapShape(Circle.class);
        circleShape.draw();

        //画三角形
        Shape rectangleShape = shapeFactory.drwapShape(Rectangle.class);
        rectangleShape.draw();

        //画正方形
        Shape SquareShape = shapeFactory.drwapShape(Square.class);
        SquareShape.draw();




    }
}
