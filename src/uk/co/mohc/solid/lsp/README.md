# Liskov Substitution Principle

**Functions that use pointers or references to base classes must be able to use objects of derived classes without 
knowing it.**

The key to understanding the Liskov Substitution Principle is thinking about _processes that use_ (sub)classes, rather 
than the (sub)classes themselves.

If you don't follow the LSP, external processes will either break, behave improperly, or need to know too much 
information.