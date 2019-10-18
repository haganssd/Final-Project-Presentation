import java.util.Scanner;

public class UnitConversion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Ask user to select metric or standard system - I DON"T THINK THIS IS NEEDED? THOUGHTS?****

        //User enter number
        System.out.print("Enter original number to be converted: ");
        double begValue = input.nextDouble();

        //User enter unit
        System.out.print("Select original unit of measure: 1 - millimeter 2 - centimeter  3 - meter  4 - kilometer  5 - inch  6 - foot  7 - yard  8 - mile");
        int begUnit = input.nextInt();
        if (begUnit < 1 || begUnit > 8) {
            System.out.print("Invalid option");
            //how to loop back to question again?
        }

        //User enter unit to convert to
        System.out.print("Select unit of measure to convert to: 1 - millimeter 2 - centimeter  3 - meter  4 - kilometer  5 - inch  6 - foot  7 - yard  8 - mile");
        int convUnit = input.nextInt();
        if (begUnit < 1 || begUnit > 8) {
            System.out.print("Invalid option");
            //how to loop back to question again?
        }
        else {
            convert(begUnit, double endValue, convUnit, begValue);
        }


    }

    public static void convert(double begUnit, double endValue, double convUnit, double begValue){

        if (begUnit == 1 && convUnit == 1){
            System.out.print(begValue);
        }
        else if(begUnit == 1 && convUnit == 2){
            double endValue = miliToCenti(double begUnit, double convUnit);
        }
        else if (begUnit == 1 && convUnit == 3){
            double endValue = miliToMeter(double begUnit, double convUnit);
        }
        else if (begUnit == 1 && convUnit == 4){
            double endValue = miliToKilo(double begUnit, double convUnit);
        }
        else if (begUnit == 1 && convUnit == 5){
            double endValue = miliToInch(double begUnit, double convUnit);
        }
        else if (begUnit == 1 && convUnit == 6){
            double endValue = miliToFeet(double begUnit, double convUnit);
        }
        else if (begUnit == 1 && convUnit == 7){
            double endValue = miliToYard(double begUnit, double convUnit);
        }
        else if (begUnit == 1 && convUnit == 8){
            double endValue = miliToMile(double begUnit, double convUnit);
        }
        else if (begUnit == 2 && convUnit == 1){
            double endValue = centiToMilli()double begUnit, double convUnit);
        }
        else if (begUnit == 2 && convUnit == 2){
            System.out.print(begValue);
        }
        else if (begUnit == 2 && convUnit == 3){
            double endValue = centiToMeter(double begUnit, double convUnit);
        }
        else if (begUnit == 2 && convUnit == 4){
            double endValue = centiToKilo(double begUnit, double convUnit);
        }
        else if (begUnit == 2 && convUnit == 5){
            double endValue = centiToInch(double begUnit, double convUnit);
        }
        else if (begUnit == 2 && convUnit == 6){
            double endValue = centiToFeet(double begUnit, double convUnit);
        }
        else if (begUnit == 2 && convUnit == 7){
            double endValue = centiToYard(double begUnit, double convUnit);
        }
        else if (begUnit == 2 && convUnit == 8){
            double endValue = centiToMile(double begUnit, double convUnit);
        }
        else if (begUnit == 3 && convUnit == 1){
            double endValue = meterToMilli(double begUnit, double convUnit);
        }
        else if (begUnit == 3 && convUnit == 2){
            double endValue = meterToCenti(double begUnit, double convUnit);
        }
        else if (begUnit == 3 && convUnit == 3){
            System.out.print(begValue);
        }
        else if (begUnit == 3 && convUnit == 4){
            double endValue = meterToKilo(double begUnit, double convUnit);
        }
        else if (begUnit == 3 && convUnit == 5){
            double endValue = meterToInch(double begUnit, double convUnit);
        }
        else if (begUnit == 3 && convUnit == 6){
            double endValue = meterToFeet(double begUnit, double convUnit);
        }
        else if (begUnit == 3 && convUnit == 7){
            double endValue = meterToYard(double begUnit, double convUnit);
        }
        else if (begUnit == 3 && convUnit == 8){
            double endValue = meterToMile(double begUnit, double convUnit);
        }
        else if (begUnit == 4 && convUnit == 1){
            double endValue = kiloToMilli(double begUnit, double convUnit);
        }
        else if (begUnit == 4 && convUnit == 2){
            double endValue = kiloToCenti(double begUnit, double convUnit);
        }
        else if (begUnit == 4 && convUnit == 3){
            double endValue = kiloToMeter(double begUnit, double convUnit);
        }
        else if (begUnit == 4 && convUnit == 4){
            System.out.print(begValue);
        }
        else if (begUnit == 4 && convUnit == 5){
            double endValue = kiloToInches(double begUnit, double convUnit);
        }
        else if (begUnit == 4 && convUnit == 6){
            double endValue = kiloToFeet(double begUnit, double convUnit);
        }
        else if (begUnit == 4 && convUnit == 7){
            double endValue = kiloToYard(double begUnit, double convUnit);
        }
        else if (begUnit == 4 && convUnit == 8){
            double endValue = kiloToMile(double begUnit, double convUnit);
        }
        else if (begUnit == 5 && convUnit == 1){
            double endValue = inchtoMilli(double begUnit, double convUnit);
        }
        else if (begUnit == 5 && convUnit == 2){
            double endValue = inchToCenti(double begUnit, double convUnit);
        }
        else if (begUnit == 5 && convUnit == 3){
            double endValue = inchToMeter(double begUnit, double convUnit);
        }
        else if (begUnit == 5 && convUnit == 4){
            double endValue = inchToKilo(double begUnit, double convUnit);
        }
        else if (begUnit == 5 && convUnit == 5){
            System.out.print(begValue);
        }
        else if (begUnit == 5 && convUnit == 6){
            double endValue = inchToFeet(double begUnit, double convUnit);
        }
        else if (begUnit == 5 && convUnit == 7){
            double endValue = inchToYard()double begUnit, double convUnit);
        }
        else if (begUnit == 5 && convUnit == 8){
            double endValue = inchToMile(double begUnit, double convUnit);
        }
        else if (begUnit == 6 && convUnit == 1){
            double endValue = feetToMilli(double begUnit, double convUnit);
        }
        else if (begUnit == 6 && convUnit == 2){
            double endValue = feetToCenti(double begUnit, double convUnit);
        }
        else if (begUnit == 6 && convUnit == 3){
            double endValue = feetToMeter(double begUnit, double convUnit);
        }
        else if (begUnit == 6 && convUnit == 4){
            double endValue = feetToKilo(double begUnit, double convUnit);
        }
        else if (begUnit == 6 && convUnit == 5){
            double endValue = feetToInch(double begUnit, double convUnit);
        }
        else if (begUnit == 6 && convUnit == 6){
            System.out.print(begValue);
        }
        else if (begUnit == 6 && convUnit == 7){
            double endValue = feetToYard(double begUnit, double convUnit);
        }
        else if (begUnit == 6 && convUnit == 8){
            double endValue = feetToMile(double begUnit, double convUnit);
        }
        else if (begUnit == 7 && convUnit == 1){
            double endValue = yardToMilli(double begUnit, double convUnit);
        }
        else if (begUnit == 7 && convUnit == 2){
            double endValue = yardToCenti(double begUnit, double convUnit);
        }
        else if (begUnit == 7 && convUnit == 3){
            double endValue = yardToMeter(double begUnit, double convUnit);
        }
        else if (begUnit == 7 && convUnit == 4){
            double endValue = yardToKilo(double begUnit, double convUnit);
        }
        else if (begUnit == 7 && convUnit == 5){
            double endValue = yardToInch(double begUnit, double convUnit);
        }
        else if (begUnit == 7 && convUnit == 6){
            double endValue = yardToFeet(double begUnit, double convUnit);
        }
        else if (begUnit == 7 && convUnit == 7){
            System.out.print(begValue);
        }
        else if (begUnit == 7 && convUnit == 8){
            double endValue = yardToMile(double begUnit, double convUnit);
        }
        else if (begUnit == 8 && convUnit == 1){
            double endValue = mileToMilli(double begUnit, double convUnit);
        }
        else if (begUnit == 8 && convUnit == 2){
            double endValue = mileToCenti(double begUnit, double convUnit);
        }
        else if (begUnit == 8 && convUnit == 3){
            double endValue = mileToMeter(double begUnit, double convUnit);
        }
        else if (begUnit == 8 && convUnit == 4){
            double endValue = mileToKilo(double begUnit, double convUnit);
        }
        else if (begUnit == 8 && convUnit == 5){
            double endValue = mileToInch(double begUnit, double convUnit);
        }
        else if (begUnit == 8 && convUnit == 6){
            double endValue = mileToFeet(double begUnit, double convUnit);
        }
        else if (begUnit == 8 && convUnit == 7){
            double endValue = mileToYard(double begUnit, double convUnit);
        }
        else if (begUnit == 8 && convUnit == 8){
            System.out.print(begValue);
        }
        else{
            //what do we put here??
        }
    }

    public static void units(){

        //create variables for each unit of measure
        double millimeter = 0;
        double centimeter = 0;
        double meter = 0;
        double kilometer = 0;
        double inch = 0;
        double foot = 0;
        double yard = 0;
        double mile = 0;



    }

    /*********************************************************************
     METRIC SYSTEM
     **********************************************************************/

    //millimeter conversions
    public static double miliToCenti(double begValue){
        double endValue = begValue / 10;
        return endValue;
    }
    public static double miliToMeter(double begValue){
        double endValue = begValue /1000;
        return endValue;
    }
    public static double miliToKilo(double begValue){
        double endValue = begValue / 10000;
        return endValue;
    }
    public static double miliToInch(double begValue){
        double endValue = begValue / 25.4;
        return endValue;
    }
    public static double miliToFeet(double begValue){
        double endValue = begValue / 304.8;
        return endValue;
    }
    public static double miliToYard(double begValue){
        double endValue = begValue / 914.4;
        return endValue;
    }
    public static double miliToMile(double begValue){
        double endValue = begValue / 1069000000;
        return endValue;
    }

    //centimeter conversion
    public static double centiToMilli(double begValue){
        double endValue = begValue * 10;
        return endValue;
    }
    public static double centiToMeter(double begValue){
        double endValue = begValue * .10;
        return endValue;
    }
    public static double centiToKilo(double begValue){
        double endValue = begValue * .01;
        return endValue;
    }
    public static double centiToInch(double begValue){
        double endValue = begValue / 2.54;
        return endValue;
    }
    public static double centiToFeet(double begValue){
        double endValue = begValue / 30.48;
        return endValue;
    }
    public static double centiToYard(double begValue){
        double endValue = begValue / 91.44;
        return endValue;
    }
    public static double centiToMile(double begValue){
        double endValue = begValue / 160934.4;
        return endValue;
    }

    //meter conversion
    public static double meterToMilli(double begValue){
        double endValue = begValue * 1000;
        return endValue;
    }
    public static double meterToCenti(double begValue){
        double endValue = begValue * 100;
        return endValue;
    }
    public static double meterToKilo(double begValue){
        double endValue = begValue / 1000;
        return endValue;
    }
    public static double meterToInch(double begValue){
        double endValue = begValue * 39.37;
        return endValue;
    }
    public static double meterToFeet(double begValue){
        double endValue = begValue * 3.218;
        return endValue;
    }
    public static double meterToYard(double begValue){
        double endValue = begValue * 1.049;
        return endValue;
    }
    public static double meterToMile(double begValue){
        double endValue = begValue / 1609.344;
        return endValue;
    }

    //kilo conversion
    public static double kiloToMilli(double begValue){
        double endValue = begValue * 1000000;
        return endValue;
    }

    public static double kiloToCenti(double begValue){
        double endValue = begValue * 100000;
        return endValue;
    }

    public static double kiloToMeter(double begValue){
        double endValue = begValue / 1000;
        return endValue;
    }

    public static double kiloToInches(double begValue){
        double endValue = begValue * 39370.079;
        return endValue;
    }

    public static double kiloToFeet(double begValue){
        double endValue = begValue * 3280.84;
        return endValue;
    }

    public static double kiloToYard(double begValue){
        double endValue = begValue * 1093.613;
        return endValue;
    }

    public static double kiloToMile(double begValue){
        double endValue = begValue / 1.609;
        return endValue;
    }

    /******************************************************************
     IMPERIAL SYSTEM
     *******************************************************************/

    //inch conversion
    public static double inchtoMilli(double begValue){
        double endValue = begValue * 25.4;
        return endValue;
    }
    public static double inchToCenti(double begValue){
        double endValue = begValue * 2.54;
        return endValue;
    }
    public static double inchToMeter(double begValue){
        double endValue = begValue /39.37;
        return endValue;
    }
    public static double inchToKilo(double begValue){
        double endValue = begValue /39370.079;
        return endValue;
    }
    public static double inchToFeet(double begValue){
        double endValue = begValue / 12;
        return endValue;
    }
    public static double inchToYard(double begValue){
        double endValue = begValue / 36;
        return endValue;
    }
    public static double inchToMile(double begValue){
        double endValue = begValue / 13360;
        return endValue;
    }

    //feet conversion
    public static double feetToMilli(double begValue){
        double endValue = begValue * 304.8;
        return endValue;
    }
    public static double feetToCenti(double begValue){
        double endValue = begValue * 30.48;
        return endValue;
    }
    public static double feetToMeter(double begValue){
        double endValue = begValue / .3048;
        return endValue;
    }
    public static double feetToKilo(double begValue){
        double endValue = begValue / 3280.84;
        return endValue;
    }
    public static double feetToInch(double begValue){
        double endValue = begValue * 12;
        return endValue;
    }

    public static double feetToYard(double begValue){
        double endValue = begValue / 3;
        return endValue;
    }
    public static double feetToMile(double begValue){
        double endValue = begValue / 5280;
        return endValue;
    }


    //yard conversion
    public static double yardToMilli(double begValue){
        double endValue = begValue * 914.4;
        return endValue;
    }

    public static double yardToCenti(double begValue){
        double endValue = begValue * 91.44;
        return endValue;
    }

    public static double yardToMeter(double begValue){
        double endValue = begValue / 1.094;
        return endValue;
    }

    public static double yardToKilo(double begValue){
        double endValue = begValue / 1093.613;
        return endValue;
    }

    public static double yardToInch(double begValue){
        double endValue = begValue * 36;
        return endValue;
    }

    public static double yardToFeet(double begValue){
        double endValue = begValue * 3;
        return endValue;
    }

    public static double yardToMile(double begValue){
        double endValue = begValue / 1760;
        return endValue;
    }


    //mile conversion
    public static double mileToMilli(double begValue){
        double endValue = begValue * 1609000000;
        return endValue;
    }

    public static double mileToCenti(double begValue){
        double endValue = begValue * 160934.4;
        return endValue;
    }

    public static double mileToMeter(double begValue){
        double endValue = begValue * 1609.344;
        return endValue;
    }

    public static double mileToKilo(double begValue){
        double endValue = begValue * 1.60934;
        return endValue;
    }

    public static double mileToInch(double begValue){
        double endValue = begValue * 63360;
        return endValue;
    }

    public static double mileToFeet(double begValue){
        double endValue = begValue * 5280;
        return endValue;
    }

    public static double mileToYard(double begValue){
        double endValue = begValue * 1760;
        return endValue;
    }

}
