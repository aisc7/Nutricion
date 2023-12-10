                package src.com.example.ui; 
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
                            
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Leaving the program. See you later!");
                            System.exit(0);       
                        case 5:
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
                    findMealIndexView();
                    break;
                case 2:
                    updateMealView();
                    break;
                case 3:
                    deleteMealView();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Leaving the program. See you later!");
                    System.exit(0);
            }
            break;
                    }
                }
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
                String id = Patientview.getInput("Enter patient ID");
                String name = Patientview.getInput("Enter patient name");
                String age = Patientview.getInput("Enter patient age");
                String weight = Patientview.getInput("Enter patient weight");
                String height = Patientview.getInput("Enter patient height");
                String preexistingConditions = Patientview.getInput("Enter patient preexisting conditions");
                patientManager.updatePatient(new Patient(Integer.parseInt(id), name, Integer.parseInt(age),
                        Double.parseDouble(weight), Double.parseDouble(height), preexistingConditions));
                Patientview.showMessage("user updated successfully");
            }

            public void findPatientIndexView() {
                String id = Patientview.getInput("enter the patient id");
                patientManager.findPatientIndex(Integer.parseInt(id));
                Patientview.showMessage("user found successfully");
            }

            public void deletePatientView() {
                String id = Patientview.getInput("enter the patient id");
                patientManager.deletePatient(Integer.parseInt(id));
                Patientview.showMessage("user deleted successfully");
            }
            public void registerDietitianView() {
                String id = Dietitianview.getInput("enter the dietitian id");
                String name = Dietitianview.getInput("enter the dietitian name");
                String specialty = Dietitianview.getInput("enter the specialty");
                String preexistingConditions = Dietitianview.getInput("enter the preexisting conditions");
                dietitianManager.registerDietitian(new Dietitian(Integer.parseInt(id), name, specialty, preexistingConditions));
                    
                Dietitianview.showMessage("Dietitian registered successfully");
            }
            public void specialtyDietitianView() {
                String id = Dietitianview.getInput("enter the dietitian id");
                String name = Dietitianview.getInput("enter the dietitian name");
                String specialty = Dietitianview.getInput("introduce la especialidad");
                String preexistingConditions = Dietitianview.getInput("enter the preexisting conditions");
                dietitianManager.updateDietitian(new Dietitian(Integer.parseInt(id), name, specialty, preexistingConditions));
                Dietitianview.showMessage("Dietitian updated successfully");
            }
            public void findDietitianIndexView() {
                String id = Dietitianview.getInput("enter the dietitian id");
                dietitianManager.findDietitianIndex(Integer.parseInt(id));
                Dietitianview.showMessage("Dietitian found successfully");
            }
            public void deleteDietitianView() {
                String id = Dietitianview.getInput("Enter the dietitian id");
                dietitianManager.deleteDietitian(Integer.parseInt(id));
                Dietitianview.showMessage("Dietitian deleted successfully");
            }
            public void registerDietPlanView() {
                String PlanId = DietPlanview.getInput("Enter the diet plan ID");
                String patient = DietPlanview.getInput("Enter the patient");
                String dietitian = DietPlanview.getInput("Enter the dietitian");
                String dailyCalories = DietPlanview.getInput("Enter the daily calories");
                String macronutrientDistribution = DietPlanview.getInput("Enter the macronutrient distribution");
                String specificRecommendations = DietPlanview.getInput("Enter specific recommendations");

                dietPlanManager.registerDietPlan(new DietPlan(
                    Integer.parseInt(PlanId),
                    patient,
                    dietitian,
                    Double.parseDouble(dailyCalories),
                    macronutrientDistribution,
                    specificRecommendations
                ));

                DietPlanview.showMessage("Diet plan registered successfully");
            }
            public void updateDietPlanView() {
                String PlanId = DietPlanview.getInput("Enter the diet plan ID");
                String patient = DietPlanview.getInput("Enter the patient");
                String dietitian = DietPlanview.getInput("Enter the dietitian");
                String dailyCalories = DietPlanview.getInput("Enter the daily calories");
                String macronutrientDistribution = DietPlanview.getInput("Enter the macronutrient distribution");
                String specificRecommendations = DietPlanview.getInput("Enter specific recommendations");

                dietPlanManager.updateDietPlan(new DietPlan(
                    Integer.parseInt(PlanId),
                    patient,
                    dietitian,
                    Double.parseDouble(dailyCalories),
                    macronutrientDistribution,
                    specificRecommendations
                ));

                DietPlanview.showMessage("Diet plan updated successfully");
            }
            public void findDietPlanIndexView() {
                String PlanId = DietPlanview.getInput("Enter the diet plan ID");
                dietPlanManager.findDietPlanIndex(Integer.parseInt(PlanId));
                DietPlanview.showMessage("Diet plan found successfully");
            }
            public void deleteDietPlanView() {
                String PlanId = DietPlanview.getInput("Enter the diet plan ID");
                dietPlanManager.deleteDietPlan(Integer.parseInt(PlanId));
                DietPlanview.showMessage("Diet plan deleted successfully");
            }
            public void registerMealView() {
                String mealId = MealView.getInput("Enter the meal id");
                String patientId = Mealview.getInput("Enter the patient id");
                String name = Mealview.getInput("Enter the meal name");
                String macronutrients = Mealview.getInput("Enter the macronutrients");
                String calories = Mealview.getInput("Enter the calories");
                String timeOfDay = Mealview.getInput("Enter the time of day");
            }
                MealManager.registerMeal(new Meal(
                    Integer.parseInt(mealId),
                    Integer.parseInt(patientId),
                    name,
                    macronutrients,
                    Double.parseDouble(calories),
                    timeOfDay));

                Mealview.showMessage("Meal registered successfully");
            public void updateMealView() {
                String mealId = Mealview.getInput("Enter the ID of the meal to update");
                String name = Mealview.getInput("Enter the new meal name");
                String patientId = Mealview.getInput("Enter the new patient ID");
                String macronutrients = Mealview.getInput("Enter the new macronutrients");
                String calories = Mealview.getInput("Enter the new calories");
                String timeOfDay = Mealview.getInput("Enter the new time of day");

                mealManager.updateMeal(new Meal(
                    Integer.parseInt(mealId),
                    Integer.parseInt(patientId),
                    name,
                    macronutrients,
                    Double.parseDouble(calories),
                    timeOfDay));

                Mealview.showMessage("Meal updated successfully");
            }
            public void findMealIndexView() {
                String mealId = Mealview.getInput("Enter the ID of the meal to find");
                mealManager.findMealIndex(Integer.parseInt(mealId));
                Mealview.showMessage("Meal found successfully");
            }
            public void deleteMealView() {
                String mealId = Mealview.getInput("Enter the ID of the meal to delete");
                mealManager.deleteMeal(Integer.parseInt(mealId));
                Mealview.showMessage("Meal deleted successfully");
            }
        }
            