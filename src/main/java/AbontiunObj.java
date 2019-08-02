public class AbontiunObj {
    int num1,var1,var2;
    public static void main(String[] ags)
    {
        // Explaining AbontiunObject
        AbontiunObj a1 = new AbontiunObj();
        a1.num1 = 2000;
        a1 = new AbontiunObj();
        System.out.println(a1.num1);
        // Changing the Address of Object Reference
        AbontiunObj obj1 = new AbontiunObj();
        obj1.var1=1000;
        AbontiunObj obj2  = new AbontiunObj();
        obj2.var1 = 2000;
        obj1 = obj2;
        obj2 = obj1;
        System.out.println(obj1.var1);
        System.out.println(obj2.var1);



    }
}
