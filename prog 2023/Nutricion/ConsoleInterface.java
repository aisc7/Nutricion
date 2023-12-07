
import javax.swing.JOptionPane;

public class ConsoleInterface {
    private PatientManager patientManager;
    private DietitianManager dietitianManager;
    private DietPlanManager dietPlanManager;
    private MealManager mealManager;
    private PatientView Patientview;
    private DietitianView Dietitianview;
    private DietPlanView DietPlanview;
    private MealView Mealview;

    public ConsoleInterface(PatientManager patientManager, DietitianManager dietitianManager,
            DietPlanManager dietPlanManager, MealManager mealManager, PatientView Patientview,
            DietitianView Dietitianview, DietPlanView DietPlanview, MealView Mealview) {

        this.patientManager = patientManager;
        this.dietitianManager = dietitianManager;
        this.dietPlanManager = dietPlanManager;
        this.mealManager = mealManager;
        this.Patientview = Patientview;
        this.Dietitianview = Dietitianview;
        this.DietPlanview = DietPlanview;
        this.Mealview = Mealview;

    }

    public void startConsole() {
        // Implement the console interface operations...
        while (true) {
            String[] options = {
                    "Pacientes",
                    "Nutricionistas",
                    "Planes de dieta",
                    "Comidas",
                    "Salir"
            };

            int option = JOptionPane.showOptionDialog(
                    null,
                    "Elija una opción:",
                    "Menú",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            switch (option) {
                case 0:
                    String[] options1 = {
                            "Registrar paciente",
                            "Consultar paciente",
                            "Actualizar paciente",
                            "Eliminar paciente",
                            "Salir"
                    };
                    int option1 = JOptionPane.showOptionDialog(
                            null,
                            "Elija una opción:",
                            "Pacientes",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options1,
                            options1[0]);
                    switch (option1) {
                        case 0:
                            registerPatientView();
                            break;
                        case 1:
                            findPatientIndexView();
                            break;

                        case 2:
                            updatePatientView();    
                            break;
                        case 3:
                            deletePatientView();
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                            System.exit(0);

                    }
                    break;
                case 1:
                    String[] options2 = {
                            "Registrar nutricionista",
                            "Consultar nutricionista",
                            "Actualizar nutricionista",
                            "Eliminar nutricionista",
                            "Salir"
                        };
                    int option2 = JOptionPane.showOptionDialog(
                            null,
                            "Elija una opción:",
                            "Nutricionistas",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options2,
                            options2[0]);
                    switch (option2) {
                        case 0:
                            registerPatientView();
                            break;
                        case 1:
                            findPatientIndexView();
                            break;
                        case 2:
                            updatePatientView();
                            break;
                        case 3:
                            deletePatientView();
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                            System.exit(0);

                    }
                    break;
                case 2:
                    String[] options3 = {
                            "Registrar plan de dieta",
                            "Consultar plan de dieta",
                            "Ajustar plan de dieta",
                        };
                    int option3 = JOptionPane.showOptionDialog(
                            null,
                            "Elija una opción:",
                            "Planes de dieta",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options3,
                            options3[0]);
                    switch (option3) {
                        case 0:
                            registerDietitianView();
                            break;
                        case 1:
                            findDietitianIndexView();
                            break;
                        case 2:
                            updatePatientView();
                            break;
                        case 3:
                            deletePatientView();
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                            System.exit(0);

                    }
                    break;
                case 3:
                    
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
            }
        }
    }

    public void registerPatientView() {
        String id = Patientview.getInput("introduce el id del paciente");
        String name = Patientview.getInput("introduce el nombre del paciente");
        String age = Patientview.getInput("introduce la edad");
        String weight = Patientview.getInput("introduce el peso");
        String height = Patientview.getInput("introduce la altura");
        String preexistingConditions = Patientview.getInput("introduce las condiciones preexistentes");
        patientManager.registerPatient(new Patient(Integer.parseInt(id), name, Integer.parseInt(age),
                Double.parseDouble(weight), Double.parseDouble(height), preexistingConditions));
        Patientview.showMessage("usuario creado exitosamente");
    }

    public void updatePatientView() {
        String id = Patientview.getInput("introduce el id del paciente");
        String name = Patientview.getInput("introduce el nombre del paciente");
        String age = Patientview.getInput("introduce la edad");
        String weight = Patientview.getInput("introduce el peso");
        String height = Patientview.getInput("introduce la altura");
        String preexistingConditions = Patientview.getInput("introduce las condiciones preexistentes");
        patientManager.updatePatient(new Patient(Integer.parseInt(id), name, Integer.parseInt(age),
                Double.parseDouble(weight), Double.parseDouble(height), preexistingConditions));
        Patientview.showMessage("usuario actualizado exitosamente");
    }

    public void findPatientIndexView() {
        String id = Patientview.getInput("introduce el id del paciente");
        patientManager.findPatientIndex(Integer.parseInt(id));
        Patientview.showMessage("usuario encontrado exitosamente");
    }

    public void deletePatientView() {
        String id = Patientview.getInput("introduce el id del paciente");
        patientManager.deletePatient(Integer.parseInt(id));
        Patientview.showMessage("usuario eliminado exitosamente");
    }
    public void registerDietitianView() {
        String id = Dietitianview.getInput("introduce el id del nutricionista");
        String name = Dietitianview.getInput("introduce el nombre del nutricionista");
        String specialty = Dietitianview.getInput("introduce la especialidad");
        String preexistingConditions = Dietitianview.getInput("introduce las condiciones preexistentes");
        dietitianManager.registerDietitian(new Dietitian(Integer.parseInt(id), name, specialty, preexistingConditions));
               
        Dietitianview.showMessage("Nutricionista creado exitosamente");
    }
    public void specialtyDietitianView() {
        String id = Dietitianview.getInput("introduce el id del nutricionista");
        String name = Dietitianview.getInput("introduce el nombre del nutricionista");
        String specialty = Dietitianview.getInput("introduce la especialidad");
        String preexistingConditions = Dietitianview.getInput("introduce las condiciones preexistentes");
        dietitianManager.updateDietitian(new Dietitian(Integer.parseInt(id), name, specialty, preexistingConditions));
        Dietitianview.showMessage("Nutricionista actualizado exitosamente");
    }
    public void findDietitianIndexView() {
        String id = Dietitianview.getInput("introduce el id del nutricionista");
        dietitianManager.findDietitianIndex(Integer.parseInt(id));
        Dietitianview.showMessage("Nutricionista encontrado exitosamente");
    }
    public void deleteDietitianView() {
        String id = Dietitianview.getInput("introduce el id del nutricionista");
        dietitianManager.deleteDietitian(Integer.parseInt(id));
        Dietitianview.showMessage("Nutricionista eliminado exitosamente");
    }
}