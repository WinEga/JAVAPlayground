package OOPS;

class Tree {
    public void branch() {
        System.out.println("I am branch of Tree");
    }
}

public class AnnonymousInnerClass {

    public static void main(String[] args) {
        Tree Obj1 = new Tree() {
            public void branch() {
                System.out.println("I am the branch of BigTree(override the method in Tree class)");
            }
        };
        Obj1.branch();

    }
}
