
### Course: Software Design Techniques and Mechanisms
### Author: Wu Ksenia

----

### Objectives
* Get familiar with Structural Design Patterns
* Implement Structural Design Patterns for a specific domain

----

## Structural Design Patterns

Structural design patterns are concerned with how classes and objects can be composed, to form larger structures. The structural design patterns simplifies the structure by identifying the relationships. These patterns focus on, how the classes inherit from each other and how they are composed from other classes.
There are following 7 types of structural design patterns.

* `Adapter Pattern` :Adapting an interface into another according to client expectation.

* `Bridge Pattern` :Separating abstraction (interface) from implementation.

* `Composite Pattern` :Allowing clients to operate on hierarchy of objects.

* `Decorator Pattern` :Adding functionality to an object dynamically.

* `Facade Pattern` :Providing an interface to a set of interfaces.

* `Flyweight Pattern` :Reusing an object by sharing it.

* `Proxy Pattern` :Representing another object.

----

### Adapter

In software engineering, the adapter pattern is a software design pattern (also known as wrapper, an alternative naming shared with the decorator pattern) that allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code. An example is an adapter that converts the interface of a Document Object Model of an XML document into a tree structure that can be displayed.
The adapter design pattern is one of the twenty-three well-known Gang of Four design patterns that describe how to solve recurring design problems to design flexible and reusable object-oriented software, that is, objects that are easier to implement, change, test, and reuse.

The adapter design pattern solves problems like:

- How can a class be reused that does not have an interface that a client requires?
- How can classes that have incompatible interfaces work together?
- How can an alternative interface be provided for a class?

Often an (already existing) class can't be reused only because its interface doesn't conform to the interface clients require.

----

### Composite

In software engineering, the composite pattern is a partitioning design pattern. The composite pattern describes a group of objects that are treated the same way as a single instance of the same type of object. The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies. Implementing the composite pattern lets clients treat individual objects and compositions uniformly.

The Composite design pattern is one of the twenty-three well-known GoF design patterns that describe how to solve recurring design problems to design flexible and reusable object-oriented software, that is, objects that are easier to implement, change, test, and reuse.

What problems can the Composite design pattern solve?
- A part-whole hierarchy should be represented so that clients can treat part and whole objects uniformly.
- A part-whole hierarchy should be represented as tree structure.

When defining Part objects and Whole objects that act as containers for Part objects, clients must treat them separately, which complicates client code.

What solution does the Composite design pattern describe?
- Define a unified Component interface for both part (Leaf) objects and whole (Composite) objects.
- Individual Leaf objects implement the Component interface directly, and Composite objects forward requests to their child components.

This enables clients to work through the Component interface to treat Leaf and Composite objects uniformly: Leaf objects perform a request directly, and Composite objects forward the request to their child components recursively downwards the tree structure. This makes client classes easier to implement, change, test, and reuse.

----

### Proxy
In computer programming, the proxy pattern is a software design pattern. A proxy, in its most general form, is a class functioning as an interface to something else. The proxy could interface to anything: a network connection, a large object in memory, a file, or some other resource that is expensive or impossible to duplicate. In short, a proxy is a wrapper or agent object that is being called by the client to access the real serving object behind the scenes. Use of the proxy can simply be forwarding to the real object, or can provide additional logic. In the proxy, extra functionality can be provided, for example caching when operations on the real object are resource intensive, or checking preconditions before operations on the real object are invoked. For the client, usage of a proxy object is similar to using the real object, because both implement the same interface.

The Proxy design pattern is one of the twenty-three well-known GoF design patterns that describe how to solve recurring design problems to design flexible and reusable object-oriented software, that is, objects that are easier to implement, change, test, and reuse.

What problems can the Proxy design pattern solve?

- The access to an object should be controlled.
- Additional functionality should be provided when accessing an object.

When accessing sensitive objects, for example, it should be possible to check that clients have the needed access rights.

What solution does the Proxy design pattern describe? Define a separate Proxy object that:

- can be used as substitute for another object (Subject) and
- implements additional functionality to control the access to this subject.

