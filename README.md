# piyurisahu-Flyweight-Design-Pattern
Definition:- Flyweignt Design patter is a type of structural design pattern which enables to decrease number of object creation thus improve performance of the program.






? Intrinsic Attribute
		Constant and Immutable
		Has a pre-defined state
		Independent of Flyweight’s context
? Extrinsic Attribute
		Dependent on Flyweight’s context
		Passed by Client Objects
		Non-shareable
		Determined during run-time
? Both attributes constitute a Flyweight objects, which behaves independently in different contexts

Motivation

? A Smaller Amount of objects shrinks the memory use, and it manages to keep us away from errors related to memory like java.lang.OutOfMemoryError.
? Even though creating an object in Java is really high-speed, Flyweight can still reduce the execution time of the program by sharing objects.
? If the objects are immutable and only small number of state . it may be possible to radically reduce the total number of objects in the system by using only copies of a few preconstructed objects.


Application
? he flyweight pattern is used to implement a program which uses a huge number of objects that have part of their internal state is common where the other part of state can be unique in term of only a few parameter.
? It can be used in the following scenario
? War Game where multiple players get created
? Text Editor. To process 2000 character, we just have to create 100-200 objects.
? Ex- A Drawing  function might have 10 different pens. To draw shape with using 200 times, function can have 200 pointer which refer to 10 object of pens rather then creating 200 object for each pens.


