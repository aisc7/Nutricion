import java.io.Serializable;

public class Dietitian implements Serializable {
    private static final long serialVersionUID = 1L;

    private int dietitianId;
    private String name;
    private String specialty;

    public Dietitian(int dietitianId, String name, String specialty) {
        this.dietitianId = dietitianId;
        this.name = name;
        this.specialty = specialty;
    }

    // Getters and setters...

    @Override
    public String toString() {
        return "Dietitian{" +
                "dietitianId=" + dietitianId +
                ", name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
