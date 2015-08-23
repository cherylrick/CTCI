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
        7. Example: **NullPointerException** is thrown when null is passed to a constructor.
        
        