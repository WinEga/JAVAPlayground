package ClassObject;

public class Main {
    public static void main(String[] args) {
        AssociateDetails associate1 = new AssociateDetails("Egambaram","Panneerselvam","Lead",65000.45,172591,(byte)12);

        associate1.setRoll("Test Lead");
        System.out.println("Full name       : " + associate1.getFirstName()+" "+associate1.getLastName());
        System.out.println("Associate Id    : " + associate1.getAssociateId());
        System.out.println("Roll            : " + associate1.getRoll());
        System.out.println("Salary          : " + associate1.getSalary());
        System.out.println("Experience      : " + associate1.getExperienceYears());
        System.out.println("---------------------------------------------");
        AssociateDetails associate2 = new AssociateDetails("Varun","Kumar","Test Analyst",30458.99,708094,(byte)3);

        associate2.setSalary(43000);
        System.out.println("Full name       : " + associate2.getFirstName()+" "+associate1.getLastName());
        System.out.println("Associate Id    : " + associate2.getAssociateId());
        System.out.println("Roll            : " + associate2.getRoll());
        System.out.println("Salary          : " + associate2.getSalary());
        System.out.println("Experience      : " + associate2.getExperienceYears());
        System.out.println("---------------------------------------------");
    }
}
