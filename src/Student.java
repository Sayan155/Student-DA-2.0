import java.util.Scanner;

public class Student {
    private String firstname;
    private String lastname;
    private int gradeYear;
    private String courses = "";
    private String studentID;
    private int tuition_balance=0;
    private static int costOFcourse = 600; // static is used when a value needs to remain constant for all the object of 1 single class. The values won't change for different objects of that class, like here we want the costofcourse to be static as the 600 should remain constant for each object of student class

    private static int id = 1000; // here we are declaringa id that will be same for all the objects of this class. we will use a increment function id++ in setstudetnID method as when a new student object is created, this id method of this class will be incremented by 1

//    constructor: prompt to enter students name and year

    public Student() { // not passing any parameter as we need to prompt the user to input them
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the first name of the student? ");
        this.firstname = sc.nextLine();
        System.out.println("What is the last name of the student? ");
        this.lastname = sc.nextLine();
        System.out.println("What is the class level?\n1 for Freshman\n2 for Sophomore\n3 for Junior\n4 for Senior ");
        this.gradeYear = sc.nextInt();
        setstudentID(); // when calling the function the id of this class gets incremented by 1

        System.out.println(this.firstname+" "+this.lastname+" "+this.gradeYear+" "+this.studentID);
    }


//    generate id 5 unique digit
    private void setstudentID(){
        id++; // id of this class is being incremented
        this.studentID =  gradeYear + "" + id; // we need to generate the id in a way such that the first letter represents the grade year of the student
    }
//    enroll in courses
    public void enroll(){
        do {
            System.out.println("Enter a course to enroll:");
            System.out.println("Press Q to quit.");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuition_balance += costOFcourse;
            }
            else {
                break;
            }
        }while (1!=0);
//        System.out.println("Enrolled in: "+courses);
    }

//    view balance
    public void view_balance(){
        System.out.println("Required amount to pay is $"+tuition_balance);
    }

//    pay tuition
    public void pay_tuition(){
        view_balance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the payment you want to pay: $");
        int payment = sc.nextInt();
        tuition_balance -= payment;
        System.out.println("Thank you for the payment of $"+payment);
        view_balance(); // directly views the balance after payment is done
    }

//    show status
    public String show_status(){
        System.out.println("-----------Showing Status-----------");
        return "Name: "+firstname+" "+lastname+"\n"+"Grade level: "+gradeYear+"\n"+"Courses enrolled "+courses+"\n"+"The required amount left to pay is " + tuition_balance;
    }
}
