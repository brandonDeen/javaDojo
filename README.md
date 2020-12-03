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
- Do Not Repeat Yourself (DRY)
- SOLID:
  - Single Responsibility: a class should only have a single responsibility, only changes to one part of the softwares application should be able to affect the specification of the class
  - Open / Closed: software entities should be... *OPEN for extension* and *CLOSED for modification*
  - Liskov Substitution: objects of a superclass shall be replaceable with objects of its subclass without breaking the application
  - Interface Segregation: seperate interfaces so that no client should be forced to depend on methods it does not use
  - Dependency Inversion: high level modules should not depend on low-level modules, both should depend on abstractions (interfaces). abstractions should not depend on details (concrete implementations), details should depend on abstractions.
- 12 Factor App: 
  - GOALS:
    - minimize time for new devs joining, maximum portability, enable ci/cd, scale up w/o significant architecture changes
  1) Codebase: one codebase tracked in version control, many deploys
  2) Dependencies: Explicitly declare and isolate dependencies
  3) Config: store config in the environment
  4) Backing Services: treat backing services as attached resources
  5) Build, Release, Run: strictly separate build and run stages
  6) Processes: execute the app as one or more stateless processes
  7) Port Binding: Export services via port binding
  8) Concurrency: scale out via process model
  9) Disposability: maximize robustness with fast startup and graceful shutdown
  10) dev/prod parity: keep development, staging, and production as similar as possible
  11) Logs: treat logs as event streams
  12) Admin Processes: run admin / management tasks as one-off processes
    
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
- Collections: TODO
- Object Cloning: the process of creating an exact copy of an object
  - use clone() method creates a new instance of the class and initializes all fields with the same contents
  - must implement Cloneable and override clone()
- Covariant Return Type:
- Dynamic Binding:
- Runtime Polymorphism (aka Dynamic Method Dispatch): process in which a call to an overridden method is resolved at runtime rather than at compile-time
- Generics: methods that are written with a single method declaration and can be called with arguments of different types
  - no primitives allowed
  - enforce type correctness at compile time
  - K is for key, V is for Value, T is for Type, E is for element, ? is wildcard
  - <? super T> means unknown type that is a superclass of T
  - <? extends Number> means unknown type that is a subclass of Number
  ```java
  public <T> List<T> fromArrayToList(T[] a) {   
    return Arrays.stream(a).collect(Collectors.toList());
  }
  
  // OR
  public <? super T> List<T> fromArrayToList(T[] a) {
    ...
  }
  
  // OR
  public <? extends > List<T> fromArrayToList(T[] a) {
    ...
  }
  
  // OR
  public <T extends Number> List<T> fromArrayToList(T[] a) {
    ...
  }
  
  // OR
  public <T extends Number & Comparable> List<T> fromArrayToList(T[] a) {
    ...
  }
  ```
- Reflection: allows us to inspect or/and modify runtime attributes of classes, interfaces, fields, and methods
- Singleton Class: a class whose only one instance can be created at any given time, in one JVM. A class can be made singleton by making its constructor private.
- create custom annotation: 
  - declare it with @interface annotation
  - ad meta-annotations to specify scope and target
- HashMap vs HashTable
  ||HashMap|HashTable|
  |Synchronized|No|Yes|
  |Null Key|yes, 1 is allowed|no|
  |Null Values|yes, multiple|no|
- hashing: by default, will use Object.hashCode() unless overridden and must consistently return the same integer, provided no information used in equals comparison on the object is modified (i.e. if x.equals(y) then x.hashCode() == y.hashCode())
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
- functional interfaces: interface with only a single abstract method (create with @FunctionalInterface)
- lambda expressions: anonymous function vs anonymous inner classes, less code
  - intermediate expression: returns another stream (EX: ...)
  - terminal expression: does not return a stream (EX: ...)
- optionals: to avoid NullPointerExceptions
  - empty(): is value null
  - check if null using isPresent() or ifPresent(doSomething)
  - orElse(this) and orElseGet(that): if null default to this or that
- method references: object::instanceMethod, Class::staticMethod, Class::instanceMethod, Class::new
- default methods: interface can implement a default method, so that implementing classes can use that by default vs implementing their own version
  
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
- Singleton: restricts instantiation of a class to a "single" instance
  - Use When: exactly one object is needed to coordinate actions across the system
