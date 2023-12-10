import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        PatientManager patientManager = new PatientManager(new ArrayList<>(), new CsvFileManager());
        PatientView patientView = new PatientView();
        DietitianManager dietitianManager = new DietitianManager(new ArrayList<>(), new CsvFileManager());
        DietitianView dietitianView = new DietitianView();
        DietPlanManager dietPlanManager = new DietPlanManager(new ArrayList<>());
        DietPlanView dietPlanView = new DietPlanView();
        MealManager mealManager = new MealManager(new ArrayList<>());
        MealView mealView = new MealView();
        ConsoleInterface consoleInterface = new ConsoleInterface(patientManager, dietitianManager, dietPlanManager, mealManager, patientView, dietitianView, dietPlanView, mealView);
        consoleInterface.startConsole();
        
    }
}
