package LA3Q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoStackAndQueueYakesh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        YakeshArray array = new YakeshArray();// new YakeshArray object
        boolean loop = true;//boolean to exit loop
        myHeader(1);
        while (loop) {
            try {//try-catch as a check
                //print out options
                System.out.printf("\nMain Demo-Menu:\n" +
                        "1: Stack\n" +
                        "2: Queue\n" +
                        "3: Exit\n" +
                        "Enter your choice: ");
                int choice = scanner.nextInt();
                if (choice > 3 || choice < 1) {
                    throw new RuntimeException();
                }
                switch (choice) {//depending on choice call appropriate method
                    case 1:
                        stackDemo(array);
                        break;
                    case 2:
                        queueDemo(array);
                        break;
                    case 3:
                        loop = false;
                        myFooter(1);
                        break;
                }
                //catches for wrong input type and invalid options
            } catch (InputMismatchException e) {
                System.out.printf("Invalid Input\n");
                scanner.nextLine();
            } catch (RuntimeException e) {
                System.out.printf("Invalid Input\n");
                scanner.nextLine();
            }
        }
    }

    public static void stackDemo(YakeshArray x) {//
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;//boolean to exit loop
        System.out.printf("\n\nCurrent stack: %s", x);
        while (loop) {//print out options
            String choice = "";
            boolean check = false;
            while (check == false) {
                System.out.printf("\n\nStack Operation Menu: \n" +
                        "a: Push\n" +
                        "b: Pop\n" +
                        "c: Exit\n" +
                        "Enter your choice: ");
                choice = scanner.next();
                //check
                if (choice.equals("a") || choice.equals("b") || choice.equals("c")) {
                    check = true;

                } else {
                    System.out.printf("Invalid Input\n");
                }
            }

            switch (choice) {
                case "a"://case a get user to input information for new pair object
                    System.out.printf("Enter Year: ");
                    int y = scanner.nextInt();
                    System.out.printf("Enter Name: ");
                    String n = scanner.next();
                    Pair<Integer, String> add = new Pair(y, n);
                    x.addAtLastIndex(add);//add new pair objects to array
                    System.out.printf("The current stack: %s", x);
                    break;
                case "b":
                    if (x.getSize() > 0) {//if array has elements then remove last element
                        System.out.printf(x.removeFromLastIndex() + " was removed from the index" +
                                "\nThe current stack: %s", x);
                    } else {//if array is empty then tell user array is empty
                        System.out.printf("Nothing to remove" +
                                "\nThe current stack: %s", x);
                    }
                    break;
                case "c"://break loop if chosen
                    loop = false;
                    break;
            }
        }
    }

    public static void queueDemo(YakeshArray x) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        System.out.printf("\n\nCurrent queue: %s", x);
        while (loop) {//printing out options
            String choice = "";
            boolean check = false;
            while (check == false) {
                System.out.printf("\n\nQueue Operation Menu:\n" +
                        "a: Enqueue\n" +
                        "b: Dequeue\n" +
                        "c: Exit\n" +
                        "Enter your choice: ");
                choice = scanner.next();
                //check
                if (choice.equals("a") || choice.equals("b") || choice.equals("c")) {
                    check = true;
                } else {
                    System.out.printf("Invalid Input\n");
                }

                switch (choice) {
                    case "a"://same as above
                        System.out.printf("Enter Year: ");
                        int y = scanner.nextInt();
                        System.out.printf("Enter Name: ");
                        String n = scanner.next();
                        Pair<Integer, String> add = new Pair(y, n);
                        x.addAtLastIndex(add);
                        System.out.printf("The current queue: %s", x);
                        break;
                    case "b":
                        if (x.getSize() > 0) {//same as above but removing first index
                            System.out.printf(x.removeFromFirstIndex() + " was removed from the index" +
                                    "\nThe current queue: %s", x);
                        } else {
                            System.out.printf("Nothing to remove\n" +
                                    "The current queue: %s", x);
                        }
                        break;
                    case "c":
                        loop = false;

                }
            }
        }
    }
    public static void myHeader(int q) {//method printing out header
        System.out.printf("=========================================================== \n" +
                "Lab Exercise 3-Q%d \n" +
                "Prepared By: Yakesh Umachandran\n" +
                "Student Number: 251303571\n" +
                "Goal of this Exercise: Demonstrate Stacks and Queues using arrays\n" +
                "===========================================================\n", q);
    }
    public static void myFooter(int q) {//method printing out footer
        System.out.printf("=========================================================== \n" +
                "Completion of Lab Exercise 3-Q%d is successful!\n" +
                "Signing off - Yakesh\n" +
                "===========================================================\n", q);
    }
}