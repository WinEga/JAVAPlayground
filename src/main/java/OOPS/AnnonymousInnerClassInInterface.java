package OOPS;

interface Pi {
    void pi();
}

//class Infinite implements Pi{
//    public void pi(){
//        System.out.println("Valued of Pi = 3.14");
//    }
//}
public class AnnonymousInnerClassInInterface {

    public static void main(String[] args) {
        Pi p = new Pi() {
            public void pi() {
                System.out.println("Valued of Pi = 3.14");
            }
        };
        p.pi();
    }
}