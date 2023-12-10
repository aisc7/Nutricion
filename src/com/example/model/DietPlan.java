package src.com.example.model; 
import java.io.Serializable;

public class DietPlan implements Serializable {
    private static final long serialVersionUID = 1L;

    private int planId;
    private Double PatientID;
    private int dietitianID;
    private double dailyCalories;
    private String macronutrientDistribution;
    private String specificRecommendations;

    public DietPlan(int planId, Double PatientID, int dietitianID, double dailyCalories,
                    String macronutrientDistribution, String specificRecommendations) {
        this.planId = planId;
        this.PatientID = PatientID;
        this.dietitianID = dietitianID;
        this.dailyCalories = dailyCalories;
        this.macronutrientDistribution = macronutrientDistribution;
        this.specificRecommendations = specificRecommendations;
    }

    // Getters and setters...
    public int getPlanId() {
        return planId;
    }
    public void setPlanId(int planId) {
        this.planId = planId;
    }
    public Double getPatientID() {
        return PatientID;
    }
    public void setPatient(Double PatientID) {
        this.PatientID = PatientID;
    }
    public int getDietitian() {
        return dietitianID;
    }
    public void setDietitian(int dietitian) {
        this.dietitianID = dietitian;
    }
    public double getDailyCalories() {
        return dailyCalories;
    }
    public void setDailyCalories(double dailyCalories) {
        this.dailyCalories = dailyCalories;
    }
    public String getMacronutrientDistribution() {
        return macronutrientDistribution;
    }
    public void setMacronutrientDistribution(String macronutrientDistribution) {
        this.macronutrientDistribution = macronutrientDistribution;
    }
    @Override
    public String toString() {
        return "DietPlan{" +
                "planId=" + planId +
                ", PatientID=" + PatientID +
                ", dietitian=" + dietitianID +
                ", dailyCalories=" + dailyCalories +
                ", macronutrientDistribution='" + macronutrientDistribution + '\'' +
                ", specificRecommendations='" + specificRecommendations + '\'' +
                '}';
    }
    public int getDietitianId() {
        return dietitianID;
    }
}