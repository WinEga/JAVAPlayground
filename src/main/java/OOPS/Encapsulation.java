/*
Access variables via methods

Binding data with methods

Encapsulation in Java is a process of wrapping code and data together into a single unit,
for example, a capsule which is mixed of several medicines.

We will reduce the number of line in code by using Lombok project.

 */
package OOPS;
class Employees {
    private int empId;
    private String name;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Employees obj1 = new Employees();
        obj1.setEmpId(172591);
        obj1.setName("Ega");

        System.out.println(obj1.getName());
        System.out.println(obj1.getEmpId());

        obj1.setEmpId(172520);
        obj1.setName("Magical");

        System.out.println(obj1.getName());
        System.out.println(obj1.getEmpId());

    }
}
