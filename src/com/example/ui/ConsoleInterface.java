      package src.com.example.ui; 
    import src.com.example.manager.DietPlanManager;
    import src.com.example.manager.DietitianManager;
    import src.com.example.manager.MealManager;
    import src.com.example.manager.PatientManager;
    import src.com.example.model.*;
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
                    "Patients",
                    "Dietitians",
                    "Diet Plans",
                    "Meals",
                    "Exit"
            };

            int option = JOptionPane.showOptionDialog(
                    null,
                    "Chosee one option:",
                    "Menu",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            switch (option) {
                case 0:
                    String[] options1 = {
                            "Register patient",
                            "Consult patient",
                            "Update patient",
                            "Delete patient",
                            "Exit"
                    };
                    int option1 = JOptionPane.showOptionDialog(
                            null,
                            "Chosee one option:",
                            "Patients",
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
                            JOptionPane.showMessageDialog(null, "Leaving the program. See you later!");
                            System.exit(0);

                    }
                    break;
                case 1:
                    String[] options2 = {
                            "Register dietitian",
                            "Consult dietitian",
                            "Update dietitian",
                            "Delete dietitian",
                            "Exit"
                        };
                    int option2 = JOptionPane.showOptionDialog(
                            null,
                            "Chosee one option:",
                            "Dietitians",
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
                            JOptionPane.showMessageDialog(null, "Leaving the program. See you later!");
                            System.exit(0);

                    }
                    break;
                case 2:
                    String[] options3 = {
                            "Register diet plan",
                            "Consult diet plan",
                            "Adjust a diet plan",
                        };
                    int option3 = JOptionPane.showOptionDialog(
                            null,
                            "Chosee one option:",
                            "Diet Plans",
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
                            JOptionPane.showMessageDialog(null, "Leaving the program. See you later!");
                            System.exit(0);

                    }
                    break;
                case 3:
                    String[] options4 = {
            "Register meal",
            "Consult meal",
            "Update meal",
            "Delete meal",
            "Exit"
    };
    int option4 = JOptionPane.showOptionDialog(
            null,
            "Chosee one option:",
            "Meals",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options4,
            options4[0]);
    switch (option4) {
        case 0:
            registerMealView();
            break;
        case 1:
            findDietitianIndexView();
            break;
        case 2:
            updatePatientView();
            break;
        case 3:
            deleteDietitianView();
            break;
        case 4:
            JOptionPane.showMessageDialog(null, "Leaving the program. See you later!");
            System.exit(0);
                         }
                break;
                  
                case 4:
                    JOptionPane.showMessageDialog(null, "Leaving the program. See you later!");
                    System.exit(0);       
                case 5:
                  break;
            }
        }
    }  
    public void registerMealView() {
        String id = Mealview.getInput("Enter meal ID");
        String name = Mealview.getInput("Enter meal name");
        String description = Mealview.getInput("Enter meal description");
        String calories = Mealview.getInput("Enter meal calories");
        String carbohydrates = Mealview.getInput("Enter meal carbohydrates");
        String proteins = Mealview.getInput("Enter meal proteins");
        String fats = Mealview.getInput("Enter meal fats");
        mealManager.registerMeal(new Meal(Integer.parseInt(id), name, description, Integer.parseInt(calories),
                Integer.parseInt(carbohydrates), Integer.parseInt(proteins), Integer.parseInt(fats)));
        Mealview.showMessage("meal registered successfully");
    }
    
    public void registerPatientView() { 
        String id = Patientview.getInput("Enter patient ID"); 
        String name = Patientview.getInput("Enter patient name");
        String age = Patientview.getInput("Enter patient age");
        String weight = Patientview.getInput("Enter patient weight");
        String height = Patientview.getInput("Enter patient height");
        String preexistingConditions = Patientview.getInput("Enter patient preexisting conditions");
        patientManager.registerPatient(new Patient(Integer.parseInt(id), name, Integer.parseInt(age),
                Double.parseDouble(weight), Double.parseDouble(height), preexistingConditions));
        Patientview.showMessage("user registered successfully");
    }
    public void updatePatientView() {
        String id = Patientview.getInput("enter paciente id");
        String name = Patientview.getInput("enter paciente name");
        String age = Patientview.getInput("enter age");
        String weight = Patientview.getInput("enter weight");
        String height = Patientview.getInput("enter height");
        String preexistingConditions = Patientview.getInput("enter preexisting conditions");
        patientManager.updatePatient(new Patient(Integer.parseInt(id), name, Integer.parseInt(age),
                Double.parseDouble(weight), Double.parseDouble(height), preexistingConditions));
        Patientview.showMessage("user updated successfully");
    }

    public void findPatientIndexView() {
        String id = Patientview.getInput("enter paciente id");
        patientManager.findPatientIndex(Integer.parseInt(id));
        Patientview.showMessage("user found successfully");
    }

    public void deletePatientView() {
        String id = Patientview.getInput("enter paciente id");
        patientManager.deletePatient(Integer.parseInt(id));
        Patientview.showMessage("user deleted successfully");
    }
    public void registerDietitianView() {
        String id = Dietitianview.getInput("enter dietitian id");
        String name = Dietitianview.getInput("enter dietitian name");
        String specialty = Dietitianview.getInput("enter specialty");

        String preexistingConditions = Dietitianview.getInput("enter preexisting conditions");
        dietitianManager.registerDietitian(new Dietitian(Integer.parseInt(id), name, specialty, preexistingConditions));
               
        Dietitianview.showMessage("Dietitian registered successfully");
    }
    public void specialtyDietitianView() {
        String id = Dietitianview.getInput("enter dietitian id");
        String name = Dietitianview.getInput("enter dietitian name");
        String specialty = Dietitianview.getInput("enter specialty");
        String preexistingConditions = Dietitianview.getInput("enter preexisting conditions");
        dietitianManager.updateDietitian(new Dietitian(Integer.parseInt(id), name, specialty, preexistingConditions));
        Dietitianview.showMessage("Dietitian updated successfully");
    }
    public void findDietitianIndexView() {
        String id = Dietitianview.getInput("enter dietitian id");
        dietitianManager.findDietitianIndex(Integer.parseInt(id));
        Dietitianview.showMessage("Dietitian found successfully");
    }
    public void deleteDietitianView() {
        String id = Dietitianview.getInput("enter dietitian id");
        dietitianManager.deleteDietitian(Integer.parseInt(id));
        Dietitianview.showMessage("Dietitian deleted successfully");
    }
}