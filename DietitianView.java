import javax.swing.JOptionPane;

public class DietitianView {

        public void displayDietitianDetails(Dietitian dietitian) {
            System.out.println("Dietitian Details:");
            System.out.println("Dietitian ID: " + dietitian.getDietitianId());
            System.out.println("Name: " + dietitian.getName());
            System.out.println("Specialty: " + dietitian.getSpecialty());
        }
    
        public void displayDietPlanDetails(DietPlan dietPlan) {
            System.out.println("Diet Plan Details:");
            System.out.println("Plan ID: " + dietPlan.getPlanId());
            System.out.println("Patient ID: " + dietPlan.getPatientID().toString());
            System.out.println("Dietitian ID: " + dietPlan.getDietitianId()); 
            System.out.println("Daily Calories: " + dietPlan.getDailyCalories());
            System.out.println("Macronutrient Distribution: " + dietPlan.getMacronutrientDistribution());
        }

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
