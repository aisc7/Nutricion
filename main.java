import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class main {

    public class CsvFileManager {
    private static final String PATIENTS_CSV = "patients.csv";
    // ... (otras constantes para los archivos CSV)

    public void savePatients(List<Patient> patients) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATIENTS_CSV))) {
            oos.writeObject(patients);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Patient> readPatients() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATIENTS_CSV))) {
            return (List<Patient>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    // ... (métodos similares para dietitians, diet plans, and meals)
}
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
        int index = dietitian.getDietitianId();
        System.out.println("Dietitian ID: " + index);        
        if (index != -1) {
            dietitians.set(index, dietitian);
            // Update CSV file...
        } else {
            throw new IllegalArgumentException("Dietitian not found with ID: " + dietitian.getDietitianId());
        }
    }

    public void deleteDietitian(int dietitianId) {
        int index = Systemoutprintln(dietitianId);
        if (index != -1) {
            dietitians.remove(index);
            // Update CSV file...
        } else {
            throw new IllegalArgumentException("Dietitian not found with ID: " + dietitianId);
        }
    }

    private int Systemoutprintln(int dietitianId) {
        for (int i = 0; i < dietitians.size(); i++) {
            if (dietitians.get(i).getDietitianId() == dietitianId) {
                return i;
            }
        }
        return -1;
    }
}
public class DietPlanManager {
    private List<DietPlan> dietPlans;

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

public class MealManager {
    private List<Meal> meals;

    public MealManager(List<Meal> meals) {
        this.meals = meals;
    }

    public void createMeal(Meal meal) {
        meals.add(meal);
        // Implement logic to save to CSV file...
    }

    public void adjustMeal(Meal meal) {
        int index = findMealIndex(meal.getName());
        if (index != -1) {
            meals.set(index, meal);
            // Update CSV file...
        } else {
            throw new IllegalArgumentException("Meal not found with name: " + meal.getName());
        }
    }

    private int findMealIndex(String mealName) {
        for (int i = 0; i < meals.size(); i++) {
            if (meals.get(i).getName().equals(mealName)) {
                return i;
            }
        }
        return -1;
    }
}
public class PatientManager {
    private List<Patient> patients;
    private CsvFileManager csvFileManager;

    public PatientManager(List<Patient> patients, CsvFileManager csvFileManager) {
        this.patients = patients;
        this.csvFileManager = csvFileManager;
    }

    public void registerPatient(Patient patient) {
        patients.add(patient);
        savePatientsToFile();
    }

    public void updatePatient(Patient patient) {
        try {
            int index = findPatientIndex(patient.getPatientId());
            if (index != -1) {
                patients.set(index, patient);
                savePatientsToFile();
            } else {
                throw new IllegalArgumentException("Patient not found with ID: " + patient.getPatientId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deletePatient(int patientId) {
        try {
            int index = findPatientIndex(patientId);
            if (index != -1) {
                patients.remove(index);
                savePatientsToFile();
            } else {
                throw new IllegalArgumentException("Patient not found with ID: " + patientId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int findPatientIndex(int patientId) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getPatientId() == patientId) {
                return i;
            }
        }
        return -1;
    }

    private void savePatientsToFile() {
        try {
            csvFileManager.savePatients(patients);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


}
