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
    public String displayMenu(){
        String message="";
        message +="1. Registrar paciente\n";
        message +="2. Consultar paciente\n";
        message +="3. actualizar paciente\n";
        message +="4. Eliminar paciente\n";
        message +="5. Salir\n";
        message +="Selecciona una opcion: ";
        return JOptionPane.showInputDialog(null,message);
    }
    
}
