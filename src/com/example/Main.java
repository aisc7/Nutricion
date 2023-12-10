package src.com.example;
import src.com.example.model.*;
import src.com.example.manager.*;
import src.com.example.ui.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        CsvFileManager csvFileManager = new CsvFileManager();
        PatientManager patientManager = new PatientManager(patients, csvFileManager);
        
        List<Dietitian> dietitians = new ArrayList<>();
        DietitianManager dietitianManager = new DietitianManager(dietitians, csvFileManager);

        DietPlanManager dietPlanManager = new DietPlanManager(new ArrayList<>());
        MealManager mealManager = new MealManager(new ArrayList<>());

        PatientView patientView = new PatientView(patientManager);
        DietitianView dietitianView = new DietitianView(dietitianManager);
        DietPlanView dietPlanView = new DietPlanView(dietPlanManager);
        MealView mealView = new MealView(mealManager);

        ConsoleInterface consoleInterface = new ConsoleInterface(  patientManager, dietitianManager, dietPlanManager, mealManager,
            patientView, dietitianView, dietPlanView, mealView );

        consoleInterface.startConsole();
    }
}