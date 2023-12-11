package src.com.example.ui;
import src.com.example.model.*;

import src.com.example.manager.DietPlanManager;

import src.com.example.manager.DietPlanManager;
import javax.swing.JOptionPane;

public class DietPlanView {
    
    public DietPlanManager dietPlanManager;
    public DietPlanView(DietPlanManager dietPlanManager) {
        this.dietPlanManager = dietPlanManager;
    }
    public String getDietPlanIdInput() {
        return getInput("Enter the diet plan ID");
    }

    public String getDailyCaloriesInput() {
        return getInput("Enter the daily calories");
    }

    public String getMacronutrientDistributionInput() {
        return getInput("Enter the macronutrient distribution");
    }

    public String getSpecificRecommendationsInput() {
        return getInput("Enter specific recommendations");
    }
    
    private String getInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }
}