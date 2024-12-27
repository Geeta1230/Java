//class A
//{
//   public void hai()
//   {
//       System.out.println("hai");
//   }
//}
//class B extends A
//{
//    public void hello()
//    {
//        System.out.println("hello");
//    }
//}
//class C extends B
//{
//    public void howru()
//    {
//        System.out.println("howru");
//    }
//}
//public class multiinheritnce {
//    public static void main(String[] args) {
//      C obj=new C();
//      obj.hai();
//      obj.hello();
//      obj.howru();
//    }
//}
class animal
{
    public void d1(String color,String typeoffood)
    {
        System.out.println("color :"+color);
        System.out.println("type of food :"+typeoffood);
    }
}
class dog1 extends animal
{
    public void d2(String name,String brwd,String color)
    {
        System.out.println("color :"+color);
        System.out.println("brwd :"+brwd);
        System.out.println("name :"+name);
    }
}
class babydog1 extends dog1
{
    public void d3(String name,String brwd,String color,String gender)
    {
        System.out.println("color :"+color);
        System.out.println("brwd :"+brwd);
        System.out.println("name :"+name);
        System.out.println("gender :"+gender);
    }
}
public class multiinheritnce {
    public static void main(String[] args) {
        babydog1 obj = new babydog1();
        obj.d1("white", "nonveg");
        obj.d2("tommy", "jarmny", "black");
        obj.d3("tommy", "jarmny", "black", "female");
    }
}
