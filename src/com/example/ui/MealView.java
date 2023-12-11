package src.com.example.ui;
import src.com.example.manager.MealManager;
import src.com.example.model.*;
import javax.swing.*;

public class MealView {

    public MealManager mealManager;

        public MealView(MealManager MealManager) {
        JTextField mealIdField;
        JTextField patientIdField;
        JTextField nameField;
        JTextField macronutrientsField;
        JTextField caloriesField;
        JTextField timeOfDayField;
        MealManager mealManager;  

        mealIdField = new JTextField(10);
        patientIdField = new JTextField(10);
        nameField = new JTextField(10);
        macronutrientsField = new JTextField(10);
        caloriesField = new JTextField(10);
        timeOfDayField = new JTextField(10);

        
        int option = JOptionPane.showConfirmDialog(null, createPanel(), "Meal Registration", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            handleSubmission();
        }
    }

    private JTextField mealIdField;
    private JTextField patientIdField;
    private JTextField nameField;
    private JTextField macronutrientsField;
    private JTextField caloriesField;
    private JTextField timeOfDayField;

    private JPanel createPanel() {
        JPanel panel = new JPanel();

        mealIdField = new JTextField(10);
        patientIdField = new JTextField(10);
        nameField = new JTextField(10);
        macronutrientsField = new JTextField(10);
        caloriesField = new JTextField(10);
        timeOfDayField = new JTextField(10);

        panel.add(new JLabel("Meal ID:"));
        panel.add(mealIdField);
        panel.add(new JLabel("Patient ID:"));
        panel.add(patientIdField);
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Macronutrients:"));
        panel.add(macronutrientsField);
        panel.add(new JLabel("Calories:"));
        panel.add(caloriesField);
        panel.add(new JLabel("Time of Day:"));
        panel.add(timeOfDayField);

        return panel;
    }

    private void handleSubmission() {
        
        int enteredMealId = Integer.parseInt(mealIdField.getText());
        int enteredPatientId = Integer.parseInt(patientIdField.getText());
        String enteredName = nameField.getText();
        String enteredMacronutrients = macronutrientsField.getText();
        double enteredCalories = Double.parseDouble(caloriesField.getText());
        String enteredTimeOfDay = timeOfDayField.getText();

        
        Meal newMeal = new Meal(
                enteredMealId,
                enteredPatientId,
                enteredName,
                enteredMacronutrients,
                enteredCalories,
                enteredTimeOfDay
        );
         String mealId = getInput("Enter the meal id");
            String patientId = getInput("Enter the patient id");
            String name = getInput("Enter the meal name");
            String macronutrients = getInput("Enter the macronutrients");
            String calories = getInput("Enter the calories");
            String timeOfDay = getInput("Enter the time of day");
                  
            mealManager.createMeal(newMeal);
            showMessage("Meal registered successfully");
            
            mealManager.deleteMeal(enteredMealId);
            
            showMessage("Meal deleted successfully");
           
        }
    

    void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public String getInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }
}
