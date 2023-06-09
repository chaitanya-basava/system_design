# Builder design pattern

This is a creational design pattern.

**Problem:** consider a class which has lots of optional fields necessary for creating its object.
1. There will be lots of parameters for its constructor
2. We can’t just write multiple constructors that can cater to all possible field combinations.
#constructors will just explode.
3. Constructor overloading will be a pain
    1. Ex: constructor(String name) and Constructor(String address) -
        will be regarded to have same signature and hence compilation will fail.

It helps to build an object in a step-by-step process. Each of the steps will give a builder form object
and finally when a “build” method is called our actual obj is returned.
See StringBuilder code for a very good example for builder pattern implementation.

**Implementation:**
Our class will not have many constructors or a single constructor with all fields as parameters, instead there will be
only one constructor which takes in its Builder obj. All the fields to be filled will be accessed from the Builder obj.

The Builder class would also have all the fields present in the main class
(one disadvantage is this - duplicate code). Actually  there can be a Builder interface and multiple concrete Builder 
classes that implement this interface. Each builder can maybe pre-populate certain fields based 
on what’s that builder is for.

All fields in the Builder classes are populated using setter methods and a build method is used to do finally create 
the main class using all these fields.

We can further implement a Director class that can direct and implement these steps in a pre-defined manner.
It can further help orchestrating the creation of the objs of main class.
