package src.com.example.ui;
import src.com.example.manager.PatientManager;
import src.com.example.model.Patient;
import javax.swing.JOptionPane;

public class PatientView {

    public PatientManager patientManager;
    public PatientView(PatientManager patientManager) {
        this.patientManager = patientManager;}

    public void printPatientDetails(Patient patient) {
        String message = "PATIENT DETAILS\n\n";
        message += "Patient ID: " + patient.getPatientId() + "\n";
        message += "Patient Name: " + patient.getName() + "\n";
        message += "Age: " + patient.getAge() + "\n";
        message += "Weight: " + patient.getWeight() + "\n";
        message += "Height: " + patient.getHeight() + "\n";
        message += "Preexisting Conditions: " + patient.getPreexistingConditions() + "\n";
        JOptionPane.showMessageDialog(null, message);
    }

    public String getInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public String displayMenu() {
        String message = "";
        message += "1. Register Patient\n";
        message += "2. View Patient\n";
        message += "3. Update Patient\n";
        message += "4. Delete Patient\n";
        message += "5. Exit\n";
        message += "Select an option: ";
        return JOptionPane.showInputDialog(null, message);
    }
}

