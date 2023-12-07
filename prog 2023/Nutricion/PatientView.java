import javax.swing.JOptionPane;
public class PatientView {
    public void printPatientdetails(Patient patient){
        String message ="PATIENT DETAILS\n\n";
        message += "ID de paciente : "+patient.getPatientId()+"\n";
        message += "Nombre de paciente : "+patient.getName()+"\n";
        message += "Edad : "+patient.getAge()+"\n";
        message +="Peso : "+patient.getWeight()+"\n";
        message +="Altura : "+patient.getHeight()+"\n";
        message +="Condiciones preexistentes : "+patient.getPreexistingConditions()+"\n";
        JOptionPane.showMessageDialog(null, message);
    }
    public String getInput(String message){
        return JOptionPane.showInputDialog(null,message);
    }
    public void showMessage(String message){
        JOptionPane.showInputDialog(null,message);
    }
    
}
