package Constant;

public class Constant {


    public static void main(String arg[]) {

     //When defining a data as a "final" constant, it will not be possible to change that value

        final double inches = 2.54;
        double centimeters = 6;
        double result = centimeters / inches;

        System.out.println("In " + centimeters + " centimeters there are: " + result + " inches!");

    }
}
