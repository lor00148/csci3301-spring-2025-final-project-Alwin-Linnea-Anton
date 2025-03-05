package Foods;

public class VeganFactory extends FoodFactory{
    public Food makeFood(FoodTypes food)
    {
        if(food == FoodTypes.Apple)
        {
            return new Apple();
        }
        if(food == FoodTypes.Pear)
        {
            return new Pear();
        }
        if(food == FoodTypes.Banana)
        {
            return new Banana();
        }
        return null;
    }
}
