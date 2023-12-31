package GeeksForGeeks.AbstractFactoryPattern;
//
//Difference
//
//        The main difference between a “factory method” and an “abstract factory” is that
//        the factory method is a single method, and an abstract factory is an object.
//        The factory method is just a method, it can be overridden in a subclass,
//        whereas the abstract factory is an object that has multiple factory methods on it.
//        The Factory Method pattern uses inheritance and relies on a subclass to handle
//        the desired object instantiation.
//
//Advantages:
//        This pattern is particularly useful when the client doesn’t know
//        exactly what type to create.
//
//Isolation of concrete classes:
//        The Abstract Factory pattern helps you control the
//        classes of objects that an application creates. Because a factory encapsulates the
//        responsibility and the process of creating product objects, it isolates clients from
//        implementation classes. Clients manipulate instances through their abstract interfaces.
//        Product class names are isolated in the implementation of the concrete factory;
//        they do not appear in client code.
//        Exchanging Product Families easily: The class of a concrete factory appears only once
//        in an application, that is where it’s instantiated. This makes it easy to change the
//        concrete factory an application uses. It can use various product configurations simply
//        by changing the concrete factory. Because an abstract factory creates a complete family
//        of products, the whole product family changes at once.
//        Promoting consistency among products: When product objects in a family are designed to
//        work together, it’s important that an application use objects from only one family at a
//        time. AbstractFactory makes this easy to enforce.
//        Disadvantages
//
//        Difficult to support new kinds of products: Extending abstract factories to produce
//        new kinds of Products isn’t easy. That’s because the AbstractFactory interface fixes
//        the set of products that can be created. Supporting new kinds of products requires extending
//        the factory interface, which involves changing the AbstractFactory class and all of its
//        subclasses.
//        When to use
//        When the system must be independent in terms of how its objects are created, composed,
//        and represented.
//        This constraint must be enforced when a family of related objects needs to be used together.
//        When you want to provide an object library that does not show implementations
//        but only exposes interfaces.
//        When the system has to be configured with one of several families of objects.
public class AdvantagesAndDisadvantages {
}
