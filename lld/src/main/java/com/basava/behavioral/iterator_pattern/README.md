# Iterator design pattern

It is a Behavioral design pattern. You would have definitely used this when working with collections in Java.

**Problem:**

There are different types of collections available in Java like List, Set, Map, etc. Is there a way to generalize
the way we iterate over these collections sequentially?

**Solution:**

That's what the Iterator design pattern does. It provides a way to access the elements of an aggregate object sequentially
The client only needs to know about how it needs to use hasNext, next, iterator methods. It doesn't need to know about the
internal implementation of how the collection iterates. The internal representation of the collection needn't be known.

**How:**

It Can be achieved using the Iterator interface, any class implementing this interface needs to implement hasNext and next.
All java collections classes implement this, and the client only needs to call iterator method to get the iterator object.

See this code to know how to write the class implementing Iterator and how to use it - [GitHub](https://github.com/chaitanya-basava/CS5343-Assignments/blob/main/assignment4/SinglyLinkedList.java)

An image from the refactoring.guru website explains the pattern in a simple way.

![Iterator design pattern](https://refactoring.guru/images/patterns/diagrams/iterator/structure-2x.png)

The collection gets injected into iterator via constructor injection.

## Additional read
- https://refactoring.guru/design-patterns/iterator
