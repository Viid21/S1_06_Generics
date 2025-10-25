# 🧑‍💻 Task S1.06. Java Generics and Type Constraints  
**Author:** David Rey  
**Corrected by:** Lois González ([pantalois](https://github.com/Viid21/S1_06_Generics/issues/1))  

## 📄 Description  
This project includes several exercises organized by difficulty level, focusing on Java Generics, type safety, bounded type parameters, and the use of interfaces with generic constraints. The goal is to understand how generics improve code reusability, flexibility, and type checking at compile time.

### 🔹 Level 1  
**Exercise 1 – NoGenericMethods Class**  
- Create a class named `NoGenericMethods` that stores three arguments of the same type.  
- Include methods to store and retrieve these objects.  
- Implement a constructor to initialize the three arguments.  
- Verify that the arguments can be passed in any order when calling the constructor.  

**Exercise 2 – GenericMethods with Mixed Types**  
- Create a class `Person` with attributes:  
  - `name` (String)  
  - `surname` (String)  
  - `age` (int)  
- Create a class `GenericMethods` with a generic method that accepts three arguments of generic type.  
- The method should simply print the arguments it receives.  
- In the `main()` method of the principal class, call the generic method with different parameter types (e.g., a `Person` object, a `String`, and a primitive type).  
- Demonstrate that the method accepts any type of parameter in any order.  

### 🔹 Level 2  
**Exercise 1 – Partially Generic Method**  
- Modify the previous exercise so that one of the arguments of the generic method is not generic (e.g., a fixed type such as `String`).  

**Exercise 2 – Varargs in Generic Methods**  
- Modify the previous exercise so that the generic method accepts a variable number of arguments (`varargs`).  
- Demonstrate that the method can handle an undefined list of arguments of different types.  

### 🔹 Level 3  
**Exercise 1 – Bounded Generics with Interfaces**  
- Create an interface `Phone` with a method `call()`.  
- Create a class `Smartphone` that implements `Phone` and also includes a method `takePhoto()`.  
- Create a class `GenericClass` with two generic methods:  
  - The first method accepts an argument bounded by the `Phone` interface.  
  - The second method accepts an argument bounded by the `Smartphone` class.  
- From these methods, call the appropriate methods of `Phone` and `Smartphone`.  
- In the `main()` method of the `Main` class, pass a `Smartphone` object to both generic methods of `GenericClass`.  
- Reflection:  
  - The method bounded by `Phone` **cannot** call `takePhoto()` because it only guarantees access to methods defined in the `Phone` interface.  
  - The method bounded by `Smartphone` **can** call both `call()` and `takePhoto()`.  

## 💻 Technologies Used  
- Java SE 24  
- IntelliJ IDEA as the development environment  
- Git & GitHub for version control  
- JDK for compiling and running the code  
- Generics in Java:  
  - Generic classes and methods  
  - Bounded type parameters (`extends`)  
  - Varargs with generics  
- OOP Principles:  
  - Class design and encapsulation  
  - Interfaces and implementation  
  - Method overloading and type safety  

## 📋 Requirements  
- Java Development Kit (JDK) 24 or higher  
- IntelliJ IDEA or any Java-compatible IDE  
- Git installed to clone the repository  
- Basic knowledge of object-oriented programming and Java Generics  

## 🛠️ Installation  
- Clone the repository:  
```bash
https://github.com/Viid21/S1_06_Generics.git
