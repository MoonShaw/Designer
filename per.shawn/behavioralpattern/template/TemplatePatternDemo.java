package behavioralpattern.template;

/**
 * Created by shawn on 2017/3/27.
 */
public class TemplatePatternDemo {

    public static void main(String[] args){

        Game game = new Cricket();
        game.play();

        game = new Football();
        game.play();

    }
}
