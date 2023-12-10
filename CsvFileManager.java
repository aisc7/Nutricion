import java.io.*;
import java.util.List;

public class CsvFileManager {
    private static final String PATIENTS_CSV = "patients.csv";
    // ... (otras constantes para los archivos CSV)
    private static final String DIETITIANS_CSV = "dietitians.csv";
    private static final String DIET_PLANS_CSV = "diet_plans.csv";
    private static final String MEALS_CSV = "meals.csv";

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
    public void saveDietitians(List<Dietitian> dietitians){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DIETITIANS_CSV))) {
            oos.writeObject(dietitians);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     public List<Dietitian> readDietitians() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATIENTS_CSV))) {
            return (List<Dietitian>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
