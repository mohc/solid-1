# Dependency Inversion Principle
**High-level modules should not depend on low-level modules. Both should depend on abstractions.**

**Abstractions should not depend on details. Details should depend on abstractions.**

The DIP is concerned with reusability. The high-level modules or interfaces of an application should only be describing 
the "general flow" of behavior. In some cases this may be considered "business logic". Meanwhile, the low-level modules 
are written in such a way to apply their concrete details to the abstraction. (The Adapter Pattern is a good example of 
DIP.)

In the violation the Driver class creates a concrete instance of a RacingCar and cannot be re-used with a different type 
of car.  It is dependant on the implementation of the lower level RacingCar class.

## Exercise
Refactor the code so that the Driver class is not dependant on the details of the car being driven.