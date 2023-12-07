import java.io.*;
import java.util.List;

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
