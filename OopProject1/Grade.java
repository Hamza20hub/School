package OopProject1;

import java.util.Scanner;

public class Grade extends Information {
    public Grade() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name :");
        String name = scanner.next();
        System.out.println("Enter a Student Grade: ");
        double grade = scanner.nextDouble();


        if (grade >= 90) {
            System.out.println("Golden A+");
        } else if (grade >= 80) {
            System.out.println("Grade A");
        } else if (grade >= 70) {
            System.out.println("Grade B");
        } else if (grade >= 60) {
            System.out.println("FAILED");
        } else {
            System.out.println("FAILED");
        }

    }
}


