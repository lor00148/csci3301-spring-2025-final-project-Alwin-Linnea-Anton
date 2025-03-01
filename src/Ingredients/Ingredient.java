package Ingredients; // FIGURE THIS OUT SOMEHOW

public class Ingredient {
    public enum IngredientType {Meat, AnimalProduct, Vegan}
    protected IngredientType type;
    protected String name;
    protected int amount;

    public Ingredient(IngredientType type, String name, int amount)
    {
        this.type = type;
        this.name = name;
        this.amount = amount;
    }

    public String getIngredient() {
        return name;
    }

    public int getIngredientAmount() {
        return amount;
    }
}
