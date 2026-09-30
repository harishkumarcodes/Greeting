# 👋 Greeting Program — Interface & Anonymous Class

A simple Java program created to understand how **interfaces, class implementation, method overriding, and anonymous inner classes** work.

The program demonstrates two different ways of providing an implementation for the same interface: using a **named class** and using an **anonymous inner class**.

---

## ✨ What This Program Does

The program creates an interface called `Greeting_1` with a `greet()` method.

It then demonstrates two implementations:

1. **Named Class Implementation** — `Greeting_2` implements the interface and provides its own version of `greet()`.
2. **Anonymous Inner Class** — An object of the interface is created with an implementation of `greet()` directly inside the `main()` method.

Both implementations are then called to display different greeting messages.

---

## 🚀 Major Features

* ✅ Demonstrates Java interfaces
* 🧩 Implements an interface using a named class
* ⚡ Creates an anonymous inner class
* 🔄 Demonstrates method overriding
* 🏗️ Shows object creation using an interface reference
* 🔀 Demonstrates multiple implementations of the same method
* 📚 Helps understand abstraction and polymorphism
* 💡 Shows when named and anonymous classes can be used

---

## 🔄 Program Flow

```text
                 ┌──────────────────┐
                 │   Start Program  │
                 └────────┬─────────┘
                          ↓
                 ┌──────────────────┐
                 │ Create Interface │
                 │   Greeting_1     │
                 └────────┬─────────┘
                          ↓
              ┌─────────────────────────┐
              │ Greeting_2 implements   │
              │      Greeting_1         │
              └────────────┬────────────┘
                           ↓
              ┌─────────────────────────┐
              │ Create object using     │
              │ interface reference     │
              └────────────┬────────────┘
                           ↓
                  ┌────────────────┐
                  │   greet()      │
                  │ Named Class    │
                  └───────┬────────┘
                          ↓
              ┌─────────────────────────┐
              │ Create Anonymous Class  │
              │ implementing Greeting_1 │
              └────────────┬────────────┘
                           ↓
                  ┌────────────────┐
                  │   greet()      │
                  │ Anonymous Class│
                  └───────┬────────┘
                          ↓
                 ┌──────────────────┐
                 │       End        │
                 └──────────────────┘
```

---

## 🧠 How the Logic Works

### 1. Creating the Interface

The program starts with the `Greeting_1` interface.

```java
interface Greeting_1 {
    void greet();
}
```

The interface only declares the `greet()` method. It does not provide its implementation.

---

### 2. Named Class Implementation

The `Greeting_2` class implements the interface.

```java
class Greeting_2 implements Greeting_1 {
    public void greet() {
        System.out.println("Hello, welcome to the Greeting_2");
    }
}
```

Here, the `greet()` method is implemented inside a separate class.

The object is then created using an interface reference:

```java
Greeting_1 a = new Greeting_2();
```

When `a.greet()` is called, the implementation from `Greeting_2` is executed.

---

### 3. Anonymous Inner Class

The program then creates another implementation without giving the class a separate name.

```java
Greeting_1 b = new Greeting_1() {
    public void greet() {
        System.out.println("Hello from anonymous class!");
    }
};
```

This is called an **anonymous inner class** because the class does not have a name.

It is useful when the implementation is needed only once.

---

## 🔍 Named Class vs Anonymous Inner Class

| Named Class                  | Anonymous Inner Class                    |
| ---------------------------- | ---------------------------------------- |
| Has a class name             | Does not have a class name               |
| Written separately           | Created at the point of object creation  |
| Can be reused                | Usually used for one-time implementation |
| Suitable for larger programs | Suitable for small implementations       |
| Easy to maintain and extend  | Useful for quick implementations         |

---

## 📚 What I Learned

While making this program, I learned how to:

* Create an **interface** in Java.
* Implement an interface using a class.
* Override a method declared inside an interface.
* Create objects using **interface references**.
* Understand the basic idea of **abstraction**.
* Understand how **polymorphism** works with interfaces.
* Create and use an **anonymous inner class**.
* Understand the difference between a named class and an anonymous class.
* Use different implementations of the same interface method.
* Understand when an anonymous class is useful in Java.

---

## 🛠️ Concepts Used

| Concept               | Usage                                                      |
| --------------------- | ---------------------------------------------------------- |
| Interface             | `Greeting_1`                                               |
| Implementation        | `Greeting_2 implements Greeting_1`                         |
| Method Overriding     | `greet()`                                                  |
| Interface Reference   | `Greeting_1 a` and `Greeting_1 b`                          |
| Named Class           | `Greeting_2`                                               |
| Anonymous Inner Class | Created directly inside `main()`                           |
| Object Creation       | `new Greeting_2()`                                         |
| Polymorphism          | Interface reference referring to different implementations |

---

## 💻 Example Output

```text
Hello, welcome to the Greeting_2
Hello from anonymous class!
```

The output shows that the same `greet()` method can produce different results depending on the implementation being used.

---

## 📁 Project Structure

```text
Java-Programming-Practicals/
│
├── 01-Basics/
│   └── PrimeCheck.java
│
└── 02-Interfaces-and-Anonymous-Class/
    └── Greeting.java
```

---

## 🎯 Purpose

The main purpose of this program is to understand how Java interfaces can be implemented in different ways.

It gives a practical understanding of the difference between a **reusable named class** and a **one-time anonymous class implementation**.

> **One interface → Multiple implementations → Different behavior**

---

## 🔮 Possible Improvements

This program can be extended by:

* Adding more classes that implement `Greeting_1`.
* Taking the greeting message from the user.
* Creating multiple anonymous implementations.
* Using interfaces with multiple methods.
* Exploring lambda expressions as an alternative for functional interfaces.

---

### 👨‍💻 Language

**Java**

### 📌 Project Type

**Java Programming Practical / OOP Concept**

### 📖 Main Concepts

**Interfaces • Method Overriding • Anonymous Inner Classes • Abstraction • Polymorphism**
