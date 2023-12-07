import java.util.List;

public class MealManager {
    private List<Meal> meals;

    public MealManager(List<Meal> meals) {
        this.meals = meals;
    }

    public void createMeal(Meal meal) {
        meals.add(meal);
        // Implement logic to save to CSV file...
    }

    public void adjustMeal(Meal meal) {
        int index = findMealIndex(meal.getName());
        if (index != -1) {
            meals.set(index, meal);
            // Update CSV file...
        } else {
            throw new IllegalArgumentException("Meal not found with name: " + meal.getName());
        }
    }

    private int findMealIndex(String mealName) {
        for (int i = 0; i < meals.size(); i++) {
            if (meals.get(i).getName().equals(mealName)) {
                return i;
            }
        }
        return -1;
    }
}
