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
        if(food == FoodTypes.Cheese)
        {
            return new Cheese();
        }
        if(food == FoodTypes.Milk)
        {
            return new Milk();
        }
        if(food == FoodTypes.Eggs)
        {
            return new Eggs();
        }
        if(food == FoodTypes.Pork)
        {
            return new Pork();
        }
        if(food == FoodTypes.Ribs)
        {
            return new Ribs();
        }
        if(food == FoodTypes.Steak)
        {
            return new Steak();
        }
        return null;
    }
}
