package src.com.example.manager;
import src.com.example.model.*;
import java.io.*;
import java.util.List;

public class CsvFileManager {
    private static final String PATIENTS_CSV = "patients.csv";
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
            @SuppressWarnings("unchecked")
            List<Patient> patients = (List<Patient>) ois.readObject();
            return patients;
                    } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    // ... (similar methods for , diet plans, and meals)
    public void saveDietitians(List<Dietitian> dietitians){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DIETITIANS_CSV))) {
            oos.writeObject(dietitians);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     public List<Dietitian> readDietitians() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATIENTS_CSV))) {
            @SuppressWarnings("unchecked")
            List<Dietitian> dietitians = (List<Dietitian>) ois.readObject();
            return dietitians;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    public void saveMeals(List<Meal> meals) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(MEALS_CSV))) {
            oos.writeObject(meals);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void saveDietPlans(List<DietPlan> dietPlans) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DIET_PLANS_CSV))) {
            oos.writeObject(dietPlans);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Meal> readMeals() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(MEALS_CSV))) {
            @SuppressWarnings("unchecked")
            List<Meal> meals = (List<Meal>) ois.readObject();
            return meals;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<DietPlan> readDietPlans() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DIET_PLANS_CSV))) {
            @SuppressWarnings("unchecked")
            List<DietPlan> dietPlans = (List<DietPlan>) ois.readObject();
            return dietPlans;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    

}
