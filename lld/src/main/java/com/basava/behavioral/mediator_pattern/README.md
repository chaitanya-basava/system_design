# Mediator design pattern

This is a Behavioral design pattern.

This pattern encourages loose coupling by keeping objects from referring to each other explicitly, and 
allows them to communicate through a mediator object.
No direct communication allowed between the objects, instead they communicate through the mediator.
Only the mediator needs to know about the objects. Objects don't need to know about each other.

![Mediator pattern](../../../../../resources/imgs/mediator_pattern_uml.png)

**Key responsibilities of the mediator:**
facilitate communication between objects by disallowing direct communication between them

**Intent of the pattern:** Disallow direct communication between objects.

## Use-cases
- Online auction system (Bidder sends bids to auctioneer)
- Air traffic control system (Planes communicate with control tower)
- Chat application (Users communicate through chat server)

## Additional read
- https://refactoring.guru/design-patterns/mediator
