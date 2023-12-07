import java.io.Serializable;

public class Meal implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String macronutrients;
    private int calories;
    private String timeOfDay;
 public Meal(String name, String macronutrients, int calories, String timeOfDay) {
        this.name = name;
        this.macronutrients = macronutrients;
        this.calories = calories;
        this.timeOfDay = timeOfDay;
    }

    // Getters and setters...
    public String getName() {
        return name;
    }
    public void setName(String mealName) {
        this.name = mealName;
    }
    public String getMacronutrients() {
        return macronutrients;
    }
    public void setMacronutrients(String mealMacronutrients) {
        this.macronutrients = mealMacronutrients;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int mealCalories) {
        this.calories = mealCalories;
    }
    public String getTimeOfDay() {
        return timeOfDay;
    }
    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", macronutrients='" + macronutrients + '\'' +
                ", calories=" + calories +
                ", timeOfDay='" + timeOfDay + '\'' +
                '}';
    }
}