- Factory (creational): methods for creating objects without having to specify the exact class of the object that will be created.
  - Use When: you need to construct a class with a component that has not yet been determined
- Strategy
- Observer
- Builder: seperate the construction of a complex object from its representation
  - Use When: you need to seperate/delegate the creation of an object or create it in parts
- Adapter
- State
- Model-View-Controller (MVC): divides logic of user interfaces (UI) into three elements, in order to separate internal representations of information from the presentation of the information
- Model-View-ViewModel (MVVM) or model-view-binder: separation of ui code from development of business logic/back end code and bound togehter with a viewmodel/binder 

## Security
- OAuth: open standard for access delegation (TODO add more)
  - Vulnerabilities/Threats: TODO
- OAuth2
  - Vulnerabilities/Threats: TODO
- PingAccess
  - Vulnerabilities/Threats: TODO
- Cookies
  - Vulnerabilities/Threats: TODO

## Spring (https://www.edureka.co/blog/interview-questions/spring-interview-questions/)
Summary: opens source framework created to reduce complexity of applications, it is light-weight and loosely coupled, layered architecture allows you to select components to use, provides support to various other framework
- Advantages
  - use what you need, leave out what you dont need
  - POJO programming for continuous integration / testability
  - Dependency Injection & Inversion of Control simplifies applicaiton
  - open source
- Dependency Injection: you do not have to create your objects but have to describe how they should be created, and the IOC container will wire them together
  - Constructor vs Setter Injection
    |Constructor|Setter|
    |---|---|
    |no partial injection|partial injection|
    |doesnt override setter property|overrides constructor if both are defined|
    |creates new instance if any modifications occur|doesnt create new instance if a property is changed|
    |better for too many properties| better for few properties|
- Inversion of Control (IOC): objects give their dependencies instead of creating or looking for dependent objects
  - IOC Container: creates the objects, wires them together, configures them and manages their complete life cycle
    - BeanFactory: factory class that contains a collection of beans, and instantiates beans as needed
    - ApplicationContext: built on top of the BeahFactory
- Aspect Oriented Programming (AOP): separating application business logic from system services
- Bean: an object that is instantiated, assembled, and managed by a Spring IoC container
  - singelton: only one instance of bean will be created for each container (not thread safe)
  - prototype: new instance everytime bean is requested
  - request: prototype but for web applications / http request
  - session: new bean for each http session
  - global-session: portlet applications
- Configuration:
  - XML based
  - Annotation based
  - Java Based
- Scopes: TODO
- Bean Lifecycle: TODO
- Inner Bean: TODO
- Autowiring: enables programmer to inject bean automatically, without explicit injection logic
  - limitations
- Annotations
  - Controller, RequestMapping, ResponseBody, Autowired, PathVariable, Service
- Data Access
  - Hibernate: object relational mapping (ORM) for CRUD operations
- Aspect Oriented Programming
- Autwire vs Inject
  - Autowire is spring specific
  - Inject is found in other dependency injection tools (Guice)

## RESTful Services (https://www.softwaretestinghelp.com/restful-web-services-interview-question/)
Summary:
- features
- protocol: HTTP
- addressing: locates resources that are present on the service
- messaging: exchanging databetween client and server through HTTP Request and Response
- HTTP methods: 
  - get: read-only
  - put: creating new resource (result is always the same)
  - post: updating or creating a new resource (result is always different)
  - delete: deleting resource
  - options: fetches list of supported options of resources available
- HTTP request: http method method, uri, http version, header with info about data, body with representation of resources
- HTTP response: request code, http version, http response header, response body
  - codes: 2XX success, 3XX redirection, 4XX client error, 5XX server error 
- statelessness: state of clients application not stored on server and passed on
- resource: object of a type (image, HTML file, text, data, etc)
- caching: server response is stored so that a cached copy can be used when required without generating same response again
- cache-control header
- payload: request data in body
- jax-rs: Java API for RESTful web services
- common HTTP status codes:
  - 200
  - 400
  - 404
  - 500
- using get vs post
- using put vs post
- best practicies
  - validate every inpout
  - inputs should be well formed
  - never pass sensitive info through URL
  - user should be authenticated
  - only use HTTP error messages
  - URI should be descriptive

