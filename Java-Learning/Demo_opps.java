class Calculator {
    int a;

    // whatever u return u to specifiy the data type
    public int add(int num1, int num2) {
        // System.out.println("in add");
        return num1 + num2;
    }
}

public class Demo_opps {

    public static void main(String a[]) {
        int num1 = 4;
        int num2 = 6;
        Calculator calc = new Calculator(); // refrence variable
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}