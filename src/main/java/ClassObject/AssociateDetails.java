package ClassObject;

public class AssociateDetails {
    String firstName, lastName, roll;
    double salary;
    int associateId;
    byte experienceYears;

    public AssociateDetails(String firstName, String lastName, String roll, double salary, int associateId, byte experienceYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.roll = roll;
        this.salary = salary;
        this.associateId = associateId;
        this.experienceYears = experienceYears;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAssociateId() {
        return associateId;
    }

    public void setAssociateId(int associateId) {
        this.associateId = associateId;
    }

    public byte getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(byte experienceYears) {
        this.experienceYears = experienceYears;
    }

}
