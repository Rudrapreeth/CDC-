public class Interface {
}
/*interface Printable{
    void print();
}
interface Showable{
    void show();
}
class A7 implements Printable,Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}*/
interface Drawable{
    void draw();
    default void msg(){System.out.println("default method");}
}
class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}
class TestInterfaceDefault{
    public static void main(String args[]){
        Drawable d=new Rectangle();
        d.draw();
        d.msg();
    }}