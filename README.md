# Atelier Google Design Patterns
## Composite design pattern
Composite pattern is a partitioning design pattern and describes a group of objects that is treated the same way as a single instance of the same type of object. The intent of a composite is to “compose” objects into tree structures to represent part-whole hierarchies. It allows you to have a tree structure and ask each node in the tree structure to perform a task.

When dealing with Tree-structured data, programmers often have to discriminate between a leaf-node and a branch. This makes code more complex, and therefore, error prone. The solution is an **interface** that allows treating complex and primitive objects uniformly.

The key concept is that you can manipulate a single instance of the object just as you would manipulate a group of them. The operations you can perform on all the composite objects often have a least common denominator relationship.

### The Composite Pattern has four participants
1.  **Component** – Component declares the interface for objects in the composition and for accessing and managing its child components. It also implements default behavior for the interface common to all classes as appropriate.
2.  **Leaf** – Leaf defines behavior for primitive objects in the composition. It represents leaf objects in the composition.
3.  **Composite** – Composite stores child components and implements child related operations in the component interface.
4.  **Client** – Client manipulates the objects in the composition through the component interface.

Client use the component class interface to interact with objects in the composition structure. If recipient is a leaf then request is handled directly. If recipient is a composite, then it usually forwards request to its child components, possibly performing additional operations before and after forwarding.

### When to use Composite Design Pattern
Composite Pattern should be used when clients need to ignore the difference between compositions of objects and individual objects. If programmers find that they are using multiple objects in the same way, and often have nearly identical code to handle each of them, then composite is a good choice, it is less complex in this situation to treat primitives and composites as homogeneous.

*  Less number of objects reduces the memory usage, and it manages to keep us away from errors related to memory like `java.lang.OutOfMemoryError`.
*  Although creating an object in Java is really fast, we can still reduce the execution time of our program by sharing objects.
### When not to use Composite Design Pattern?
*	Composite Design Pattern makes it harder to restrict the type of components of a composite. So it should not be used when you don’t want to represent a full or partial hierarchy of objects.
* Composite Design Pattern can make the design overly general. It makes harder to restrict the components of a composite. Sometimes you want a composite to have only certain components. With Composite, you can’t rely on the type system to enforce those constraints for you. Instead you’ll have to use run-time checks.
### Example
<img align=center src="https://i.imgur.com/9kqyDEs.png" alt="Composite Design Pattern UML">

The **core** of the diagram is the **Plant interface**, which has the following methods:
* `getOxigenAmountPerYear`- the annual oxygen production of the given plant;
* `getLifeTime`- the lifetime of the plant;
* `getRepresentation`- the text representation of the plant.

The classes in the **simple** package implement the plant interface. Their oxygen production and life span is a number chosen by the user and their textual representation  is the first letter of the class name.
The classes in the **composite** package also implement the plant interface, and also store **Plant-type** elements (the **Forest** class in an **ArrayList**, the **Field** class in a **HashSet**). In both classes, the oxygen production is equal to the **sum** of the oxygen production by the plants contained in the class  and the life time of the plant is equivalent to the **maximum** of the contained plants’ lifetime.

The textual representation of a **Forest** is the textual representation of its stored plants, separated by a comma and between curly brackets. The textual representation of a **Field** is the same, only with **square brackets**.

Every class has the **add** and **remove** methods, which makes possible the addition or removal of a plant. These call the appropriate methods from the **ArrayList** and **HashSet**.

### Testing

To test the application, **create** and **add** the elements needed to achieve the following representation: **{[G, F], [M, M], P, O}**. Write out the **representation**, **oxygen production** and **life span** of the **forest**. Write out the **oxygen production** and **lifetime** of the **fields**.

## Decorator design pattern
### Intent
Attach **additional responsibilities** to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
### Problem
You want to add **behavior** or **state** to individual objects at run-time. Inheritance is not feasible because it is **static** and applies to an entire class.
### Example
<img align=center src="https://i.imgur.com/UkjJkdy.png" alt="Composite Design Pattern UML">

All classes implement the **Pizza interface**. **PizzaBase** is a simple implementation of this interface, while the descendants of the **PizzaIngredient** class are decorating classes, which decorate the **Pizza** object given as an argument. 

The decorating classes are: _Tomato, Salami, Mushroom, Olives, Corn._
The **PizzaIngredient** class `bake(Graphics)`, `getPrice()`, and `getIngredients()` methods call the methods of the same name from the **Pizza** object given as a parameter, while the descendants of the **PizzaIngredient** class call the inherited methods first(from their parent class) and their own after.
The `getPrice()` method returns the price of the Pizza (the price of all the ingredients on the pizza!) and the `getIngredients()` method returns the ingredients. The `bake(Graphics g)` method draws the `BufferedImage` data using the graphical object received as a parameter. For example: `g.drawImage (img, 0, 0, null);` where img is `BufferedImage` type. The `BufferedImage` data member is initialized in the class constructors.

### Testing
As an illustration, first bake a **PizzaBase** and decorate it with additional ingredients (salami, tomato, olives, corn, etc.) We “bake” in a **JPanel** or **Canvas** class by calling the `bake()` methods for the ingredients in the method of the JPanel or Canvas.
