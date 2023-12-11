package src.com.example.manager;
import src.com.example.model.*;
import java.lang.IllegalArgumentException;
import java.util.List;

public class DietitianManager {
    private List<Dietitian> dietitians;
    private CsvFileManager csvFileManager;
    public DietitianManager(List<Dietitian> dietitians, CsvFileManager csvFileManager) {
        this.dietitians = dietitians;
        this.csvFileManager = csvFileManager;
    }

    public void registerDietitian(Dietitian dietitian) {
        dietitians.add(dietitian);
        // Implement logic to save to CSV file...
        saveDietitiansToFile();

    }
    public void updateDietitian(Dietitian dietitian) {
        int index = dietitian.getDietitianId();
        if (index != -1) {
            dietitians.set(index, dietitian);
            // Update CSV file...
            saveDietitiansToFile();
        } else {
            throw new IllegalArgumentException("Dietitian not found with ID: " + dietitian.getDietitianId());
        }
    }

    public void deleteDietitian(int dietitianId) {
        int index = dietitianId;
        if (index != -1) {
            dietitians.remove(index);
            // Update CSV file...
            saveDietitiansToFile();
        } else {
            throw new IllegalArgumentException("Dietitian not found with ID: " + dietitianId);
        }
    }

    public  int findDietitianIndex (int dietitianId) {
        for (int i = 0; i < dietitians.size(); i++) {
            if (dietitians.get(i).getDietitianId() == dietitianId) {
                return i;
            }
        }
        return -1;
    }
    private void saveDietitiansToFile() {
        try {
            csvFileManager.saveDietitians(dietitians);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
