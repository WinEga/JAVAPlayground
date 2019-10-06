package OOPS;

interface Mathematics {

    void Math(); // public abstract method by default
}

class Space implements Mathematics {
    public void Math() {
        System.out.println("The Space class implements 'Mathematics' Interface");
    }
}

public class InterfaceExample2 {
    public static void main(String[] args) {
        Mathematics Obj1 = new Space();
        Obj1.Math();
    }
}
