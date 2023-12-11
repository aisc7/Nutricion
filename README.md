# Patient Diet Management System

Patient: The Patient class represents a patient.
Includes methods to register, update, and delete patients.

It has the following attributes:
private int patientId;
private String name;
private int age;
private doubleweight;
private double-height;
private List<String> preexistingConditions;

The Patient class constructor initializes the attributes as follows:
public Patient(int patientId, String name, int age, double weight, double height, List<String> preexistingConditions) {
this.patientId = patientId;
this.name = name;
this.age = age;
this.weight = weight;
this.height = height;
this.preexistingConditions = preexistingConditions; }

The Patient class provides the following methods:
getPatientId(): Returns the patient identifier.
setName(): Sets the name of the patient.
getName(): Returns the name of the patient.
setAge(): Sets the age of the patient.
getAge(): Returns the age of the patient.
setWeight(): Sets the patient's weight.
getWeight(): Returns the patient's weight.
setHeight(): Sets the height of the patient.
getHeight(): Returns the height of the patient.
setPreexistingConditions(): Sets the patient's preexisting medical conditions.
getPreexistingConditions(): Returns the patient's preexisting medical conditions.
Dietitian Class

Dietitian: Contains methods to register and manage nutritionists.

It has the following attributes:
private int dietitianId;
private String name;
private String specialty;

The Dietitian class constructor initializes the attributes as follows:
public Dietitian(int dietitianId, String name, String specialty) {
     this.dietitianId = dietitianId;
     this.name = name;
     this.specialty = specialty; }

The Dietitian class provides the following methods:
getDietitianId(): Returns the ID of the nutritionist.
setName(): Sets the name of the nutritionist.
getName(): Returns the name of the nutritionist.
setSpecialty(): Sets the specialty of the nutritionist.
getSpecialty(): Returns the specialty of the nutritionist.


DietPlan: Contains methods for creating and adjusting meal plans.

It has the following attributes:
private int planId;
private int patientId;
private int dietitianId;
private int dailyCalories;
private Map<String, Double> macronutrientDistribution;
private List<String> specificRecommendations;

The DietPlan class constructor initializes the attributes as follows:
public DietPlan(int planId, int patientId, int dietitianId, int dailyCalories, Map<String, Double> macronutrientDistribution, List<String> specificRecommendations) {
this.planId = planId;
this.patientId = patientId;
this.dietitianId = dietitianId;
this.dailyCalories = dailyCalories;
this.macronutrientDistribution = macronutrientDistribution;
this.specificRecommendations = specificRecommendations; }

The DietPlan class provides the following methods:
getPlanId(): Returns the diet plan identifier.
setPatientId(): Sets the patient identifier associated with the diet plan.
getPatientId(): Returns the patient identifier associated with the diet plan.
setDietitianId(): Sets the ID of the nutritionist associated with the diet plan.
getDietitianId(): Returns the identifier


Meal: Represents a meal with attributes such as name, macronutrients, calories, and timeOfDay.

It has the following attributes:
private int mealId;
private String name;
private Map<String, Double> macronutrients;
private int calories;
private String timeOfDay;

The constructor of the Meal class initializes the attributes as follows:
public Meal(int mealId, String name, Map<String, Double> macronutrients, int calories, String timeOfDay) {
this.mealId = mealId;
this.name = name;
this.macronutrients = macronutrients;
this.calories = calories;
this.timeOfDay = timeOfDay;
}

The Meal class provides the following methods:
getMealId(): Returns the identifier of the food.
setName(): Sets the name of the food.
getName(): Returns the name of the food.
setMacronutrients(): Sets the macronutrients contained in the food.
getMacronutrients(): Returns the macronutrients contained in the food.
setCalories(): Sets the calories of the food.
getCalories(): Returns the calories of the food.
setTimeOfDay(): Sets the time of day when the food should be consumed.
getTimeOfDay(): Returns the time of day when the food should be consumed.

Csv File Manager: Provides methods for reading and writing data to CSV files.

Console Interface: It is responsible for user interaction through the console. Contains methods to manage patients, nutritionists and diet plans.
Class package
