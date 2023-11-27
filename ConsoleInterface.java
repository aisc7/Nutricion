import java.util.Scanner;
public class ConsoleInterface {
    public Scanner scanner;
    private PatientManager patientManager;
    private DietitianManager dietitianManager;
    private DietPlanManager dietPlanManager;
    private MealManager mealManager;

    public ConsoleInterface(Scanner scanner, PatientManager patientManager, DietitianManager dietitianManager,
                            DietPlanManager dietPlanManager, MealManager mealManager) {
        this.scanner = scanner;
        this.patientManager = patientManager;
        this.dietitianManager = dietitianManager;
        this.dietPlanManager = dietPlanManager;
        this.mealManager = mealManager;
    }

    public void startConsole() {
        // Implement the console interface operations...
        // 1. Register a new patient
        // 2. Update an existing patient
        // 3. Delete an existing patient
        // 4. Register a new dietitian
        // 5. Update an existing dietitian
        // 6. Delete an existing dietitian
        // 7. Register a new diet plan
        // 8. Update an existing diet plan
        // 9. Delete an existing diet plan
        // 10. Register a new meal
        // 11. Update an existing meal
        // 12. Delete an existing meal
        // 13. Exit
    }
}