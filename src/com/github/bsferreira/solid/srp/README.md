# Single Responsibility Principle

**Every class should have a single responsibility. There should never be more than one reason for a class to change.**

In this violation example the Vehicle is not responsible for refuelling itself, this is the responsibility of a fuel 
pump.  Each class should have a single responsibility.  Consider a fuel pump that is designed to shutoff when the car 
has reached 90% of it's max fuel capacity, if the Vehicle class takes on the re-fuel responsibility it would be unable 
to reflect the different characteristics of each pumps.
