import java.util.List;
public class DietPlanManager {
    private List<DietPlan> dietPlans;
    private CsvFileManager csvFileManager;
    public DietPlanManager(List<DietPlan> dietPlans) {
        this.dietPlans = dietPlans;
    }

    public void createDietPlan(DietPlan dietPlan) {
        dietPlans.add(dietPlan);
        // Implement logic to save to CSV file...
    }

    public void adjustDietPlan(DietPlan dietPlan) {
        int index = findDietPlanIndex(dietPlan.getPlanId());
        if (index != -1) {
            dietPlans.set(index, dietPlan);
            // Update CSV file...
        } else {
            throw new IllegalArgumentException("Diet plan not found with ID: " + dietPlan.getPlanId());
        }
    }

    private int findDietPlanIndex(int planId) {
        for (int i = 0; i < dietPlans.size(); i++) {
            if (dietPlans.get(i).getPlanId() == planId) {
                return i;
            }
        }
        return -1;
    }
}
