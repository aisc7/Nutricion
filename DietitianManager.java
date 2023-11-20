import java.lang.IllegalArgumentException;
import java.util.List;

public class DietitianManager {
    private List<Dietitian> dietitians;

    public DietitianManager(List<Dietitian> dietitians) {
        this.dietitians = dietitians;
    }

    public void registerDietitian(Dietitian dietitian) {
        dietitians.add(dietitian);
        // Implement logic to save to CSV file...
    }

    public void updateDietitian(Dietitian dietitian) {
        int index = System.out.println(dietitian.getDietitianId());
        if (index != -1) {
            dietitians.set(index, dietitian);
            // Update CSV file...
        } else {
            throw new IllegalArgumentException("Dietitian not found with ID: " + dietitian.getDietitianId());
        }
    }

    public void deleteDietitian(int dietitianId) {
        int index = System.out.println(dietitianId);
        if (index != -1) {
            dietitians.remove(index);
            // Update CSV file...
        } else {
            throw new IllegalArgumentException("Dietitian not found with ID: " + dietitianId);
        }
    }

    private int System.out.println(int dietitianId) {
        for (int i = 0; i < dietitians.size(); i++) {
            if (dietitians.get(i).getDietitianId() == dietitianId) {
                return i;
            }
        }
        return -1;
    }
}
