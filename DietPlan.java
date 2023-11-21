import java.io.Serializable;

public class DietPlan implements Serializable {
    private static final long serialVersionUID = 1L;

    private int planId;
    private Patient patient;
    private Dietitian dietitian;
    private int dailyCalories;
    private String macronutrientDistribution;
    private String specificRecommendations;

    public DietPlan(int planId, Patient patient, Dietitian dietitian, int dailyCalories,
                    String macronutrientDistribution, String specificRecommendations) {
        this.planId = planId;
        this.patient = patient;
        this.dietitian = dietitian;
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
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public Dietitian getDietitian() {
        return dietitian;
    }
    public void setDietitian(Dietitian dietitian) {
        this.dietitian = dietitian;
    }
    public int getDailyCalories() {
        return dailyCalories;
    }
    public void setDailyCalories(int dailyCalories) {
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
                ", patient=" + patient +
                ", dietitian=" + dietitian +
                ", dailyCalories=" + dailyCalories +
                ", macronutrientDistribution='" + macronutrientDistribution + '\'' +
                ", specificRecommendations='" + specificRecommendations + '\'' +
                '}';
    }
}
