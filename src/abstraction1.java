//abstract class Shape
//{
//    abstract void draw();
//}
//class Circle extends Shape
//{
//    void draw()
//    {
//        System.out.println("drawing a circle");
//    }
//}
//public class abstraction1
//{
//    public static void main(String[] args) {
//        {
//            Circle circle=new Circle();
//            circle.draw();
//        }
//    }
//}

////Abstract sub,add,mul,div
//abstract class Operation {
//    abstract void add(int a, int b);
//    abstract void multiply(int a, int b);
//    abstract void sub(int a, int b);
//    abstract void div(int a, int b);
//}
//
//class Operation1 extends Operation {
//
//
//    void add(int a, int b) {
//        System.out.println("Addition: " + (a + b));
//    }
//
//
//    void multiply(int a, int b) {
//        System.out.println("Multiplication: " + (a * b));
//    }
//
//    void sub(int a, int b) {
//        System.out.println("Subtraction: " + (a - b));
//    }
//
//
//    void div(int a, int b) {
//        System.out.println("Division: "+(a/b));
//    }
//
//}
//
//public class abstraction1 {
//    public static void main(String[] args) {
//        Operation1 obj = new Operation1();
//        obj.add(5, 10);
//        obj.div(10, 5);
//        obj.multiply(30, 25);
//        obj.sub(30, 57);
//    }
//}


//abstract work details
abstract class bce
{
    abstract void officeworkdetails(int id,int loginhours);
}
class efg extends bce
{
 void officeworkdetails(int id,int loginhours)
 {
     System.out.println("Id: "+id);
     System.out.println("Log in hours: "+loginhours);
 }
 void personalworkdetails(int readinghours,int sleepinghours)
 {
     System.out.println("Reading hours: "+readinghours);
     System.out.println("Sleepinging hours: "+sleepinghours);
 }
 efg(String name,int age){
     System.out.println("name :"+name);
     System.out.println("age :"+age);
 }
}
public class abstraction1{
    public static void main(String[] args) {
        efg obj=new efg("geeta ",23);
        obj.officeworkdetails(52,3);
        obj.personalworkdetails(6,8);
    }
}