# Abstract Factory pattern

It is a Creational design pattern.

**Factory pattern** is used when we want to create object, on the basis of some conditions.

Something like, if condition 1 => then create obj type 1 and so on.

Through this pattern we can avoid having to write these condition blocks at multiple places
in our code base. The factory class would act as a single source of truth for handling these conditions.

![factory_pattern.png](../../../../resources/imgs/factory_pattern.png)

**Abstract Factory pattern** is an extension over Factory pattern. It's like a factory of factories
and can be used when logical grouping of class types is possible.

![abstract_factory_pattern.png](../../../../resources/imgs/abstract_factory_pattern.png)

In code, Abstract factory pattern has been implemented.