## System Design & Scalability
- Canary Deployments: a pattern for rolling out releases to a subset of users or servers, test it, then roll out the change to the rest of the servers
- Blue/Green Deployments: application release model that gradually transfers user traffic from a previous version (BLUE) of an app or microservice to a nearly identical new release (GREEN), both of which are running in production

## Testing
- static: testing without running the program, i.e. proofreading, compiling, syntax, data flow, etc
- dynamic: testing when the program is run
- passive: verifying system behavior without any interaction with the software product
- box
  - white box: testing the internal workings of a program (unit testing)
  - black box: testing the functionality of the program without any knowledge of the internal implementation (functional testing)
- mutation: modifying a program in small ways (mutants) and running tests to detect and reject the mutant (killing the mutant)
- a/b
- 

## Angular
- project consists of:
  - angular.json: clis configuration for build, serve, test
  - features, components, models, services
- Components – A component controls one or more views. Each view is some specific section of the screen. Every Angular application has at least one component, known as the root component. It is bootstrapped inside the main module, known as the root module. A component contains application logic defined inside a class. This class is responsible for interacting with the view via an API of properties and methods.
- Data Binding – The mechanism by which parts of a template coordinates with parts of a component is known as data binding. In order to let Angular know how to connect both sides (template and its component), the binding markup is added to the template HTML.
- Dependency Injection (DI) – Angular makes use of DI to provide required dependencies to new components. Typically, dependencies required by a component are services. A component’s constructor parameters tell Angular about the services that a component requires. So, a dependency injection offers a way to supply fully-formed dependencies required by a new instance of a class.
- Directives – The templates used by Angular are dynamic in nature. Directives are responsible for instructing Angular about how to transform the DOM when rendering a template. Actually, components are directives with a template. Other types of directives are attribute and structural directives.
- Metadata – In order to let Angular know how to process a class, metadata is attached to the class. For doing so decorators are used.
- Modules – Also known as NgModules, a module is an organized block of code with a specific set of capabilities. It has a specific application domain or a workflow. Like components, any Angular application has at least one module. This is known as the root module. Typically, an Angular application has several modules.
- Routing – An Angular router is responsible for interpreting a browser URL as an instruction to navigate to a client-generated view. The router is bound to links on a page to tell Angular to navigate the application view when a user clicks on it.
- Services – A very broad category, a service can be anything ranging from a value and function to a feature that is required by an Angular app. Technically, a service is a class with a well-defined purpose.
- Template – Each component’s view is associated with its companion template. A template in Angular is a form of HTML tags that lets Angular know that how it is meant to render the component.
- lifecycle hooks: 
  - ngOnChanges
  - ngOnInit
  - ???
- directives: functions that are executed by angular compiler when the found in the DOM
  - attribute (ngClass, ngStyle), structural(\*ngIf, \*ngFor), or custom.
- promises: always asynchronous, eager, executes immediately when called, provide a single value
- observable: stream that allows passing of multiple events, it is lazy and does not execute until a subscription is made, callback is made for each event, can be synchronous, can emit 0 to many values
- how to share data between components?: parent/child components
  - parent to child: @Input in the child component
  - parent to child: @ViewChild in parent identifies child component
  - child to parent: @ViewComponent, parent has a "child" property
  - child to parent: @Output and EventEmitter, parent captures emitted data
- string interpolation: using {{ }}, to display component data
- annotation vs decorator: both use @
  - annotation: hard-coded, used by compiler, reflect metadata
  - decorator: function that adds metadata to a class or method (@Component, NgModule, Input, Output, Injectable)
- provider: object declared to angular so that it can be injected in the constructor of your components, directives and other classes
- Angular Ahead-of-time (AOT) Compiler: applicaiton compiles during build time
  - fast rendering, fewer ajax requests, minimizing errors, better security
- Model View ViewModel (MVVM):
  - Model: data and the business logic of an application, or we may say it contains the structure of an entity
  - View: visual layer
  - ViewModel: abstract layer of the application and acts as a bridge between the View and Model(business logic)


## Sql
## Git
## Agile Methodologies

## References
- The Algorithm Design Manual by Steven S. Skiena
