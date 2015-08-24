#Java Exceptions#

1.  An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions.
2.  After a method throws an exception, the runtime system searches the call stack for an exception handler in the reverse order in which the methods were called. 
3.  When an appropriate handler is found, the runtime system passes the exception to the handler.
4.  The exception handler chosen catches the exception. 
5.  If the runtime system exhaustively searches all the methods on the call stack without finding an appropriate exception handler, the runtime system (and, consequently, the program) terminates.
6.  **Catch or Specify Requirement** - The code that might throw certain exceptions must be enclosed by either:
    1. A try statement that catches the exception by providing a handler for the exception.
    2. A method that specifies that it can throw the exception. The method must provide a throws clause that lists the exception.
7. **The Three Kinds of Exceptions**
    1. **Checked Exception**
        1. These are exceptional conditions that a well-written **application should anticipate and recover from**.
        2. Checked exceptions are **subject** to the _Catch or Specify Requirement_. 
        3. All exceptions are checked exceptions, **except** for those **indicated by Error**, **RuntimeException**, and **their subclasses**.
        4. Example: **java.io.FileNotFoundException** is thrown when a user enters a file name that does not exist in the file system. 
    2. **Error**
        1. These are **unchecked exceptions**. 
        2. These are exceptional conditions that are **external to the application**, and that the **application usually cannot anticipate or recover from**.
        3. An application might choose to catch this exception, in order to notify the user of the problem — but it also might make sense for the program to print a stack trace and exit.
        4. Errors are **not subject** to the _Catch or Specify Requirement_. 
        5. Errors are those exceptions **indicated by Error and its subclasses**.
        6. Example: **java.io.IOError** is thrown when an application is unable to read a valid file because of a hardware or system malfunction.
    3. **Runtime exception**
        1. These are **unchecked exceptions**. 
        2. These are exceptional conditions that are **internal to the application**, and that the **application usually cannot anticipate or recover from**.
        3. The application can catch this exception, but it probably makes more sense to eliminate the bug that caused the exception to occur.
        4. Runtime exceptions are are **not subject** to the _Catch or Specify Requirement_. 
        5. Runtime exceptions are those indicated by RuntimeException and its subclasses.
        6. These usually indicate programming bugs, such as logic errors or improper use of an API. 
        7. Example: **NullPointerException** is thrown when null is passed to a constructor. **IndexOutOfBoundsException** is thrown when a program tries to access an out of bounds index in an Array.
8. Exception handlers are written using three components: **try**, **catch**, and **finally blocks**
9. The code that might thrown an exception should be enclosed within a **try** block.
10. The **catch** block is used to associate an exception handler with a try block. 
    1. One or more catch blocks are placed right after the try block.
    2. No code can be between the end of the try block and the beginning of the first catch block.
    3. The catch block contains code that is executed if and when the exception handler is invoked. The catch block has the argument of syntax **'ExceptionType name'**.
        1. The argument type, **ExceptionType**, declares the type of exception that the handler can handle and must be the name of a class that inherits from the Throwable class. 
        2. The handler can refer to the exception with **name**.
11. Exception handlers can do more than just print error messages or halt the program. They can do 
    1. Error recovery
    2. Prompt the user to make a decision
    3. Propagate the error up to a higher-level handler using chained exceptions
12. The  **finally block** always executes when the try block exits. 
    1. The finally block is **executed even if an unexpected exception occurs**. 
    2. It avoids accidental bypassing of cleanup code by a **return**, **continue**, or **break**. 
    3. It ia good practice to put cleanup code in a finally block .
13. The **finally block does not execute** when
    1. JVM exits while the try or catch code is being executed
    2. If the thread executing the try or catch code is interrupted or killed
14. The **finally block** is a **key tool** for **preventing resource leaks**. 
15. Sometimes it is better to let a method further up the call stack handle the exception. Thus the method can throw the exception from it using **throws** keyword.
16. The **throw** statement can be used to throw an exception.
17. Exception handlers can print the stack trace. 
18. A stack trace provides information on the execution history of the current thread and lists the names of the classes and methods that were called at the point when the exception occurred. 
19. A stack trace is a useful debugging tool that you'll normally take advantage of when an exception has been thrown.
20. You can create your own exception classes
21. **Advantages of Exceptions:**
    1. Helps separate error handling code from regular code.
    2. Errors can be propagated Up the Call Stack
    3. Helps in Grouping and Differentiating Error Types
22. Important Points:
    1. The try statement should contain at **least one catch block or a finally block** and **may have multiple catch blocks**.
    2. Place the more specific catch blocks before the general catch blocks. For example, place 'IOException' exception handler before the more general 'Exception' exception handler.
    3. Use the e.printStackTrace(System.out) to print the stack trace to output. 
23. In Java SE 7 and later 
    1. A **single catch block can handle more than one type of exception**. This feature can reduce code duplication and lessen the temptation to catch an overly broad exception.
    2. The **try-with-resources statement ensures that each resource is closed at the end of the statement**. Any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable, can be used as a resource.
        