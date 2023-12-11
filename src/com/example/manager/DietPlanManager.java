package src.com.example.manager;
import java.util.List;
import src.com.example.model.*;

public class DietPlanManager {
    private List<DietPlan> dietPlans;
    private CsvFileManager csvFileManager;

    public DietPlanManager(List<DietPlan> dietPlans) {
        this.dietPlans = dietPlans;
    }

    public void createDietPlan(DietPlan dietPlan) {
        dietPlans.add(dietPlan);
       
    }

    public void adjustDietPlan(DietPlan dietPlan) {
        int index = findDietPlanIndex(dietPlan.getPlanId());
        if (index != -1) {
            dietPlans.set(index, dietPlan);
            // Update CSV file...
            saveDietPlansToFile();
        } else {
            throw new IllegalArgumentException("Diet plan not found with ID: " + dietPlan.getPlanId());
        }
    }

    private void saveDietPlansToFile() {
        try {
            csvFileManager.saveDietPlans(dietPlans);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void registerDietPlan(DietPlan dietPlan) {
        dietPlans.add(dietPlan);
    }

    public void updateDietPlan(DietPlan dietPlan) {
        int index = findDietPlanIndex(dietPlan.getPlanId());
        if (index != -1) {
            dietPlans.set(index, dietPlan);
        }
    }

    public void deleteDietPlan(int dietPlanId) {
        int index = findDietPlanIndex(dietPlanId);
        if (index != -1) {
            dietPlans.remove(index); 
            return; } 
         }

    public int findDietPlanIndex(int dietPlanId) {
        for (int i = 0; i < dietPlans.size(); i++) {
            if (dietPlans.get(i).getPlanId() == dietPlanId) {
                return i;
            }
        }
        return -1;
    }
}
