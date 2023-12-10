    import java.io.Serializable;
    public class Dietitian implements Serializable {
    private static final long serialVersionUID = 1L;
    private int dietitianId;
    private String name;
    private String specialty;
    private String preexistingconditions;

    public Dietitian(int dietitianId, String name, String specialty,String preexistingconditions ) {
        this.dietitianId = dietitianId;
        this.name = name;
        this.specialty = specialty;
        this.preexistingconditions = preexistingconditions;
    }

    // Getters and setters...
    public int getDietitianId() {
        return dietitianId;
    }
    public void setDietitianId(int dietitianId) {
        this.dietitianId = dietitianId;
    }
    public String getName() {
        return name;
    }
    public void setName(String dietitianName) {
        this.name = dietitianName;
    }
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String dietitianSpecialty) {
        this.specialty = dietitianSpecialty;
    }
    public String getPreexistingConditions() {
        return preexistingconditions;
    }
    public void setPreexistingConditions(String preexistingconditions) {
        this.preexistingconditions = preexistingconditions;
    }
    @Override
    public String toString() {
        return "Dietitian{" +
                "dietitianId=" + dietitianId +
                ", name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
    public String toCsvString() {
        return dietitianId + "," + name + "," + specialty + "," + preexistingconditions;
    }
   }
