class audi
{
    String name = "audi";
    int price = 500000;
    String color = "Brown";
    String fuel = "disel";
}
class bike
{
    String name="honda";
    int price=200000;
    String color = "black";
    String fuel="petrol";
}
class mobile
{
    String name="apple";
    int price=50000;
    int RAM=6;
    int ROM=502;

}
public class classandobject1 {
    public static void main(String[] args) {
       audi obj1=new audi();
       bike obj2=new bike();
       mobile obj3=new mobile();
       System.out.println(obj1.name);
       System.out.println(obj1.price);
       System.out.println(obj1.color);
        System.out.println(obj1.fuel);
        System.out.println(obj2.name);
        System.out.println(obj2.price);
        System.out.println(obj1.fuel);
        System.out.println(obj3.name);
        System.out.println(obj3.price);
        System.out.println(obj3.RAM);
        System.out.println(obj3.ROM);
    }
}
