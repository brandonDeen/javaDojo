# Brandon's Java Dojo
Honing my java skills in the dojo

### Goals:
- to create a nice source of reference material for myself (or anyone that comes across this)
- answer some common interview questions I have gotten (the kind without an NDA)
- code snippets where relevant
- some code challenges I've used as practice (the applications of the algorithm section)


### What this is NOT:
- an all encompassing resource
- a replacement for a textbook

---

## TODO (Add Section for the following):
- [x] Object Oriented Design Basics
- [ ] General Java Facts
- [ ] Datastructures
  - [ ] Arrays & Lists
  - [ ] Stacks & Queues
  - [ ] Maps, Tables
  - [ ] Binary Search Trees
  - [ ] Priority Queues
- [ ] Algorithms
  - [ ] Big Oh Notation
  - [ ] Sorting & Searching: Bubblesort, Mergesort, Quicksort, Heapsort, Binary Search
  - [ ] Graph Traversal: BFS, DFS, Applications of BFS & DFS
  - [ ] Weighted Graphs: Shortest Path, Network Flows
  - [ ] Combinatorial Search
  - [ ] Dynamic Programming: Ugly Numbers, Fibonacci Numbers, Binomial Coefficient, Permutation Coeffiecient
  - [ ] Common Problems
    - [ ] Data Structures: Dictionaries, Priority Queues, Suffic Trees / Arrays, Graphs, Sets, Kd-Tree
    - [ ] Numerical: Linear Equations, Bandwidth Reduction, Matrix Multiplication, Determinants & Permanents, Constrained & Unconstrained Optimization, Random Number Generation, Factoring / Primality, Arbitrary-Precision, Knapsack Problem, Discrete Fourier Transform
    - [ ] Combinatorial: Sorting, Searching, Median, Generating (Permutations, Subsets, Partitions, Graphs), Calendar Calculations, Job Scheduling, Satisfyability
    - [ ] Graph (Polynomial-Time): Shortest Path
    - [ ] Graph (Hard): Traveling Salesman
    - [ ] Set & String: text compression, string matching, cryptography, longest common substring, shortest common superstring
  - [ ] Coding Challenges: Hackerrank, Leetcode, etc.
- [ ] Design Patterns
- [ ] Security
- [ ] Spring / Spring Boot
- [ ] RESTful Services
- [ ] System Design & Scalability
- [ ] Testing: unit, behavioral, etc

---

## Object Oriented Analysis And Design
- Object: a real-world entity that has a state and behavior
- Class: a blueprint which includes all your data
- Encapsulation: mechanism where you bind your data(variables) and code(methods) together as a single unit.
- Inheritance: where the properties of one class (parent) can be inherited by another (child)
- Polymorphism: characteristic of being able to assign a different meaning or usage to something in different contexts – specifically, to allow an entity such as a variable, a function, or an object to have more than one form
- Association: a relationship where all objects have their own lifecycle and there is no owner.
  - EX: Teach & Student, many students associate with a single teach, and a single student can associate with many teachers
- aggregation: form of Association where all object has their own lifecycle but there is ownership
  - child object can not belong to another parent object
  - child object is not destroyed when the owner is destroyed
- composition: form of Aggregation and we can call this as a “death” relationship
- Abstraction: the quality of dealing with ideas rather than events. It basically deals with hiding the details and showing the essential things to the user
- Interface: a blueprint of a class or you can say it is a collection of abstract methods and static constants
- Method Overloading: Methods of the same class shares the same name but each method must have a different number of parameters or parameters having different types and order
  - to “add” or “extend” more to the method’s behavior
  - compile-time polymorphism
- Method Overriding: the subclass has the same method with the same name and exactly the same number and type of parameters and same return type as a superclass
  - to “Change” existing behavior of the method
  - run-time polymorphism
### Design Principles:
- Do Not Repeat Yourself
- SOLID:
  - Single Responsibility
  - Open / Closed
  - Liskov Substitution
  - Interface Segregation
  - Dependency Inversion
    
## General Java Facts (aka Trivia Questions)
- JDK vs JRE vs JVM
  |JDK|JRE|JVM|
  |---|---|---|
  |Java Development Kit|Java Runtime Environment|Java Virtual Machine|
  |tool necessary to compile, document, and package java code|runtime environment in which java bytecode can be executed|abstract machine, specification that provides a run-time environment in which java bytecode can be executed|
  |contains JRE + development tools|implementation of the JVM|Specification, Implementation, Runtime Instance|
