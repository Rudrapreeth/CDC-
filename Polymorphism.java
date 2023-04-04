public class Polymorphism {
}
/*class Adder{
    static int add(int a, int b){return a+b;}
    static double add(double a, double b){return a+b;}
}
class TestOverloading2{
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(12.3,12.6));
    }}  */

/*
class Vehicle{
  //defining a method
  void run(){System.out.println("Vehicle is running");}
}
//Creating a child class
class Bike2 extends Vehicle{
  //defining the same method as in the parent class
  void run(){System.out.println("Bike is running safely");}

  public static void main(String args[]){
  Bike2 obj = new Bike2();//creating object
  obj.run();//calling method
  }
}
 */
//Example
class Shape{
    void draw(){System.out.println("drawing...");}
}
class Rectangle extends Shape{
    void draw(){System.out.println("drawing rectangle...");}
}
class Circle extends Shape{
    void draw(){System.out.println("drawing circle...");}
}
class Triangle extends Shape{
    void draw(){System.out.println("drawing triangle...");}
}
class TestPolymorphism2{
    public static void main(String args[]){
        Shape s;
        s=new Rectangle();
        s.draw();
        s=new Circle();
        s.draw();
        s=new Triangle();
        s.draw();
    }
}
