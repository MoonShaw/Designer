package creationalpattern.builder;

/**
 * Created by shawn on 2017/3/27.
 */
public class MealBuilder {

    public Meal prepareVegMel(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());

        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return meal;
    }
}