This makes it possible to work through a Proxy object to perform additional functionality when accessing a subject. For example, to check the access rights of clients accessing a sensitive object. To act as substitute for a subject, a proxy must implement the Subject interface. Clients can't tell whether they work with a subject or its proxy.

----

### Bridge

The bridge pattern is a design pattern used in software engineering that is meant to "decouple an abstraction from its implementation so that the two can vary independently", introduced by the Gang of Four.The bridge uses encapsulation, aggregation, and can use inheritance to separate responsibilities into different classes.

When a class varies often, the features of object-oriented programming become very useful because changes to a program's code can be made easily with minimal prior knowledge about the program. The bridge pattern is useful when both the class and what it does vary often. The class itself can be thought of as the abstraction and what the class can do as the implementation. The bridge pattern can also be thought of as two layers of abstraction.

The Bridge design pattern is one of the twenty-three well-known GoF design patterns that describe how to solve recurring design problems to design flexible and reusable object-oriented software, that is, objects that are easier to implement, change, test, and reuse.

What problems can the Bridge design pattern solve?

- An abstraction and its implementation should be defined and extended independently from each other.
- A compile-time binding between an abstraction and its implementation should be avoided so that an implementation can be selected at run-time.

When using subclassing, different subclasses implement an abstract class in different ways. But an implementation is bound to the abstraction at compile-time and cannot be changed at run-time.

What solution does the Bridge design pattern describe?

- Separate an abstraction (Abstraction) from its implementation (Implementor) by putting them in separate class hierarchies.
- Implement the Abstraction in terms of (by delegating to) an Implementor object.

This enables to configure an Abstraction with an Implementor object at run-time.

----

### Decorator

In object-oriented programming, the decorator pattern is a design pattern that allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class. The decorator pattern is often useful for adhering to the Single Responsibility Principle, as it allows functionality to be divided between classes with unique areas of concern as well as to the Open-Closed Principle, by allowing the functionality of a class to be extended without being modified.Decorator use can be more efficient than subclassing, because an object's behavior can be augmented without defining an entirely new object.

The decorator design pattern is one of the twenty-three well-known design patterns; these describe how to solve recurring design problems and design flexible and reusable object-oriented software—that is, objects which are easier to implement, change, test, and reuse.

What problems can it solve?
- Responsibilities should be added to (and removed from) an object dynamically at run-time.
- A flexible alternative to subclassing for extending functionality should be provided.

When using subclassing, different subclasses extend a class in different ways. But an extension is bound to the class at compile-time and can't be changed at run-time.[citation needed]

What solution does it describe? Define Decorator objects that:

- implement the interface of the extended (decorated) object (Component) transparently by forwarding all requests to it
- perform additional functionality before/after forwarding a request.

This allows working with different Decorator objects to extend the functionality of an object dynamically at run-time.


----

### Implementation

The project is divided in packages that implement each type of design pattern and the main file `LostHeaven`, in where all the blue magic happens.
As a reference for the project theme, was used the `Mafia` game.

The **Adapter** implements the concept of game where 2 crews are in a tensioned relation, tries to steal/protect their staff from being destroyed by the concurrent crews. There we have `Transport` which is the car filled with whisky, also we have the `Interceptor` which are the cartels mercenaries with the mission to steal the container. In order to protect `Transport` there are `ArmoredCar` which are driven by the captains with the mission to kill mercenaries and deliver the items at time.

The **Composite** creates the messaging between the two crews. `Word`,`Sentence` and `Letter` define how the message looks like. `SalieriLetter` is the text that Salieri's crew gives to Morello in order to be heard and protected, but `MorelloLetter` is the text they back.

The **Proxy** define the number of persons each group have in the `People`. `Bus` is the definition of the car gangs use, `BusProxy` uses the same definitions as `Bus` but with more details about how many are into the transport.

----

## Conclusion
In this laboratory work, we studied Strucural Design Patterns. In software engineering, the adapter pattern is a software design pattern (also known as wrapper, an alternative naming shared with the decorator pattern) that allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code. An example is an adapter that converts the interface of a Document Object Model of an XML document into a tree structure that can be displayed. For each pattern were created several objects which validate the idea and implementation in order to make the understanding of the patterns, which are very important for a software engineer, from the selected theme.