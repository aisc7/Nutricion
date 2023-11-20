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