public class Main {
    public static void main(String[] args) {
//        PrimeChecker();
//        EvenOddChecker();
//        ReverseNumberChecker();
//        FactorialFinder();
//        LCMFinder();
//        FibonacciSequenceChecker();
        ArmstrongNumberChecker();
    }

    public static void PrimeChecker() {
        int number = 30;

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static void EvenOddChecker() {
        int number = 20;
        if (number % 2 == 0) {
            System.out.println(number + " is Even Number");
        } else {
            System.out.println(number + " is Odd Number");
        }
    }

    public static void ReverseNumberChecker() {
        int number = 23456;
        int reversenumber = 0;

        while (number != 0) {
            int remainder = number % 10 + 1;
            reversenumber = reversenumber * 10 + remainder;
            number /= 10;
        }
        System.out.println("Reverse Number" + reversenumber);
    }

    public static void FactorialFinder() {
        int i = 1;
        int fact = 1;
        int number = 5;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is " + fact);
    }

    public static void LCMFinder() {
        int num1 = 12;
        int num2 = 18;

        // Calculate and print the LCM
        int lcm = findLCM(num1, num2);
        System.out.println("Least Common Multiple of " + num1 + " and " + num2 + " is " + lcm);
    }


    public static int findLCM(int a, int b) {
        int max = (a > b) ? a : b;

        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max;
            }
            max++;
        }
    }

    public static void FibonacciSequenceChecker() {
        int n = 10;
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.println(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }

    public static void ArmstrongNumberChecker() {
        int number = 153, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

}