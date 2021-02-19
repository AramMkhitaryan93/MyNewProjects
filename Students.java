package task;

import java.util.Scanner;

public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String specialty;
    private String course;

    public Students() {
        Scanner in = new Scanner(System.in);
        System.out.println("My name is: ");
        firstName = in.nextLine();
        System.out.println("My lastName is: ");
        lastName = in.nextLine();
    }
}