- Data Types:
  |Data Type|Size|Description|
  |---|---|---|
  |byte|1 byte|Stores whole numbers from -128 to 127|
  |short|2 bytes|Stores whole numbers from -32,768 to 32,767|
  |int|4 bytes|Stores whole numbers from -2,147,483,648 to 2,147,483,647|
  |long|8 bytes|Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807|
  |float|4 bytes|Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits|
  |double|8 bytes|Stores fractional numbers. Sufficient for storing 15 decimal digits|
  |boolean|1 bit|Stores true or false values|
  |char|2 bytes|Stores a single character/letter or ASCII values|
- keywords:
  |Keyword|Description|
  |---|---|
  |abstract|A non-access modifier. Used for classes and methods: An abstract class cannot be used to create objects (to access it, it must be inherited from another class). An abstract method can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from)|
  |assert|For debugging|
  |boolean|A data type that can only store true and false values|
  |break|Breaks out of a loop or a switch block|
  |byte|A data type that can store whole numbers from -128 and 127|
  |case|Marks a block of code in switch statements|
  |catch|Catches exceptions generated by try statements|
  |char|A data type that is used to store a single character|
  |class|Defines a class|
  |continue|Continues to the next iteration of a loop|
  |const|Defines a constant. Not in use - use final instead|
  |default|Specifies the default block of code in a switch statement|
  |do|Used together with while to create a do-while loop|
  |double|A data type that can store whole numbers from 1.7e−308 to 1.7e+308|
  |else|Used in conditional statements|
  |enum|Declares an enumerated (unchangeable) type|
  |exports|Exports a package with a module. New in Java 9|
  |extends|Extends a class (indicates that a class is inherited from another class)|
  |final|A non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override)|
  |finally|Used with exceptions, a block of code that will be executed no matter if there is an exception or not|
  |float|A data type that can store whole numbers from 3.4e−038 to 3.4e+038|
  |for|Create a for loop|
  |goto|Not in use, and has no function|
  |if|Makes a conditional statement|
  |implements|Implements an interface|
  |import|Used to import a package, class or interface|
  |instanceof|Checks whether an object is an instance of a specific class or an interface|
  |int|A data type that can store whole numbers from -2147483648 to 2147483647|
  |interface|Used to declare a special type of class that only contains abstract methods|
  |long|A data type that can store whole numbers from -9223372036854775808 to 9223372036854775808|
  |module|Declares a module. New in Java 9|
  |native|Specifies that a method is not implemented in the same Java source file (but in another language)|
  |new|Creates new objects|
  |package|Declares a package|
  |private|An access modifier used for attributes, methods and constructors, making them only accessible within the declared class|
  |protected|An access modifier used for attributes, methods and constructors, making them accessible in the same package and subclasses|
  |public|An access modifier used for classes, attributes, methods and constructors, making them accessible by any other class|
  |requires|Specifies required libraries inside a module. New in Java 9|
  |return|Finished the execution of a method, and can be used to return a value from a method|
  |short|A data type that can store whole numbers from -32768 to 32767|
  |static|A non-access modifier used for methods and attributes. Static methods/attributes can be accessed without creating an object of a class|
  |strictfp|Restrict the precision and rounding of floating point calculations|
  |super|Refers to superclass (parent) objects|
  |switch|Selects one of many code blocks to be executed|
  |synchronized|A non-access modifier, which specifies that methods can only be accessed by one thread at a time|
  |this|Refers to the current object in a method or constructor|
  |throw|Creates a custom error|
  |throws|Indicates what exceptions may be thrown by a method|
  |transient|A non-accesss modifier, which specifies that an attribute is not part of an object's persistent state|
  |try|Creates a try...catch statement|
  |var|Declares a variable. New in Java 10|
  |void|Specifies that a method should not have a return value|
  |volatile|Indicates that an attribute is not cached thread-locally, and is always read from the "main memory"|
  |while|Creates a while loop|
- operators:
- access modifiers:
  |Modifier|Default (Package-Private)|Private|Protected|Public|
  |---|---|---|---|---|
  |same class|YES|YES|YES|YES|
  |same package, subclass|YES|NO|YES|YES|
  |same package, non-subclass|YES|NO|YES|YES|
  |different package subclass|NO|NO|YES|YES|
  |different package non-subclass|NO|NO|NO|YES|
- variable arguments (Varargs):
  ```java
  /* call like this:
        formatUsingVarArgs();
        formatUsingVarArgs("some", "string", "values");
     beware heap pollution
  */
  public String formatUsingVarArgs(String... values) {
    // values = String[]
  }
  ```
- Compilation: java code (.java) to byte code (.class) to machine code
  - Just-in-time(JIT) Compiler:  a program that helps in converting the Java bytecode into instructions that are sent directly to the processor. By default, the JIT compiler is enabled in Java and is activated whenever a Java method is invoked. The JIT compiler then compiles the bytecode of the invoked method into native machine code, compiling it “just in time” to execute. Once the method has been compiled, the JVM summons the compiled code of that method directly rather than interpreting it. This is why it is often responsible for the performance optimization of Java applications at the run time
