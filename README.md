# SDE 
## Design patterns program
###### Participants: Deyan Stoimenov


### Introduction

- This README file aims to convey how participants have cooperated in creating this project, while also explaining how each design pattern has been
implemented into code.\
- Github: https://github.com/Triggero/sde-program.git

### Cooperation

- Unfortunately, since this is a re-sit assignment in another study year, I wasn't able to find another participant willing to collaborate
with me on this project. Hence, I am the sole participant.

### Creational design patterns:

1. Singleton design pattern

- This design pattern verifies that only one instance of a specific object can exist at a time. It is often used in database connections and caching.

- In this project, a Singleton design pattern is implemented in the Singleton.java class by using a static field that contains its instance,
a private constructor and a static factory method.

- When run, the SingletonTest.java class aims to test whether the design pattern is implemented correctly by trying to display more than one instance
of the class.


2. Factory design pattern

- A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class.

- In the project's implementation, we first create an Order abstract class. Then we create several classes that extend the Order abstract class. In this case, food types
  like Pizza and Burger. Then we create a GetPriceFactory that generates an object of our food type classes based on the conditions met.

- The GetBill class prompts the user for a string of their chosen food type via the console. You can type in "Pizza" or "Burger. It's case sensitive. If working correctly,
  you should get a price according to what you typed in. "5.00" for Burger and "3.00" for Pizza.


### Behavioural design patterns:

1. Observer design pattern

- Observer is a behavioral design pattern that allows some objects to notify other objects about changes in their state with minimal interdependency.
A great example for implementations based on that pattern are event listeners. They listen to events and notify when they have happened.

- In the program, two Interfaces are used. Subject, which uses several methods in order to register new observers and update them when
certain events happen. The Observer interface uses an update method to receive those updates from the Subject. Furthermore, it uses the
setSubject method to link the subject to the current registered observer.

- A class implementing the Subject interface is used to register the observers in an array list. By checking that list it can identify
whether an observer can be registered or unregistered. Furthermore, if the list is empty, a notify method doesn't update the notification
and throws a message instead, saying how there are no observers to be notified.

- In this specific scenario, we are letting a class implementing Observer to listen to a message event that is to be carried out by the class implementing the
Subject interface, that also notifies our observers.

- An ObserverTest class verifies the intended function of this design pattern by initialising and updating our observers, logging a
message in the console for each event observed by every registered observer.
