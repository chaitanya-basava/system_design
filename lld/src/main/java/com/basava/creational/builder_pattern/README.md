# Builder design pattern

This is a creational design pattern.

**Problem:** consider a class which has lots of optional fields necessary for creating its object.
1. There will be lots of parameters for its constructor
2. We can’t just write multiple constructors that can cater to all possible field combinations.
#constructors will just explode.
3. Constructor overloading will be a pain

**Ex:** constructor (String name) and Constructor (String address) - will be regarded to have the same signature and 
hence compilation will fail.

It helps to build an object in a **step-by-step process** (step-by-step object creation).
Each of the steps will give a builder form object, 
and finally when the “build” method is called our actual obj is returned.
See StringBuilder code for a great example for builder pattern implementation.

**Implementation:**
Our class will have few constructors or a single constructor with all fields as parameters; instead, there will be
only one constructor, which takes in its Builder object. All the fields to be filled will be accessed from this Builder object.

The Builder class would also have all the fields present in the main class
(one disadvantage is this: duplicate code).
Actually, there can be a Builder interface and multiple concrete Builder
classes that implement this interface.
Each builder can maybe pre-populate certain fields based on
 what that builder is for (for filling in default values in the fields based on the object type we want to create;
see example implementation).

All fields in the Builder classes are populated using setter methods, and a build method is used to finally create
the main class using all these fields. These setter methods would return an intermediate builder object, but only when
the build method is called, we will get back the actual object.

We can further implement a Director class that can direct and implement these steps in a pre-defined manner, i.e., call these setter methods
of the builder class in a pre-defined order (can cater to use cases where one setter is dependent on another), further helping
in orchestrating the creation of the objects of the main class.

This contains three layers
- main class
- builder class
- director class (optional, needed when you want to have control on how the builder fields are populated,
instead of giving that control directly to the client)

## Additional reads:
- https://refactoring.guru/design-patterns/builder
