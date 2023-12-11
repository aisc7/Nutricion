package src.com.example;
import src.com.example.model.*;
import src.com.example.manager.*;
import src.com.example.ui.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        src.com.example.manager.CsvFileManager csvFileManager = new src.com.example.manager.CsvFileManager();
        src.com.example.manager.PatientManager patientManager = new src.com.example.manager.PatientManager(patients, csvFileManager);
        
        List<Dietitian> dietitians = new ArrayList<>();
        src.com.example.manager.DietitianManager dietitianManager = new src.com.example.manager.DietitianManager(dietitians, csvFileManager);

        src.com.example.manager.DietPlanManager dietPlanManager = new src.com.example.manager.DietPlanManager(new ArrayList<>());
        src.com.example.manager.MealManager mealManager = new src.com.example.manager.MealManager(new ArrayList<>());

        src.com.example.ui.PatientView patientView = new src.com.example.ui.PatientView(patientManager);
        src.com.example.ui.DietitianView dietitianView = new src.com.example.ui.DietitianView(dietitianManager);
        src.com.example.ui.DietPlanView dietPlanView = new src.com.example.ui.DietPlanView(dietPlanManager);
        src.com.example.ui.MealView mealView = new src.com.example.ui.MealView(mealManager);

        ConsoleInterface consoleInterface = new ConsoleInterface(  patientManager, dietitianManager, dietPlanManager, mealManager,
            patientView, dietitianView, dietPlanView, mealView );

        consoleInterface.startConsole();
    }
}