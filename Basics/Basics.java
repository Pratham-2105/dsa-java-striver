//import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        // *** DATA TYPES *** //
        /*
         * byte num0 = 100; // uses 8 bits; -128 to 127;
         * System.out.println(num0);
         * 
         * short num1 = 1294; // uses 16 bits; -32,768 ro 32,757
         * System.out.println(num1);
         * 
         * int num2 = 15324;
         * System.out.println(num2); // uses 32 bits;
         * 
         * long num3 = 1243254354; // uses 64 bits;
         * System.out.println(num3);
         * 
         * double num4 = 123.321; // uses 64 bits;
         * System.out.println(num4);
         * 
         * char ch = 'a'; // individual chars;
         * System.out.println(ch);
         * 
         * boolean ft = true; // true of false;
         * System.out.println(ft);
         * 
         * // *** ARITHEMETIC OPERATORS ***
         * // +, -, %, /, *;
         * 
         * // System.out.println("Operators");
         * 
         * int n1 = 14;
         * int n2 = 12;
         * int n3 = n1 % n2;
         * System.out.println(n3); // n1 + n2 also works;
         * 
         * // *** UNARY OPERATORS ***
         * // ++, --, !
         * 
         * int n4 = 15;
         * int n5 = -n4; // adds a (-ve) sign before the number;
         * int n6 = n4++;
         * System.out.println(n5);
         * 
         * boolean fl1 = true;
         * boolean fl2 = !!!fl1;
         * System.out.println(fl2);
         * 
         * int i = 5;
         * int j = ++i; // Pre-Increment;
         * int k = i++; // Post-Increment;
         * 
         * System.out.println("num1:" + j);
         * System.out.println("num2:" + k);
         * 
         * // *** RELATIONAL OPERATORS ***
         * // <, >, <=, >=, ==, !=;
         * // Returns Ture or False;
         * 
         * int num5 = 4;
         * int num6 = 16;
         * boolean result = num5 == num6;
         * System.out.println(result);
         * 
         * // *** LOGICAL OPERATORS ***
         * // &&, ||;
         * 
         * boolean first = true;
         * boolean second = false;
         * 
         * boolean result1 = first || second;
         * boolean result2 = first && second;
         * 
         * System.out.println(result1);
         * System.out.println(result2);
         * 
         * // *** ASSIGNMENT OPERATOR ***
         * // +=, -=;
         * 
         * int resultNum = num1 + num2;
         * int num7 = 6;
         * resultNum += num7;
         * System.out.println(resultNum);
         * 
         * // *** TERNARY OPERATORS ***
         * // used on boolean values;
         * // condition ? first : second;
         * 
         * int n50 = 15;
         * int n10 = 12;
         * int n15 = n50 > n10 ? n50 : n10;
         * System.out.println(n15);
         */

        // *** STRINGS ***
        /*
         * String name = "Pratham";
         * String lastname = "Srivastava";
         * 
         * System.out.println(name + " has length " + name.length());
         * System.out.println("Third Index- " + name.charAt(3));
         * System.out.println(name.substring(4));
         * System.out.println(name.substring(3, 4));
         * System.out.println(name + " " + lastname);
         * 
         * name += " " + lastname;
         * System.out.println(name);
         * 
         * boolean result = name.equals(lastname);
         * System.out.println(result);
         */

        // *** INOUT/OUTPUT ***
        /*
         * Scanner scanner = new Scanner(System.in);
         * 
         * int numIn = scanner.nextInt();
         * System.out.println(numIn);
         * 
         * double numIn1 = scanner.nextDouble();
         * System.out.println(numIn1);
         * 
         * String name1 = scanner.nextLine(); // Use scanner.next for seperate inputs;
         * System.out.println(name1);
         * 
         * scanner.close();
         * 
         */

        // *** TYPE-CASTING ***

        /*
         * 1) Implicit -
         * 2) Explicit -
         * 
         * int x = 10;
         * double y = x; // Implicit;
         * 
         * System.out.println(y);
         * 
         * double X = 15.3;
         * int Y = (int) X; // Explicit;
         * 
         * System.out.println(Y);
         */

        // *** CONSTANTS ***
        /*
         * // Prevents mutation of a DATA TYPE;
         * final int num = 10;
         * // num += 5; // throws and error;
         * System.out.println(num);
         * 
         */
    }
}