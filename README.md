# Java Design Patterns

Small Java projects for learning design patterns step by step.

## Project Structure

```text
design-patterns/
  creational-patterns/
  structural-patterns/
  behavioral-patterns/
  saga-patterns/
```

Each module contains small, focused examples. Every pattern should have:

- a tiny problem scenario
- a plain Java implementation
- a demo class with a `main` method
- optional unit tests
- short notes about interview usage

## Roadmap

| Category | Pattern | Mini Project |
| --- | --- | --- |
| Creational | Singleton | Application configuration |
| Creational | Factory Method | Notification creator |
| Creational | Abstract Factory | UI component family |
| Creational | Builder | Order or request builder |
| Creational | Prototype | Cloneable game character |
| Structural | Adapter | Payment provider adapter |
| Structural | Decorator | Coffee add-ons |
| Structural | Facade | Order checkout facade |
| Structural | Proxy | Image loading proxy |
| Structural | Composite | File system tree |
| Behavioral | Strategy | Shipping cost calculator |
| Behavioral | Observer | News publisher |
| Behavioral | Command | Text editor actions |
| Behavioral | State | Order status workflow |
| Behavioral | Template Method | Data exporter |

## Run

Build all modules:

```bash
./mvnw test
```

Build one module:

```bash
./mvnw -pl creational-patterns test
```

## Learning Flow

1. Understand the problem.
2. Write the simplest working version.
3. Refactor toward the pattern.
4. Explain it like an interview answer.
5. Add a small test or demo.
