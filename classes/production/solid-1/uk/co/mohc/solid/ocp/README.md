# Open/Closed Principle

**Software entitites should be open for extension, but closed for modification**

The Strategy Pattern is a good demonstration of the open/closed principle. Notice how in the violation example, any time 
we want to add a new style of driving, we have to change the EventHandler class and the DrivingMode enum to accept a new 
type of driving. We don't want to have to modify our existing, working code to add something new. 

## Exercise

Refactor the example to allow extension of functionality for different styles of driving without modification of the 
base classes.