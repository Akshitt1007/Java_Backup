package h_OOPS.Abstracts_Classes;

public class main {
    public static void main(String[] args) {

        Son Akshit = new Son(20);
        Daughter Angela = new Daughter(40);

        Akshit.Introduction();
        Akshit.Carrier();
        Akshit.Choice();
        System.out.println();

        Angela.Introduction();
        Angela.Carrier();
        Angela.Choice();
        System.out.println();

        Parent mom; // This is fine — a reference variable

//      Parent mom = new Parent();
        // We cannot create objects of the Parent class because it is abstract.
        // Abstract classes are *incomplete* — they may have method declarations without bodies.
        // Java does not allow creating objects of incomplete classes.

    }
}
/*
        Abstract Classes:

        -> Sometimes you will want to create a superclass that only defines a generalized form that will be shared by all of its
           subclasses, leaving it to each subclass to fill in the details. Such a class determines the nature of the methods that
           the subclasses must implement.

        You may have methods that must be overridden by the subclass in order for the subclass to have any meaning.
        In this case, you want some way to ensure that a subclass does, indeed, override all necessary methods. Java’s solution
        to this problem is the abstract method.
        You can require that certain methods be overridden by subclasses by specifying the abstract type modifier.

                abstract type name(parameter-list);

        These methods are sometimes referred to as subclass's responsibility because they have no implementation specified in
        the superclass.
        Thus, a subclass must override them—it cannot simply use the version defined in the superclass.

        Any class that contains one or more abstract methods must also be declared abstract.
            # There can be no objects of an abstract class.
            # You cannot declare abstract constructors, or abstract static methods.
            # You can declare static methods in abstract class.

        Because there can be no objects for abstract class. If they had allowed to call abstract static methods,
        it would that mean we are calling an empty method (abstract) through classname because it is static.
        Any subclass of an abstract class must either implement all of the abstract methods in the superclass,
        or be declared abstract itself.
        Abstract classes can include as much implementation as they see fit i.e.there can be concrete methods(methods with body)
        in abstract class.

        Although abstract classes cannot be used to instantiate objects, they can be used to create object references,
        because Java’s approach to run-time polymorphism is implemented through the use of superclass references.

        A public constructor on an abstract class doesn't make any sense because you can't instantiate an abstract class directly
        (can only instantiate through a derived type that itself is not marked as abstract)
        Check: https://stackoverflow.com/questions/260666/can-an-abstract-class-have-a-constructor

 */
