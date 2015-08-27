#Inheritance & Interfaces#
1. A class can extend only one parent class
2. A class can implement more than one interface


#Access Modifiers#
1.  public modifier—the field is accessible from all classes.
2.  Private modifier
    1. The field is accessible only within its own class.
    2. Getter and Setter methods can be used to access the private variables of a class.
    
#Method Overloading#
1.  The Java programming language supports overloading methods, and Java can distinguish between methods with different method signatures. 
2.  This means that methods within a class can have the same name if they have different parameter lists. 
3.  Overloaded methods are differentiated by the number and the type of the arguments passed into the method.
4.  The compiler does not consider return type when differentiating methods, so you cannot declare two methods with the same signature even if they have a different return type.
5.  Overloaded methods should be used sparingly, as they can make code much less readable.

#Constructors#
1.  You don't have to provide any constructors for your class, but you must be careful when doing this. 
2.  The compiler automatically provides a no-argument, default constructor for any class without constructors. 
3.  This default constructor will call the no-argument constructor of the superclass. 
4.  In this situation, the compiler will complain if the superclass doesn't have a no-argument constructor so you must verify that it does. 
5.  If your class has no explicit superclass, then it has an implicit superclass of Object, which does have a no-argument constructor.
6.  Note: If another class cannot call a MyClass constructor, it cannot directly create MyClass objects.

#The Garbage Collector#
1.  Some object-oriented languages require that you keep track of all the objects you create and that you explicitly destroy them when they are no longer needed. 
2.  Managing memory explicitly is tedious and error-prone. 
3.  The Java platform allows you to create as many objects as you want (limited, of course, by what your system can handle), and you don't have to worry about destroying them. 
4.  The Java runtime environment deletes objects when it determines that they are no longer being used. 
5.  This process is called garbage collection.
6.  An object is eligible for garbage collection when there are no more references to that object. 
7.  References that are held in a variable are usually dropped when the variable goes out of scope. 
8.  Or, you can explicitly drop an object reference by setting the variable to the special value null. 
9.  Remember that a program can have multiple references to the same object; all references to an object must be dropped before the object is eligible for garbage collection.

