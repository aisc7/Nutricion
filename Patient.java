import java.io.Serializable;
public class Patient implements Serializable {
    private static final long serialVersionUID = 1L;

    private int patientId;
    private String name;
    private int age;
    private double weight;
    private double height;
    private String preexistingConditions;

    public Patient(int patientId, String name, int age, double weight, double height, String preexistingConditions) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.preexistingConditions = preexistingConditions;
    }

    // Getters and setters...
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public String getName() {
        return name;
    }
    public void setName(String patientName) {
        this.name = patientName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int patientAge) {
        this.age = patientAge;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double patientWeight) {
        this.weight = patientWeight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double patientHeight) {
        this.height = patientHeight;
    }
    public String getPreexistingConditions() {
        return preexistingConditions;
    }
    public void setPreexistingConditions(String preexistingConditions) {
        this.preexistingConditions = preexistingConditions;
    }
    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", preexistingConditions='" + preexistingConditions + '\'' +
                '}';
    }
}