- Garbage Collection: helps in implicit memory management. once there are no more references to an object, java destroys it and frees that memory up
  - using finalize(): signals that an object is ready for garbage collection
  - Types: Serial for single thread, Parallel for multiple threads, Concurrent Mark Sweep (CMS) for ???, Garbage First (G1) replaces CMS
- Exceptions:
  - Error vs Exception: error is irrecoverable condition at runtime (OutOfMemory), while an exception is a condition that can be recovered from
  - Checked vs Unchecked Exception: checked are compile time exceptions, unchecked are runtime exceptions
  - Exception Hierarchy
    - Throwable extends Object
    - Exception extends Throwable
      - Checked Exceptions: IOException, SQLException, ClassNotFoundException
      - Unchecked Exceptions: ArithmeticException, NullPointerException
    - Error extends Throwable
      - VirtualMachineError extends Error
      - AssertionError extends Error
  ```java
  public void throwsExample throws SomeException {
    throw new SomeException();
  }
  
  public void handleExample() {
    try {
      // do something that could throw an exception
    } catch (NullPointerException | ArithmeticException e {
      // this block will execute if: a NullPointerException or ArithmeticException is thrown
    } catch (Exception e) {
      // this block will execute if: an exception other than a NullPointerException or ArithmeticException is thrown
    } finally {
      // this block will execute whether an exception is caught or not
    }
  }
  ```
- Multi Threading:
  - thread: smallest piece of programmed instructions that can be executed independently
    - create a thread by extending Thread or implementing Runnable
  - process vs thread
    ||Process|Thread|
    |---|---|---|
    |Definition|executing instance of a program|subset of a process|
    |Communication|must use inter-process communication to talk with siblings|can directly communicate with sibling threads of the same process|
    |Control|can only control child processes|can control threads of the same process|
    |Changes|change to a parent process does not affect the child process|changes to the main thread affect behavior of other threads|
    |Memory|run in separate memory spaces|run in shared memory spaces|
    |Controlled By|operating system|programmer in program|
    |Dependence|independent|dependent|
  - Synchronization: a process which keeps all concurrent threads in execution to be in sync
  - Asynchronous: process operates independently from other processes
  - Synchronous: process runs only as a result of some other process being completed or handed off
- Collections:
- Object Cloning: the process of creating an exact copy of an object
  - use clone() method creates a new instance of the class and initializes all fields with the same contents
  - must implement Cloneable and override clone()
- Covariant Return Type:
- Dynamic Binding:
- Runtime Polymorphism (aka Dynamic Method Dispatch): process in which a call to an overridden method is resolved at runtime rather than at compile-time
- Generics:
- Reflection:
- Singleton Class: a class whose only one instance can be created at any given time, in one JVM. A class can be made singleton by making its constructor private.
- create custom annotation:
- String vs StringBuilder vs StringBuffer:
    | | String | StringBuilder | StringBuffer |
    |---|---|---|---|
    | Storage Area | constant string pool | heap area | heap area |
    | Mutability | immutable | mutable | mutable |
    | Thread Safety | yes | no | yes |
    | Performance | fast | more efficient | less efficient |
- heap vs stack:
  |Feature|Stack|Heap|
  |---|---|---|
  |Memory|used only by one thread of execution|used by all parts of the application|
  |Access|cannot be access by other threads|globally accessible|
  |Memory Management|LIFO|based on generation associated with each object|
  |Lifetime|exists until the end of the execution thread|from start until end of the application|
  |Usage|only contains local and primitive reference variables to objects in heap space|whenever an object is created it's always stored in the heap space|
- arraylist vs vector:
  |ArrayList|Vector|
  |---|---|
  |not synchronized|synchronized|
  |fast|slow|
  |increases in size by 50% when elements are added|doubles in size when elements are added|
  |does not define increment size|defines increment size|
  |can only use iterator for traversal|can use enumeration and iterator for traversal|
- == vs .equals(): 
  - == compares primitives, compares reference point of objects
  - .equals() is a method used to compare objects, Object class uses == to compare, can be overridden to compare values in the object
- break vs continue:
  |break|continue|
  |---|---|
  |can be used in switches or loops| can only be used in loops|
  | cause switch/loop to terminate the moment it is executed | cause loop to jump to the next iteration |
- static vs non-static method:
  |Static|Non-Static|
  |---|---|
  | must use static keyword | non-static by default |
  | called by using ClassName.methodName() | called like any general method: objectInstance.methodName() |
  | cannot access non-static instance variables or methods | can access any static method and any static variable without creating an instance of the class |
