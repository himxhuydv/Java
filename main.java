// JAVA SIMPLE SYNTAX
/*public class main {
    public static void main(String[] args)   {
        System.out.println("hello");
        System.out.print("how's your day going?\n"); // using the println used for the print on another line.
        System.out.print("And anything you like to have"); // this also work same for the second line
        // use sout + tab = system.out.print
    }
} */
//Declaration
// 1. declaration
// 2. Assingme
import java.util.Scanner; // important for using of the Scanner function

public class main {
                public static void main(String[] args)

    {
        // Primitive
        //int age; // declaration
        int age = 10; // declaration and assingement
        double temp=-12.4; // double can have int and the decimal to
        char grade='a';
        boolean isStudent=true; // in this as you can see the student is true actually.And here i'm using the camelCase.
        boolean isOnline=false; /*
        System.out.println(age);
        System.out.println(temp);
        System.out.println(grade);
        System.out.println(isStudent);
        System.out.println(isOnline);// we use the this boolean inside of program more than usually in output.
        System.out.println("Today's temperature "+ temp);
        System.out.print("Your age " + age); */
        // showing the use of boolean more in program more then in output
        if(isStudent) {
            //System.out.print("in class 10");
        }
        else {
            //System.out.print("not in class 10");
        }
        // Reference Datatype
        String name = "himhuydv";
        String food = "pizza";
        String email = "himamaanshu1111@gmail.com";  /*
        System.out.println("Your name and food is " + name + "and your fav food is " + food ); //we combined the concatenate but we haven't use the spcae that's why it shwoing scrambled.
        System.out.println(age+" "+ grade + " " + "So You can have this food because your grade is good" + " " + name);
        */
        // Scanner
        // new Scanner object is created inside of the memory
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String Yourname = scanner.nextLine();// nextLine basically we are using this to read the spaces to in the words nextLine is specifically for reading the spaces to.
        System.out.println("Enter your Dad's name ");
        String Dadname = scanner.next(); // this will not count the space and will stop reading when space will appear at the first time
        System.out.println("Enter your age");
        int ageStudent=scanner.nextInt();
        System.out.println("Enter your pocket money");
        float pokectMoney=scanner.nextFloat();
        System.out.print("Are you a student of Galgotas (true/false)");
        boolean isthereStudent=scanner.nextBoolean();
        if (isthereStudent){
            System.out.println("Your dad's name is : " + Dadname);
            System.out.print("Your name is " + Yourname);
            System.out.println("your salary" + pokectMoney);
            System.out.println("your age " + ageStudent);
        }
        else {
            System.out.println("Invalid Entry ");
        }

       // System.out.println("Your dad's name is : " + Dadname);
       // System.out.print("Your name is " + Yourname);
        }

    }


