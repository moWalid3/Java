package B_inherit_composition;

public class Square extends Shape{
    // this inheritance (Square extends Shape) because square is a shape

    // in inheritance ==> the subclass inherits all attributes and method without private and default(if sub in different package)

    Point point = new Point();
    // this called composition because square has a point

    // composition == aggregation
    // the different is ==> aggregation can dispense of it, but composition can't dispense of it.
    // Ex: car has a motor and radio ==> motor = composition, radio = aggregation.

}