- why are strings immutable: because string literals are normally shared between clients, action from one may impact another
  - immutable: once the object is created its state cannot be modified
- array vs arraylist:
  | Array | ArrayList |
  |---|---|
  | Cannot contain values of different data types | Can contain values of different data types |
  | Size must be defined at time of declaration | size is dynamically changed (default of 10) |
  | Must specify index when adding elements | elements added without index |
  | not an object | object that extends Collection |
  | can store primitives and objects | cannot store primitives only objects |
- abstract class vs interface:
  |Abstract Class | Interface |
  |---|---|
  | 0-100% abstraction | 100% abstraction |
  | can provide default code or just details that must be overridden | no code just the signature |
  | class can only extend one abstract class | class can implement multiple interfaces |
  | can have abstract & non-abstract methods | all methods are abstract |
  | can have instance variables | cannnot have instance variables |
  | can be public, private, or protected | must be public |
  | if you add a new method, you can provide a default implementation so all extending classes may still function / override as needed | if you add a new method it MUST be added to all classes that implement the interface |
  | can contain constructors | no constructors |
  | fast | slow, requires extra indirection to find the corresponding methods |
  
### Java 8
- functional interfaces:
- lambda expressions:
- optionals:
- method references:
- default methods:
- Streams:
- Collectors:
  
## Data Structures
- Arrays & Lists
- Stacks & Queues
- Maps & Tables
- Binary Search Trees

## Algorithms
  - Big Oh Notation
  - Sorting & Searching: Bubblesort, Mergesort, Quicksort, Heapsort, Binary Search
  - Graph Traversal: BFS, DFS, Applications of BFS & DFS
  - Weighted Graphs: Shortest Path, Network Flows
  - Combinatorial Search
  - Dynamic Programming: Ugly Numbers, Fibonacci Numbers, Binomial Coefficient, Permutation Coeffiecient
  - Common Problems
    - Data Structures: Dictionaries, Priority Queues, Suffic Trees / Arrays, Graphs, Sets, Kd-Tree
    - Numerical: Linear Equations, Bandwidth Reduction, Matrix Multiplication, Determinants & Permanents, Constrained & Unconstrained Optimization, Random Number Generation, Factoring / Primality, Arbitrary-Precision, Knapsack Problem, Discrete Fourier Transform
    - Combinatorial: Sorting, Searching, Median, Generating (Permutations, Subsets, Partitions, Graphs), Calendar Calculations, Job Scheduling, Satisfyability
    - Graph (Polynomial-Time): Shortest Path
    - Graph (Hard): Traveling Salesman
    - Set & String: text compression, string matching, cryptography, longest common substring, shortest common superstring
  - Coding Challenges: Hackerrank, Leetcode, etc.
  
## Design Patterns
- Singleton
- Factory
- Strategy
- Observer
- Builder
- Adapter
- State
- MVC

## Security
- OAuth
- OAuth2
- PingAccess
- Cookies
- 

## Spring (https://www.edureka.co/blog/interview-questions/spring-interview-questions/)
Summary: opens source framework created to reduce complexity of applications, it is light-weight and loosely coupled, layered architecture allows you to select components to use, provides support to various other framework
- Advantages
  - use what you need, leave out what you dont need
  - POJO programming for continuous integration / testability
  - Dependency Injection & Inversion of Control simplifies applicaiton
  - open source
- Dependency Injection: you do not have to create your objects but have to describe how they should be created, and the IOC container will wire them together
  - Constructor vs Setter Injection
- Inversion of Control (IOC): objects give their dependencies instead of creating or looking for dependent objects
  - IOC Container: creates the objects, wires them together, configures them and manages their complete life cycle
    - BeanFactory: factory class that contains a collection of beans, and instantiates beans as needed
    - ApplicationContext: built on top of the BeahFactory
  - Comparison:
- Aspect Oriented Programming (AOP): separating application business logic from system services
- Bean:
- Configuration:
  - XML based
  - Annotation based:
  - Java Based
- Scopes:
- Bean Lifecycle
- Inner Bean
- Autowiring:
  - modes
  - limitations
- Annotations
- Data Access
  - Hibernate
- Aspect Oriented Programming

## RESTful Services (https://www.softwaretestinghelp.com/restful-web-services-interview-question/)
Summary:
- features
- protocol
- addressing
- messaging
- HTTP methods
  - Put vs post
- HTTP request
- HTTP response
- statelessness:
  - Advantages
  - Disadvantages
- constraints
- resource
- caching
- cache-control header
- payload
- jax-rs
- common HTTP status codes:
- best practicies

## System Design & Scalability

## Testing

## Angular
- features
- directives
- promises


## Sql
## Git
## Agile Methodologies

## References
- The Algorithm Design Manual by Steven S. Skiena
