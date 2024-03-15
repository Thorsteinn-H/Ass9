# HBV202GAssignment9
A project skeleton for implementing the *Composite* pattern and the *Observer* pattern 
(and some sort of *Template Method* pattern) based on tests using JUnit4.

## Installation

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE should understand 
when you `git clone` it. The provided Maven POM includes the JUnit4 dependency.

Both the implementation and the tests are in Java package `is.hi.hbv202g.ass9`,  
but in the usual separate Maven `src` directories:

- `src/main/java`:
  - `is.hi.hbv202g.ass9.composite`: Your implementation of the *Composite* pattern has to go there. 
    Choose class, interface, and method names so that they fit the provided test cases.
  - `is.hi.hbv202g.ass9.compositeObserved`: Your implementation of the *Composite* pattern that is combined with the 
    *Observable* patterns has to go there. Choose class, interface, and method names so that they fit the provided test cases.
  - `is.hi.hbv202g.ass9.compositeObservedTemplateMethod`: Your refactoring of the above patterns inspired by the *Template Method* pattern.
- `src/test/java`: (each package contains an `Alltests` class that collects all the test cases for the respective 
  package in one test suite, so that you can execute exactly only the testcase of the package that you are currently implementing),
  - `is.hi.hbv202g.ass9.composite`: Test cases testing a composite implementation.
  - `is.hi.hbv202g.ass9.compositeObserved`: Test cases testing an implementation of a composite where the leafs are 
   observed by the composite implementation.
  - `is.hi.hbv202g.ass9.compositeObservedTemplateMethod`: The same test cases for testing the refactoring of the 
     above patterns inspired by the *Template Method* pattern.

## Building

Maven:

- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends with `Test`, 
  `Tests`, or `TestCase`). As long as you have not finished implementing all packages, it is better to use the IDE to
  run individual test cases or package-level test suites.
