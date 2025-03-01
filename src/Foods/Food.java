package Foods; // FIGURE THIS OUT SOMEHOW

public class Food {
    public enum FoodCategory {Meat, Vegetarian, Vegan}
    protected FoodCategory category;
    protected FoodTypes type;


    public FoodCategory getCategory()
    {
        return category;
    }

    public FoodTypes getType()
    {
        return type;
    }
    public String toString()
    {
        return type.toString() + " is a food of the " + type.toString() + " category";
    } 
    
}
