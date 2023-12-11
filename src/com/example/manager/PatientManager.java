package src.com.example.manager;
import java.util.List;
import src.com.example.model.*;
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

    public int findPatientIndex(int patientId) {
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
