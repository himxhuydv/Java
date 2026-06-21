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
    public static void main(String[] args) { /*
        // Primitive
        //int age; // declaration
        int age = 10; // declaration and assingement
        double temp=-12.4; // double can have int and the decimal to
        char grade='a';
        boolean isStudent=true; // in this as you can see the student is true actually.And here i'm using the camelCase.
        boolean isOnline=false; /
        System.out.println(age);
        System.out.println(temp);
        System.out.println(grade);
        System.out.println(isStudent);
        System.out.println(isOnline);// we use the this boolean inside of program more than usually in output.
        System.out.println("Today's temperature "+ temp);
        System.out.print("Your age " + age);
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
        // new Scanner object is created inside of the memory and take input from the user and store into the scanner variable.
        /*Scanner scanner = new Scanner(System.in);  Scanner is a  class from the Scanner java.util package. scanner is the object (variable),New Scanner() create a scanner object in the memory.
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
        }/*

       // System.out.println("Your dad's name is : " + Dadname);
       // System.out.print("Your name is " + Yourname);
        */
     /*

        // Common issues - buffer nextInt,nextBoolean,nextdouble ..(primitive variable) then after that using the nextLine --
        // what actually happened is when you write the nextInt or any primitive variable then after writing it when you press enter -- the Int input get store into that variable but the Enter you enter is waiting to be store
        // Enter key - that actually a \n that is waiting to be read, after the input of int then the nextLine will read the Enter will be store into the variable which having the nextLine and will display empty: (or you can say blank)
/*
      */
        //
        /* System.out.print("Enter respected salary of you :");
        int salary = scanner.nextInt(); // after taking the input of int you press enter.after storing the input you have enter waiting to be input/
        // For Overcoming this problem we need this to overcome the problem.
        scanner.nextLine();
        System.out.print("your new name ");
        String Newname = scanner.nextLine(); // in this as you can see the nextLine is capturing the enter.

        System.out.print("Output"+ " "+salary +" "+ Newname);
        // always close the scanner because it also a good coding ethics
        scanner.close();
        */
        // Conditional Statement
        /*Scanner scanner = new Scanner(System.in);
        int age;
        String name;
        System.out.println("Enter your name");
        name = scanner.nextLine();
//        Group 1
        if (name.isEmpty()) {
            System.out.print("invalid ");

        } else {
            System.out.println("Enter your age");
            age = scanner.nextInt();
            if (age >= 70) {
                System.out.println("Your are Old Man");

            }
            else if (age >= 18) {
                System.out.println("You are an adult");
            {
                {



                }
                    //else{
                    //  System.out.println("you are child");
                }
                //
            }

        }
    }*/
        // Switch case
        
}}


