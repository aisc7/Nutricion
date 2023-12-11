package src.com.example.model; 
import java.io.Serializable;

public class Meal implements Serializable {
    private static final long serialVersionUID = 1L;

    private int mealId;
    private String name;
    private int patientId;
    private String macronutrients;
    private Double calories;
    private String timeOfDay;
    public Meal(int mealId ,  int patientId, String name, String macronutrients, double calories, String timeOfDay) {
        this.name = name;
        this.macronutrients = macronutrients;
        this.calories = calories;
        this.timeOfDay = timeOfDay;
    }
    
    public Meal(int int1, String name2, String description, int int2, int int3, int int4, int int5) {
    }

    // Getters and setters...
    public String getName() {
        return name;
    }

    public int getMealId() {
        return mealId;
    }
    public void setMealId(int mealId) {
        this.mealId = mealId;
    }
    
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
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
    public Double getCalories() {
        return calories;
    }
    public void setCalories(Double mealCalories) {
        this.calories = mealCalories;
    }
    public String getTimeOfDay() {
        return timeOfDay;
    }
    public void setTimeOfDay(String mealTimeOfDay) {
        this.timeOfDay = mealTimeOfDay;
    }
    public String toCsvString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", macronutrients='" + macronutrients + '\'' +
                ", calories=" + calories +
                ", timeOfDay='" + timeOfDay + '\'' +
                '}';
    }

    public static Meal fromCsvString(String line) {
        return null;
    }
}
