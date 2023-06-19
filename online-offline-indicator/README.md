# Online-Offline indicator service

Design a system that indicates who all are online at the moment.

**micro-problem statement:** Given a user, return if he/she is online or not.

# Requiremets:
- should update status of a user **within x seconds** of user coming online
- mark user offline if not active (site not open) for **> y seconds**
- should be easily scalable for **5 million users** (design accordingly)
- **eventualy** accurate indication is expected
- keep it simple for other services to be able to interact with this service
- provide capacity planning numbers
- ensure data is **never** going into an inconsistent state for too long

# Design Document:
