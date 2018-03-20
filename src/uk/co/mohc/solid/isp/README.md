# Interface Segregation Principle

**Clients should not be forced to depend on interfaces they do not use.**

It's easy to get caught in a trap of naming interfaces or abstract classes after real-world things. The problem with 
this approach is two-fold: the collection of methods defined in the interface increase as one adds more and more 
functionality of the object to the code (a violation of the Single Responsibility Principle), and implementations of the
interface start to require exceptions to the rules of the interface. 


Instead, make interfaces more abstract. It helps adhere to both the SRP (the interface is only responsible for one 
particular behavior) and this Interface Segregation Principle because specific objects only implement the functionality 
they need.

In the violation the CameraSwitches interface specifies all the different types of switches, the implementing classes dummy
out the switches that they don't require.

## Exercise
Refactor the classes in the violation folder to provide good segregation of interfaces so that each is responsible for only one
particular behavior.