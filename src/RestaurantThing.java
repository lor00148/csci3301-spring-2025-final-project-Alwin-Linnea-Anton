import java.util.ArrayList;

import Foods.FoodFactory;
import Foods.FoodTypes;
import Foods.VeganFactory;
import Foods.Food;

public class RestaurantThing {
    public static void main(String[] args) {
        ArrayList<Food> foods = new ArrayList<>();
        FoodFactory factory = new VeganFactory();
        foods.add(factory.makeFood(FoodTypes.Apple));
        System.out.println(foods.get(0));
    }
}
