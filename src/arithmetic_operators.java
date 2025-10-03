public class arithmetic_operators {

    public static void main(String[] args) {

        // we are dealing with Arithmetic Operators
        int x = 13;
        int y = 2;
        int z;

        // the usual suspects: + - * /
        // z = x + y;   // addition
        // z = x - y;   // subtraction
        // z = x * y;   // multiplication
        // z = x / y;   // division (but careful: int division will cut off decimals)

        // modulo → gives you the remainder after division
        z = x % y; // 13 / 2 = 6 remainder 1 → so z = 1

        System.out.println(z);

        // augmented assignment operators
        // instead of creating another variable like z, we can update the variable itself
        // basically: "take the old value, do the math, and shove it back in"

        int a = 1;
        int b = 2;

        // boring long way:
        // a = a + b;

        // faster cool kid way:
        a += b;   // same as a = a + b

/*
a -= b;  // same as a = a - b
a *= b;  // same as a = a * b
a /= b;  // same as a = a / b
*/
        System.out.println(a); // should print 3



        // increment and decrement operators
        int c = 1;

        c++; // c = c + 1 → now c = 2
        c++; // c = 3
        c++; // c = 4

        System.out.println(c); // prints 4

        int d = 1;

        d--; // d = d - 1 → now d = 0
        d--; // d = -1
        d--; // d = -2

        System.out.println(d); // prints -2


        // Order of Operations  [P-E-M-D-A-S]
        // Parentheses → Exponents → Multiplication/Division → Addition/Subtraction
        // just like math class, except Java actually listens

        double result = 3 + 4 * (7 - 5) / 2.0;
        // step 1: (7 - 5) = 2
        // step 2: 4 * 2 = 8
        // step 3: 8 / 2.0 = 4.0  (notice .0 → double division)
        // step 4: 3 + 4.0 = 7.0

        System.out.println(result); // prints 7.0

    }
}
