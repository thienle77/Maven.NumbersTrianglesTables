package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i++) {

            if (i % 2 == 0) {
                sb.append(i);
            }
        }
            return sb.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < stop; i++) {


            if (i % 2 != 0) {
                sb.append(i);
            }
        }
        return sb.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        return getExponentiation(start, stop, step, 2);

    }

    public static String getRange(int stop) {
        // 0 to stop by 1
        //Called Overloading
        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {

        // Start (0) to stop by 1
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i+= step) {
            sb.append(i);

        }
        return sb.toString();
        // return getExponentiation(start, stop, step, 2);
    }




    public static String getExponentiation(int start, int stop, int step, int exponent) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= stop; i+= step) { // "i" incremented by step
            sb.append((int)Math.pow(i, exponent)); // Have to cast to an "int" bc "Math.pow" returns a double
        }
        return sb.toString();
    }
}
