# 1 Getting Started
## Writing A Simple Java Program


You commit all work to repos on yout GitHub account. You should use the standard assignment template in the Assessment directory. You will be able to use this when you attempt the online tests (for marks).


You should include an associated README.md file which contains the output of the code when run.


This week you are going to undertake some simple development work which should allow you to become familiar with your IDE. There are many different IDEs and people can prefer different ones for different reasons. You may have used PyCharm for Python and so find IntelliJ more to your liking (both are made by JetBrains and are very similar). Your module leader prefers Eclipse, as it is more industry standard and highly configurable. The video material uses Eclipse. The choice is yours.


Start your IDE.


## Programming Projects:


**1. Create a new project called “HelloWorld” and write a simple Java program that displays the message “Hello World” to the console.**


**2. “Test”. Create a project, enter, compile and run the following application.**


```
public class Test
{
   //----------------------------------------------------
   //  Prints a statement.
   //----------------------------------------------------
   public static void main (String[] args)
   {
      System.out.println ("An Emergency Broadcast");
   }
}
```


Introduce the following errors, one at a time. Note any messages that the compiler produces. Fix the previous error each time. If no error messages are produced, be prepared to explain why.


a. Change Test to test.\
Error: Could not find or load main class Test Caused by: java.lang.NoClassDefFoundError: test (wrong name: Test) \
b. Change Emergency to emergency.\
An emergency Broadcast (No error message because the change is within the “” ) \
c. Remove the first quotation mark in the string.\
Exception in thread "main" java.lang.Error: Unresolved compilation problems: Syntax error, insert ")" to complete MethodInvocation Syntax error, insert ";" to complete BlockStatements An cannot be resolved to a variable Emergency cannot be resolved to a type Syntax error, insert ";" to complete LocalVariableDeclarationStatement String literal is not properly closed by a double-quote String literal is not properly closed by a double-quote at Test.main(Test.java:6) \
d. Change main to man.\
Error: Main method not found in class Test, please define the main method as: public static void main(String[] args) or a JavaFX application class must extend javafx.application.Application \
e. Change println to bogus.\
Exception in thread "main" java.lang.Error: Unresolved compilation problem: The method bogus(String) is undefined for the type PrintStream at Test.main(Test.java:6) \
f. Remove the semicolon at the end of the println statement.\
Exception in thread "main" java.lang.Error: Unresolved compilation problem: Syntax error, insert ";" to complete BlockStatements at Test.main(Test.java:6) \
g. Remove the last brace in the program. \
Exception in thread "main" java.lang.Error: Unresolved compilation problem: Syntax error, insert "}" to complete ClassBody at Test.main(Test.java:8)


**3. Create a second project called “PersonalDetails” and write a program that outputs some personal details to the screen, e.g. Name, Address, Age, Phone number etc.**


**4. Write and application that prints the following diamond shape. Don’t print any unneeded characters**

```
       *
      ***
     *****
    *******
     *****
      ***
       *

```


If you complete the exercises above, answer the following questions.
 
a. What is the latest version of the Java SDK that is available?\
21 Java SE 21.0.2\
b. What is the difference between Java SE and Java ME?\
Java ME provides APIs for applications targeting embedded and mobile devices. These can be mobile phones, set-top boxes, sensors, printers, etc. Java SE is the core Java programming platform. It contains all of the libraries and APIs that any Java programmer should learn\
c. Which operating system is Java available for?\
Windows, Mac OS X, Linux, and Solaris\
d. What is the most popular IDE available for Java apart from Eclipse?\
IntelliJ\
e. What is the main() function for in a Java program?/
Contains code to execute or call other methods, and can be placed in any class in a program
