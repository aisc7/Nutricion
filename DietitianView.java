import javax.swing.JOptionPane;

public class DietitianView {
     public void printDietitiandetails(Dietitian dietitian){
        String message ="DIETITIAN DETAILS\n\n";
        message += "ID del nutricionista : "+ dietitian.getDietitianId()+"\n";
        message += "Nombre del nutricionista : "+dietitian.getName()+"\n";
        message +="especialidad : "+dietitian.getSpecialty()+"\n";
        JOptionPane.showMessageDialog(null, message);
    }
    public String getInput(String message){
        return JOptionPane.showInputDialog(null,message);
    }
    public void showMessage(String message){
        JOptionPane.showInputDialog(null,message);
    }
    
}
