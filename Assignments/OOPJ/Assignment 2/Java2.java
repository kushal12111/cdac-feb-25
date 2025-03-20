Assignment & Arithmetic Operators

1.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}

2.
public class Main {
    public static void main(String[] args) {
        int n = 7;

        if ((n & 1) == 1) {
            System.out.println(n + " is Odd");
        } else {
            System.out.println(n + " is Even");
        }
    }
}

3.
public class Main {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}

3.
public class Main {
    public static void main(String[] args) {
        int n = 9;
        
        while (n >= 3) {
            n = n - 3;
        }

        if (n == 0) {
            System.out.println("Divisible by 3");
        } else {
            System.out.println("Not divisible by 3");
        }
    }
}

4.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a += b;
        b = a - b;
        a -= b;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}

Relational & Logical Operators

6.
public class LargestNumber {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        
        System.out.println("The largest number is " + largest);
    }
}

7.
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        scanner.close();
    }
}

8.
import java.util.Scanner;

public class AtLeastTwoTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first boolean value (true/false): ");
        boolean a = scanner.nextBoolean();
        
        System.out.print("Enter the second boolean value (true/false): ");
        boolean b = scanner.nextBoolean();
        
        System.out.print("Enter the third boolean value (true/false): ");
        boolean c = scanner.nextBoolean();
        
        boolean result = (a && b) || (a && c) || (b && c);
        
        System.out.println("At least two inputs are true: " + result);
        
        scanner.close();
    }
}

9.
import java.util.Scanner;

public class RangeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Is the number within the range 20 to 50? " + (number >= 20 && number <= 50));
        
        scanner.close();
    }
}

10.
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "Vowel" : "Consonant";
        
        System.out.println("The character '" + ch + "' is a " + result + ".");
        
        scanner.close();
    }
}

Bitwise Operators

11.
import java.util.Scanner;

public class PowerOfTwoChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        boolean isPowerOfTwo = (number > 0) && ((number & (number - 1)) == 0);
        
        System.out.println("Is the number a power of 2? " + isPowerOfTwo);
        
        scanner.close();
    }
}

12.
import java.util.Scanner;

public class MultiplyByEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int result = number << 3;
        
        System.out.println("The result of multiplying " + number + " by 8 is " + result);
        
        scanner.close();
    }
}

13.
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int mask = number >> 31;
        int absoluteValue = (number + mask) ^ mask;
        
        System.out.println("The absolute value of " + number + " is " + absoluteValue);
        
        scanner.close();
    }
}


14.
public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 29;  // Example number
        System.out.println("Number of 1s in the binary representation of " + number + " is: " + countSetBits(number));
    }
}

15.
public class SwapOddEvenBits {

    public static int swapBits(int n) {
        int evenBits = n & 0xAAAAAAAA;
        int oddBits = n & 0x55555555;
        evenBits >>= 1;
        oddBits <<= 1;
        return (evenBits | oddBits);
    }

    public static void main(String[] args) {
        int number = 23;
        System.out.println("Original number: " + number);
        System.out.println("Number after swapping odd and even bits: " + swapBits(number));
    }
}

Ternary Operator Challenges

16.
public class NumberCheck {
    public static void main(String[] args) {
        int number = -5;

        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        System.out.println("The number " + number + " is: " + result);
    }
}

17.
public class MinOfFour {
    public static void main(String[] args) {
        int a = 10, b = 15, c = 5, d = 20;
        int min = (a < b) 
                    ? ((a < c) 
                        ? ((a < d) ? a : d) 
                        : ((c < d) ? c : d)) 
                    : ((b < c) 
                        ? ((b < d) ? b : d) 
                        : ((c < d) ? c : d));
        System.out.println("The minimum value is: " + min);
    }
}

18.
public class StudentResult {
    public static void main(String[] args) {
        int percentage = 42; 
        String result = (percentage >= 40) ? "Pass" : "Fail";
        System.out.println("The student's result is: " + result);
    }
}

19.
public class AbsoluteValue {
    public static void main(String[] args) {
        int number = -7;
        int absValue = (number < 0) ? -number : number;
        System.out.println("The absolute value is: " + absValue);
    }
}

 Miscellaneous Operator Questions

21.

public class IncrementWithoutPlus {
    public static void main(String[] args) {
        int number = 5;
        int incrementedNumber = -~number;
        System.out.println("The incremented value is: " + incrementedNumber);
    }
}


22.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Error! Invalid operator.");
                return;
        }
        
        System.out.println("The result is: " + result);
    }
}




23.

public class OddOrEven {
    public static void main(String[] args) {
        int number = 7;
        String result = (number & 1) == 0 ? "Even" : "Odd";
        System.out.println("The number is: " + result);
    }
}




24.

public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if ((i & 1) == 0) {
                System.out.println(i);
            }
        }
    }
}




25.

public class ReverseInteger {
    public static void main(String[] args) {
        int number = 12345; // Example number
        int reversedNumber = 0;
        
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        
        System.out.println("The reversed number is: " + reversedNumber);
    }
}




