package Menus;
import Foods.Food;

import java.util.ArrayList;
public class Menu {
    protected ArrayList<Food> foods;

    public Menu(ArrayList<Food> foods)
    {
        this.foods = foods;
    }
    public ArrayList<Food> getFoods()
    {
        return foods;
    }

    public void setFoods(ArrayList<Food> foods)
    {
        this.foods = foods;
    }
    

}
