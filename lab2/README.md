
### Course: Software Design Techniques and Mechanisms
### Author: Wu Ksenia-Qin Li / Dan Ceban

### Objectives 
* Get familiar with Creational Design Patterns
* Implement Creational Design Patterns for a specific domain 

----

## Creational Design Patterns
Briefly, Creation patterns describe the instantiation of an object or a group of related objects.

In software engineering, generators are patterns that use object creation mechanisms to create objects in a way 
appropriate to a given situation. The basic way of creating can lead to problems in the architecture or to its 
complication. Creational patterns try to solve these problems by controlling how objects are created.

Creational Design Patterns are: 
* simple factory 
* factory method 
* abstract factory 
* builder
* prototype
* singleton

### Simple factory
A simple factory just generates an instance for the client without providing any instance logic.

In object-oriented programming, a factory is an object that creates other objects. Formally, a factory is a function or
method that returns objects of different prototypes or classes from a call to some method that is considered new.

Analogy: Let's say you're building a house and you need doors. It will be a mess if every time you need a door, you 
start to arm yourself with tools and make it on a construction site. Instead, you will order the doors from the factory.

It is used when creating an object involves some kind of logic, and not just a few assignments, then it makes sense to 
delegate the task to a dedicated factory, rather than repeating the same code all over the place.

### Factory Method

It's a way of delegating the instantiation logic to child classes.

In class-based programming, a factory method is a generic design pattern that uses factory methods to solve the problem 
of creating objects without specifying specific classes for them. Objects are created by calling not a constructor, but 
a generating method defined in an interface and implemented by child classes, or implemented in a base class and 
optionally overridden by derived classes.

Analogy: One personnel officer is unable to interview all candidates for all positions. Depending on the vacancy, she 
can delegate different stages of interviews to different employees.

This pattern is useful for some general processing in a class, but the required subclasses are dynamically determined 
at runtime. That is, when the client does not know which subclass he may need.

### Abstract Factory
In short, this is a factory of factories. That is, a factory that groups individual but related/interdependent factories
without specifying specific classes for them.

The Abstract Factory pattern describes a way to encapsulate a group of individual factories, united by a theme, without 
specifying specific classes for them.

This pattern is used when you have relationships with not the simplest creation logic.


### Builder 

The template allows you to create different properties of an object, avoiding constructor pollution. This is useful when
an object can have multiple properties. Or when the creation of an object consists of a large number of stages.

The "Builder" pattern is designed to find a solution to the problem of the Telescoping constructor anti-pattern.

Analogy: Let's say you walk into a diner, order a burger of the day, and they give it to you, no questions asked . This 
is an example of a "Simple Factory". But sometimes the creation logic consists of more steps. For example, when ordering
a burger of the day, there are several options for bread, toppings, sauces, and additional ingredients. In such 
situations, the Builder template helps.

When an object can have multiple properties and when to avoid the Telescoping constructor. The key difference from the 
Simple Factory pattern is that it is used in a one-step build, while the Builder is used in a multi-step build.

### Prototype

An object is created by cloning an existing object.

The Prototype pattern is used when the types of objects being created are determined by a prototype instance cloned to 
create new objects.

That is, the template allows you to duplicate an existing object and modify the copy according to your needs. Without 
problems with creating an object from scratch and setting it up.

### Singleton

The template allows you to make sure that the object being created is the only one in its class.

The Singleton pattern allows you to limit the creation of a class to a single object. This is convenient when, in order 
to coordinate actions within the system, it is required that the object be the only one in its class.

### Implementation

The project is divided in 3 packages that implement each type of design pattern and the main file `LostHeaven`.
 - abstract_factory -> factory methods
 - builder
 - prototype 
 - sinlgeton 

As a reference for the project theme, was used the `Mafia` game.

The **Abstract Factory** implements the concept of our Lost Heaven where 2 mafia crews are involved, which have their 
Crew, Base and Don. Each class implements an interface, which are used in creating the `WhiskyFarm` - an abstract 
factory that makes a family of related objects.

The **Builder** creates the heroes of the story. It was build a static nested class `Hero` with the builder class 
created in it. The builder class has a public constructor with all the required attributes.

The **Prototype** populates the world with other numerous secondary characters. It declares the interface for cloning 
itself.

The **Singleton** allows to limit the creation of a class to a single object, thus, the city may only have an only
Detective.

## Conclusion
In this laboratory work, we studied Creational design patterns. In software engineering, creational design patterns are 
design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the 
situation, that can be seen in the Output of the program. For each pattern were created several objects which validate 
de idea and implementation.