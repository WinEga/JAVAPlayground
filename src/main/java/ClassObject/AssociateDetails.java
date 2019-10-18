package ClassObject;

public class AssociateDetails {
    String firstName, lastName, roll;
    double salary;
    int associateId;
    byte exprience_years;

    public AssociateDetails(String firstName, String lastName, String roll, double salary, int associateId, byte exprience_years) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.roll = roll;
        this.salary = salary;
        this.associateId = associateId;
        this.exprience_years = exprience_years;
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

    public byte getExprience_years() {
        return exprience_years;
    }

    public void setExprience_years(byte exprience_years) {
        this.exprience_years = exprience_years;
    }

    public void printAssociateDetails(){

        System.out.println("Full name: " + firstName + " " + lastName);
        System.out.println("Associate Id: "+associateId);
        System.out.println("Salary: " + salary);

    }
}
