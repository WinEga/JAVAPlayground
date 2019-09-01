package ClassObject;
public class Person
{
    String name;
    char gender;
    Person()
    {
        System.out.println("Details of the person");
    }
    Person(String n,char g)
    {
        name = n;
        gender =g;
    }
    void display()
    {
        System.out.println("Name :"+ name);
        System.out.println("Gender :"+gender);
    }
}
