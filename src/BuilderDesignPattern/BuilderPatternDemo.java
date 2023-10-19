package BuilderDesignPattern;

public class BuilderPatternDemo {
    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("vegMeal");

        vegMeal.showItems();
        System.out.println("Total cost"+vegMeal.getCost());

        MealBuilder mealBuilder2 = new MealBuilder();
        Meal vegMeal2 = mealBuilder2.prepareNonVegMeal();
        System.out.println("Non-veg-meal");

        vegMeal2.showItems();
        System.out.println("Total cost"+vegMeal2.getCost());

    }
}
