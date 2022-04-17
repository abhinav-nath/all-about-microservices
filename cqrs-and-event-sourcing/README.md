# CQRS and Event Sourcing

## Why do we need CQRS?

- Data is often more frequently queried than altered, or vice versa
- Segregating commands and queries enables us to optimise each for high performance
- Read and write representations of data often differ substantially
- Executing command and query operations on the same model can cause data contention
- Segregating read and write concerns enables you to manage read and write security separately

## Event Sourcing

**Event sourcing** defines an approach where all the changes that are made to an object or entity are stored
as a sequence of **immutable events** to an event store, as opposed to just saving the current state of the object or entity.

## Benefits of Event Sourcing

- The event store provides **a complete log** of every state change
- **The state** of an object/aggregate can be recreated by replaying the event store
- **Improves write performance**. All event types are simply appended to the event store.
  There are no updates or delete operations.
- In the case of failure, the event store can be used to **restore read database**

## Message Types

In CQRS and Event Sourcing, there are 3 important message types:

1. Commands
2. Events
3. Queries

### What is a Command?

A command is a combination of **expressed intent**.
In other words it describes something you want to be done.
It also contains the information required to undertake action based on that intent.
Commands are named with a verb in the **imperative mood** for example:

- Open an account command
- Deposit funds command:wq

