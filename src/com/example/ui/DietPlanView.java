package src.com.example.ui;
import javax.swing.JOptionPane;

public class DietPlanView {

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