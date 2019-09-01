package ClassObject;
public class ObjectCreation {
    public static void main(String[] ags)
    {
        // Assign Static Variables
        ObjectExamples.Employid=70999;
        // Created Object for respected class
        ObjectExamples obj = new ObjectExamples();
        // Assign values to the non-static variables
        obj.a1=200;
        obj.a2=500;
        System.out.println(ObjectExamples.Employid);
        // Changing Static variable value
        obj.Employid=71666;
        System.out.println(obj.a1);
        System.out.println(obj.Employid);
        System.out.println(obj.a2);
        obj.a3=1000;
        // Object Reference Assigned
        ObjectExamples a4 = obj;
        System.out.println(a4.a3);

    }

}
