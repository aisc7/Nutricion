package src.com.example.manager;
import java.util.List;
import java.util.Iterator;
import src.com.example.model.*;

public class MealManager {
    private List<Meal> meals;
    private static final String MEALS_CSV = "meals.csv";
    private CsvFileManager csvFileManager;

    public MealManager(List<Meal> meals) {
        this.meals = meals;
    }

    public void createMeal(Meal meal) {
        meals.add(meal);
        saveMealsToFile();
    }

    public void adjustMeal(Meal meal) {
        int index = findMealIndex(meal.getName());
        if (index != -1) {
            meals.set(index, meal);
            saveMealsToFile();
        } else {
            throw new IllegalArgumentException("Meal not found with name: " + meal.getName());
        }
    }

    private void saveMealsToFile() {
        try {
            csvFileManager.saveMeals(meals);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateMeal(Meal updatedMeal) {
        int index = findMealIndex(updatedMeal.getName());
        if (index != -1) {
            meals.set(index, updatedMeal);
            
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

    public void registerMeal(Meal meal) {
        meals.add(meal);
    }
}
