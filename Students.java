package task;

import java.util.Scanner;

public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String specialty;
    private String course;
    private  String ID;

    public Students() {
        Scanner in = new Scanner(System.in);
        System.out.println("My name is: ");
        firstName = in.nextLine();
        System.out.println("My lastName is: ");
        lastName = in.nextLine();
        System.out.println("My age is: ");
        age = in.nextInt();
        System.out.println("My specialty is: ");
        specialty=in.nextLine();
    }
    public void setID(){
        System.out.println("Name: "+firstName+"\nlastName: "+lastName+"\nage: "+age);
        this.ID=ID;
    }

}
