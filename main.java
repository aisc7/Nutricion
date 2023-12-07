import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        PatientManager patientManager = new PatientManager(new ArrayList<>(), new CsvFileManager());
        PatientView patientView = new PatientView();
        DietitianManager dietitianManager = new DietitianManager(new ArrayList<>());
        DietPlanManager dietPlanManager = new DietPlanManager(new ArrayList<>());
        MealManager mealManager = new MealManager(new ArrayList<>());
        ConsoleInterface consoleInterface = new ConsoleInterface(patientManager, dietitianManager, dietPlanManager, mealManager, patientView);
        consoleInterface.startConsole();
        
    }
}
