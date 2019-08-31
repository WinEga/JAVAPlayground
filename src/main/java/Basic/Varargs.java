class AddMultiNumbers{

    public int add(int ...n){
        int sum=0;
        for(int k:n){
            sum = sum+k;
        }
        return sum;

    }

}

public class Varargs {

    public static void main(String[] args) {
        AddMultiNumbers obj1 = new AddMultiNumbers();
        System.out.println(obj1.add(1,3,2,5,5,9));

    }
}
