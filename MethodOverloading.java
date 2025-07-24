public class MethodOverloading {

    public static void main(String[] args) {

        //Simple Example of Method Overloading
        //In this example , "double add" are the two methods with same name but the parameters in them are different

        System.out.println(add(1,2,3));
    }
    static double add(double a, double b) {
        return a + b;
    }
    static double add(double a, double b,double c) {
        return a + b + c;
    }
}

