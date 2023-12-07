
import javax.swing.JOptionPane;
public class ConsoleInterface {
    private PatientManager patientManager;
    private DietitianManager dietitianManager;
    private DietPlanManager dietPlanManager;
    private MealManager mealManager;
    private PatientView Patientview;


    public ConsoleInterface(PatientManager patientManager, DietitianManager dietitianManager,
                            DietPlanManager dietPlanManager, MealManager mealManager, PatientView Patientview) {
        
        this.patientManager = patientManager;
        this.dietitianManager = dietitianManager;
        this.dietPlanManager = dietPlanManager;
        this.mealManager = mealManager;
        this.Patientview = Patientview;
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
        // Use JOptionPane to display the menu options and get the user's choice
        while (true) {
            String[] opciones = {
                    "Opción 1",
                    "Opción 2",
                    "Opción 3",
                    "Opción 4",
                    "Opción 5",
                    "Opción 6",
                    "Opción 7",
                    "Opción 8",
                    "Opción 9",
                    "Opción 10",
                    "Opción 11",
                    "Opción 12",
                    "Salir"
            };

            int opcion = JOptionPane.showOptionDialog(
                    null,
                    "Elija una opción:",
                    "Menú",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            switch (opcion) {
                case 0:
                    registerPatientview();
                    break;
                case 12:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
            }
        }
    }

     public void registerPatientview(){
        String id = Patientview.getInput("introduce el id del paciente");
        String name = Patientview.getInput("introduce el nombre del paciente");
        String age = Patientview.getInput("introduce la edad");
        String weight = Patientview.getInput("introduce el peso");
        String height = Patientview.getInput("introduce la altura");
        String preexistingConditions = Patientview.getInput("introduce las condiciones preexistentes");
        patientManager.registerPatient(new Patient(Integer.parseInt(id), name, Integer.parseInt(age), Double.parseDouble(weight), Double.parseDouble(height), preexistingConditions));
        Patientview.showMessage("usuario creado exitosamente");
    } 

}