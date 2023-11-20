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