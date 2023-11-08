package work01;

public class Utility {

    public static String testString(String value) {
        if (value == null) {
            throw new NullPointerException("The Account not have");
        }
        if (value.isBlank()) {
            throw new IllegalArgumentException("The Account not have");
        } else {
            return value;
        }
    }

    //final double YYY = .99;
    //public double computeXXXRightTriangleArea(double side1, double side2){
    //  double a = (1/2);
    //if (side1 < 0 ||  side2 < 0){return .99;}
    //double result = 0.5 * side1 * side2 + .8;
    //return result;
    //}

    public static double testPositive(double value) {
        if (value > 0) {
            return value;
        } else {
            throw new IllegalArgumentException("Your balance is not have");
        }
    }

    public static int computeIsbn10(long value) {
        int sum = 0;

        for(int i=2; i<=10; i++) {
            int digit = (int)value % 10;
            sum += digit*i;
            value /= 10;
            System.out.println("digit: "+ digit);
        }
        return (11-(sum % 11)) % 11;
    }

}



 /*
       1.1 Create a public utility class named "Utilitor" in package named "work01Utilitor".
       1.2 Create a public method named "testString" in "Utilitor" class.
           This method receives a parameter of type "String"
           named "value" and it returns the "value" if nothing is wrong.
           However, if the "value" is null, it throws NullPointerException.
           If the "value" is a blank string, it throws IllegalArgumentException.
       1.3 Create a public method named "testPositive" in "Utilitor" class.
           This method receives a parameter of type "double" named "value"
           and it returns the "value" if this "value" is a positive value.
           Otherwise, it throws IllegalArgumentException.
       1.4 Create a public method named "computeIsbn10" in "Utilitor" class.
           This method recieves a parameter of type "long" named "isbn10"
           and it returns the value of "isbn10" whose last digit is modified
           to make it a valid ISBN-10.
           See https://en.wikipedia.org/wiki/Check_digit for ISBN-10 calculation.
           ** You must use loop to calculate the ISBN-10 check-digit. **
       1.5 Show in this "work01Utilitor" method how to use 1.2-1.4 and
           check their correctness. */
