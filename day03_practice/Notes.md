## Inheritance
- A class **acquires properties and methods** from another class.

### Types of Inheritance

- **Single Inheritance:** A → B  
  One child inherits from one parent.

- **Multilevel Inheritance:** A → B → C  
  Chain of inheritance.

- **Hierarchical Inheritance:** A → B, A → C  
  Multiple children inherit from one parent.

- **Multiple Inheritance:** A class inherits from **more than one class**  
- **Hybrid Inheritance:** Combination of two or more types of inheritance

> **Note:** Multiple and Hybrid inheritance with classes are **not allowed in Java** to avoid ambiguity. Use **interfaces** to achieve multiple inheritance.

---

## `super` Keyword
- Refers to **parent class object**.
- Used to access:
  - Parent constructor: `super();`
  - Parent method: `super.methodName();`
  - Parent variable: `super.variableName;`

