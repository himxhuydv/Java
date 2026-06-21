# JAVA
Java is a high-level coding language which is primarily based on Object-Oriented programing.And it can run on any devices using JVM(Java Virtual Machine).it mean make it on device and run it on any devices using the JVM.    
that's why we say *"Write Once,Run Anywhere".*    
*what does it primarily based on Object-Oriented Programing mean?*    
so java uses the concept of object and class to organise and write the code.      
**How java works internally?**    
java code(.java)->javac(compiler)->bytecode(.class)->JVM->operate on OS.  
**For runing of java program you need two thing JDK+ IDE**
# JDK (Java Development Kit)
this is a development tools of development,compiling and executing of the java programs.
the compiler who convert the source-code into the java bytecode.(.class)that compiler is also a tool form the JDK.
JDK 
- Compiler
- java (command) runs the JVM to runs the bytecode and execute on the os.
  
# JVM (Java Virtual Machine)  
Java Virtual machine is a software program(program-set of instuction to perform a task.)that runs the java bytecode on the any os because the javac cannot directly works with os.
*JVM is also written by a developers*
JVM is basically specification:  
a specific document that's define how the JVM should be to make it run the java bytecode.  
So JVM Specification contains documents that have rules that need to be followed by the JVM but 
there can be different implementation JVM but they must follow the *JVM Specification rules*.      
instruction tell how  
* Read .class files  
* verify bytecode  
* Manage Memory  
* Execute bytecode instruction  
**Why we say java is computing platform?**  
Because java provide JVM,JDK,JRE and libraries required to develop and run java application on different operating system.  


#Object-Oriented Programing 
# Methods  
a block of code that perform specific an action when you call it.  

# Access Modifier  
Access Modifier controls who can access the class,method,constructor or variable. 


# JAVA SIMPLE SYNTAX**  
``` public class main{  ```  
        ```public static void main(String[] args){  ```  
        ``` System.out.print("hello) ```  
        ```System.out.println("how would i help you");```  
        ```System.out.print("i'm willing to help  you");```  
  ````     }  ````  
   ```     }```    

**public class main** : is the class we creating   
* public-mean anybody can use this.    
* class-you are telling the java is this is the class we are creating
* main-the name of the class.  
 
 **Public static void main(String[] args):**   
* public:stand for the public access modifier.  
* static: it will tell the java to run from here without creating the any instance or object.  
* void :Give nothing in the ouput,it mean when you run the code doesn't return anything in back after execution.  
* main : main is the name of the method.  
* String :basicaly the data type the we want parameter to be.  
* args : is the name of the variable.  
**String[] args**:**[]** this indicate to the array and string is the data type of the array and args is the name of the array.  
**``` System.out.println("hello") ```**
~System:This is built in class iin the java.  
~out:is predined object.    
~print:is the method that perform giving print.  

# Stack 
is an area of memory tthat get's created when we execute java program that store values of local variables and keep the track method. when main is executing it make a stack frame.that is used to store the local variables and the track of methods calls.  
The local variables here is the   
int age=10; this is the local variable it will get's store in to the memory.(it is being store in  the stack frame.)   
if the main() method is start executing if there is any other method let's say greet() inside of the main then it will pause the main method execution and then it will go to the greet and start execution of it then after completing the execution it will go back the pause main method() start finishing it.that's they say take the track of the method that are called.

# Heap
It  also a space created inside of memory when we execute a java program.


# Variables
Variable is a reusable container that contains the values.
Variables in java are two type 
* 1.Primitive datatype:built in data that store value to the memory (stack) and store that value.Always written in small letter(int,double,char,boolean).it is immutable change of copy of this variable doesn't effect the original variable. 

* 2.Reference datatype:it store the memory address into the stack where the data is actually present.changing of the copy actual change the original one to.  
let's see how  it store the address of actual data
**Memory address(stack) that points to the heap.**

# Instance variables
so the instance varibale is that variable that is declared outside of the method but inside of the class.
**One,important thing is that become the part of the object when the object is created.**
we like to talk in the aspect :
when we create the instance variable that will be defined as the object attributes:
1.a car is a class   
2.then the attributes that is declared will be instance variable.
3.And then the object will copy the class instance variable 
and make their own storage space where they will have that instance store.
*So, when the class declared the instance variable,but it doesn't create the storage.  it will create when the object is created then it will be assing the instance variable to the object and it can be changed.*

# camelCase
you write two words together then you need to write the first letter of the first words small and then the first letter capital of the second word.**This is used for the variable that datatype is primitive,that store into the memory stack.**
# PascalCase 
You have to write both words starting letter in the capital.when you combined both of them together. class object 

# Scanner
Scanner is built in class,we need to import the scanner 
```import java.util.scanner ``` by this you can use that scanner class.and then you need to create object to store the input```Scanner scanner = New Scanner(System.in);   ```,And for reading input you need to write ``` System.in``` 
  Here are the ways for reading input,
nextline(); = it will read space to so every input space will also be taken and it doesn't stop after first appearence of the space it goes on reading.
next(); = only the words untill space come it will stop reading.
nextInt(); = this only read the integer value to.
nextdouble(); = this will take the double input.
nextBoolean() = read the boolean input.
nextFloat(); = this will take the input.


**Common Issue during input buffer- nextInt(),nextDouble(),nextBoolean() and after that using the nextLine()**
buffer nextInt,nextBoolean,nextdouble ..(primitive variable) then after that using the nextLine --
        // what actually happened is when you write the nextInt or any primitive variable then after writing it when you press enter -- the Int input get store into that variable but the Enter you enter is waiting to be store
        // Enter key - that actually a \n that is waiting to be read, after the input of int then the nextLine will read the Enter will be store into the variable which having the nextLine and will display empty: (or you can say blank)


# Procedural Programming 
* we organise the programs in a sequence and execute step by step.
* Data and function are separate.(data is not safe anybody can acess the function.)
* Limited code reusability 
* **No Inheritance** is supported 
* **

# Abstraction 
Abstraction is a Object Oriented Concepts which hide unnecessary implementation details only showing the required functionality to the users.
```abstract class Animal{```
```   abstract void sound();```
```class Dog extends Animal{```
  ```void sound(){```
  ``` system.out.print("Barks");```
  ```}```
```}```
Syntax Explanation: 
* **abstract class Animal{**  
  **abtract void sound();**  
  Basically every animal make the sound "So,Every Animal must have a sound () method."
* **class Dog extends Animal{**  
      **void sound(){**
      **system.out.println("bark");**
      **}**
**}**


**User Perspective**  
User will Animal has a method 
sound(); // this mean i make animal/dog make sound.**(this is the interface or functionality is being shown.)**
**hidden Implementation-System.out.println("bark");**
