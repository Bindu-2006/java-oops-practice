## Wrapper Classes
- Convert primitives into objects
- Needed for Collections

- Autoboxing: primitive → object  
- Unboxing: object → primitive

- `==` compares references (objects)
- `.equals()` compares values
- Integer cache range: -128 to 127

---

## Packages
- Group of related classes
- Avoids name conflicts
- Improves code structure

---

## Static Variable
- Belongs to class
- Shared among all objects
- Only one copy exists
- Used for counting objects

---

## Static Block
- Executes once
- Runs before main()'
- Used for initialization

---

## Static Method
- Called using class name
- Cannot access non-static members directly

---

## Inner Classes
- Class inside another class

### Non-Static Inner Class
- Needs outer class object
- Created using:
  'outerObject.new InnerClass()'

### Static Inner Class
- Does not need outer object
- Can access only static members

