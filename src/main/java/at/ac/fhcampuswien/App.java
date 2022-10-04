package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901\n" +
                "         __\n" +
                " _(\\    |@@|\n" +
                "(__/\\__ \\--/ __\n" +
                "   \\___|----|  |   __\n" +
                "       \\ }{ /\\ )_ / _\\\n" +
                "       /\\__/\\ \\__O (__\n" +
                "      (--/\\--)    \\__/\n" +
                "      _)(  )(_\n" +
                "     `---''---`"

        );

    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char z = 'Z';
        int a = 0xface;
        int b = 012;
        long c = 80L;
        float d = 44e-1f;
        float e = 5.5f;
        double f = 8.88e1;
        double g = 99.9;

        int sum = (int) z + a + b +(int) c + (int) d + (int) e + (int) f + (int) g;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int sum = x + y;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("Before Swap:");
        System.out.print("x: ");
        System.out.print("y: ");

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("After Swap:");
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
        // input your solution here
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n2 > n1) {
            System.out.println("n1: " + "n2:" + " n2 > n1");
        }

        if (n2 == n1) {
            System.out.println("n1: " + "n2:" + " n1 == n2");
        }

        if (n1 > n2) {
            System.out.println("n1: " + "n2:" + " n1 > n2");
        }

    }

    //todo Task 7
    public void ratingSalesPerson() {
        // input your solution here
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int rev = sc.nextInt();


        if (rev < 0 || rev >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (0 <= rev && rev < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (20000 <= rev && rev < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (50000 <= rev && rev < 80000) {
            System.out.println("Good Sales Revenue");
        } else if (80000 <= rev && rev < 100000) {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int commission = scanner.nextInt();

        switch (commission) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }

        }
        // input your solution here


    //todo Task 9
    public void leapyear(){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Year: " + "Leapyear");
        }else {
            System.out.println("Year: " + "Not a Leapyear");
        }
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = 0;

if (x > 99 && x < 1000) {
    while (x != 0) {
        y = y * 10 + x % 10;
        x = x / 10;
    }
    System.out.println("Number: " + y);
}
    // input your solution here
        /** The following :      lines of code have been taken from the Internet
         * int y = 0;
         * while (x != 0) {
         * y = y * 10 + x % 10;
         * x = x / 10;
         *///www.youtube.com/watch?v=m0lMpNIG6vU&t=305s, last visit: 04.10.2022 (da fehlt ein https, jedoch spielt Intelij bei mir dann verrückt)
    }

        public static void main(String[] args){
            App exercise1 = new App();

            System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}