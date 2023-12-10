package src.com.example.model; 
import java.util.List;
import java.util.Iterator;

public class MealManager {
    private List<Meal> meals;
    private static final String MEALS_CSV = "meals.csv";

    public MealManager(List<Meal> meals) {
        this.meals = meals;
    }

    public void createMeal(Meal meal) {
        meals.add(meal);
        updateCSV();
    }

    public void adjustMeal(Meal meal) {
        int index = findMealIndex(meal.getName());
        if (index != -1) {
            meals.set(index, meal);
            updateCSV();
        } else {
            throw new IllegalArgumentException("Meal not found with name: " + meal.getName());
        }
    }

    public void updateMeal(Meal updatedMeal) {
        int index = findMealIndex(updatedMeal.getName());
        if (index != -1) {
            meals.set(index, updatedMeal);
            updateCSV();
        } else {
            throw new IllegalArgumentException("Meal not found with name: " + updatedMeal.getName());
        }
    }
     public void deleteMeal(int mealId) { 
        Iterator<Meal> iterator = meals.iterator();
        while (iterator.hasNext()) {
            Meal meal = iterator.next();
            if (meal.getMealId() == mealId) {
                iterator.remove(); 
                return;
            } 
        }
        throw new IllegalArgumentException("Meal not found with ID: " + mealId);
        }

    private void updateCSV() {
        // Implement logic to update the CSV file with the current list of meals
        // This may involve writing the entire list to the CSV file or updating specific entries
        // Example: CSVWriter.writeMealsToCSV(MEALS_CSV, meals);
    }

    private int findMealIndex(String mealName) {
        for (int i = 0; i < meals.size(); i++) {
            if (meals.get(i).getName().equals(mealName)) {
                return i;
            }
        }
        return -1;
    }
    public List<Meal> getAllMeals() {
        return meals;
    }
}
