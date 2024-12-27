//class A
//{
//    public void hai()
//  {
//      System.out.println("hai");
//  }
//}
//class B extends A
//{
//    public void hello(){
//        System.out.println("hello");
//    }
//
//}
//public class singleinheritance {
//    public static void main(String[] args) {
//        B obj=new B();
//        obj.hai();
//        obj.hello();
//    }
//}
class dog
{
    public void details1 (String name,String color,String brwd)
    {
        System.out.println("Name :"+name);
        System.out.println("color :"+color);
        System.out.println("brwd :"+brwd);

    }
}
class babydog extends dog
{
    public void details2(String name,String color,String brwd,String gender)
    {
        System.out.println("Name :"+name);
        System.out.println("color :"+color);
        System.out.println("brwd :"+brwd);
        System.out.println("gender :"+gender);
    }
}
public class singleinheritance {
    public static void main(String[] args) {
       babydog obj=new babydog();
       obj.details1("tommy","white","jarmen");
        obj.details2("tommy","white","jarmen","male");
    }
}