## Polymorphisim
- Polymorphism means one thing can take many forms.

### Types of Polymorphisim

- **Compile Time(Over Loading):**  
  - Same method name, different parameters (number or type)
  - Decision which method to call is made at compile time

- **Run Time(Overriding):**
  - Decision which method to call is made at runtime
  - which allows a child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent 
  
---

## Encapsulation

- Encapsulation means hiding data inside a class and allowing access only through methods.
- Use private for variables
- Use methods to get and set values
- Constructors should also enforce validation

### Applications

- Read-Only Classes:without any setter methods.
- Write-Only Classes:only public setter methods.
- Full Control: The most common use case is providing both getters and setters
