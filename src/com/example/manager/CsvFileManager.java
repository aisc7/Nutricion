    package src.com.example.manager;
    import src.com.example.model.*;
   import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvFileManager {

    private String dietitianCsvFileName;
    private String mealCsvFileName;
    private String dietPlanCsvFileName;
    private String patientCsvFileName;

    public CsvFileManager(String dietitianCsvFileName, String mealCsvFileName,
                          String dietPlanCsvFileName, String patientCsvFileName) {
        this.dietitianCsvFileName = dietitianCsvFileName;
        this.mealCsvFileName = mealCsvFileName;
        this.dietPlanCsvFileName = dietPlanCsvFileName;
        this.patientCsvFileName = patientCsvFileName;
    }

    public CsvFileManager() {
    }

    public void writeDietitians(List<Dietitian> dietitians) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(dietitianCsvFileName))) {
            for (Dietitian dietitian : dietitians) {
                writer.println(dietitian.toCsvString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Dietitian> readDietitians() {
        List<Dietitian> dietitians = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(dietitianCsvFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Dietitian dietitian = Dietitian.fromCsvString(line);
                dietitians.add(dietitian);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dietitians;
    }

    public void writeMeals(List<Meal> meals) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(mealCsvFileName))) {
            for (Meal meal : meals) {
                writer.println(meal.toCsvString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Meal> readMeals() {
        List<Meal> meals = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(mealCsvFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Meal meal = Meal.fromCsvString(line);
                meals.add(meal);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return meals;
    }

    public void writeDietPlans(List<DietPlan> dietPlans) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(dietPlanCsvFileName))) {
            for (DietPlan dietPlan : dietPlans) {
                writer.println(dietPlan.toCsvString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<DietPlan> readDietPlans() {
        List<DietPlan> dietPlans = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(dietPlanCsvFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                DietPlan dietPlan = DietPlan.fromCsvString(line);
                dietPlans.add(dietPlan);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dietPlans;
    }

    public void writePatients(List<Patient> patients) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(patientCsvFileName))) {
            for (Patient patient : patients) {
                writer.println(patient.toCsvString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Patient> readPatients() {
        List<Patient> patients = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(patientCsvFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Patient patient = Patient.fromCsvString(line);
                patients.add(patient);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return patients;
    }
}
