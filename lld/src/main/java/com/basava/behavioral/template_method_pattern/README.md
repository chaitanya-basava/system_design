# Template Method design pattern

It is a Behavioral design pattern. This is a very frequently used pattern in the industry.

**Problem:**

When we want all classes to follow a specific set of steps to process a task.
But we would want to give each class the flexibility to choose how they implement/execute each step.

- High level steps and their ordering are defined
- Logic of each step is flexible to each class

**Solution:**

We can create an abstract class with abstract methods for all the steps and a template method (which is final).
The template method would implement the high-level order in which these methods need to be called.
All concrete classes implementing this interface would implement the step methods.
The template method can't be overwritten as it is final.

## Additional read
- https://refactoring.guru/design-patterns/template-method
