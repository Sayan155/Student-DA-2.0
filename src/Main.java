/*Database administration for a university and need to create an application to manage student enrollments and balance

--> Ask the user how many new students will eb added to the database
--> User should be prompted to enter the name and year for each student
--> Student should have a 5 digit unique id, with first number being their grade level
--> A student can enroll in following courses:
    History 101
    Mathematics 101
    English 101
    Chemistry 101
    Computer Science 101
   --> Each course costs $600 to enroll
   --> Student should be able to view their balance and pay the tuition
   --> To see status: name of student, ID, courses enrolled and balance
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ask user how many students we have to add
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students to enroll: ");
        int num_students = sc.nextInt();
        Student [] students = new Student[num_students];

//        iterating through
        for (int n = 0; n<num_students;n++){
            students[n] = new Student(); // we are using the array here, we are using the student at the nth index
            students[n].enroll();
            students[n].pay_tuition();
            System.out.println(students[n].show_status()); // as the show status method is returning a string value we have to use the sout to print the value
        }
    }
}