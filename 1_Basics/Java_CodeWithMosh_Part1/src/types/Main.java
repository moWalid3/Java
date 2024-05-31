package types;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*  data type:
        ---------
        [1] primitive                     [2] reference
        - byte                            - any Object like
        - short                           -- String
        - int                             -- Date
        - long                            -- Point
        - float
        - double                          * memory stores it a reference not a value
        - char                            * it contain a properties and method
        - boolean                             you can use it when you write a dot after
                                              instance word from this object
        * memory stores it a value
            not a reference
        * you don't see any properties
            or methods with it
     */
    //--------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        String st = "  Hello    world!!   ";

        //  target, replacement ====> parameters
        //  "!!", "**" ====> arguments
        st = st.replace("!!", "**");

        // all methods with string are a return a new string doesn't change the original string
        System.out.println(st.trim());

        // methods usefully
        st.length();
        st.indexOf(2);
        st.toUpperCase();
        st.toLowerCase();
        st.endsWith("!!");
        st.startsWith("He");
        st.trim();

        // special character to escape it usefully (", \, n, t)
        // \n \\ \t \"

    //--------------------------------------------------------------------------------------------
        System.out.println("--------------------------");
    // --------------------------------------------------------------------------------------------

        int[] arr1 = new int[3];
        int[] arr2 = {55,44,22,11};

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

    //--------

        //                     row -- colum
        int[][] numbers = new int[2][3];
        int[][] numbers2 = {{1, 2, 3}, {4, 5, 6}};

        numbers[0][0] = 1;

        // Look! use a deepToString() method to show 2 diminution arrays
        System.out.println(Arrays.deepToString(numbers2));

    //--------------------------------------------------------------------------------------------
        System.out.println("--------------------------");
    // --------------------------------------------------------------------------------------------

        // to not reassign it in another space && write it a capital latter
        final float PI = 3.14F;
        System.out.println(PI);

    //--------------------------------------------------------------------------------------------
        System.out.println("--------------------------");
    // --------------------------------------------------------------------------------------------

        int x = 1;

        x++; // increment
        x--; // decrement

        ++x; // prefix
        x++; // postfix

        x *= 2; // augmented or compound assignment operators

        System.out.println(x);

        /*
            -- order of operation:

             () the highest priority
             *, /  less than ()
             +, -  less than *, /
         */

    //--------------------------------------------------------------------------------------------
        System.out.println("--------------------------");
    // --------------------------------------------------------------------------------------------

        // implicit casting
        // byte < short < int < long < float < double
        String s = "your age is: " + 99;

        int n = 3;
        double nn = n + 4.2;
        System.out.println(nn);

        // explicit casting
        double d = 1.1;
        int a = (int) d + 2;
        System.out.println(a);

        // convert string to number
        String str = "1";
        int nu = Integer.parseInt(str) + 33;

        System.out.println(nu);

        Integer.parseInt(str);
        Short.parseShort(str);
        Float.parseFloat(str);
        Double.parseDouble(str);

    //--------------------------------------------------------------------------------------------
        System.out.println("--------------------------");
    // --------------------------------------------------------------------------------------------

        // math object useful methods
        int num;
        num = Math.round((float)2.62);
        num = (int) Math.ceil(2.2); // casting because it returns double
        num = (int) Math.floor(2.9);
        num = Math.max(3,2);
        num = Math.min(3,2);

        num = (int) (Math.random() * 100); // number between 0 and 100

        System.out.println(num);

    //--------------------------------------------------------------------------------------------
        System.out.println("--------------------------");
    // --------------------------------------------------------------------------------------------

        String res1 = NumberFormat.getPercentInstance().format(0.2);
        String res2 = NumberFormat.getCurrencyInstance().format(12345.98);

        System.out.println(res1);
        System.out.println(res2);

    //--------------------------------------------------------------------------------------------
        System.out.println("--------------------------");
    // --------------------------------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        //  String name = scanner.nextLine();
        //  System.out.println("Your name: " + name);

    //--------------------------------------------------------------------------------------------
        System.out.println("--------------------------");
    // --------------------------------------------------------------------------------------------

        myProject();

    }

    public static void myProject() {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual interest rate: ");
        float annulInterest = scanner.nextFloat();
        float monthlyInterest = annulInterest / MONTHS_IN_YEAR / PERCENT;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatting = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: $" + mortgageFormatting);
    }


}
