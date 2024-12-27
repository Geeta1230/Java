class food
{
    public void d1(String name,int rating)
    {
        System.out.println("name :"+name);
        System.out.println("rating :"+rating);
    }
}
class food1 extends food
{
    public void d2(String name,int price,int quantity)
    {
        System.out.println("name :"+name);
        System.out.println("price :"+price);
        System.out.println("quantity :"+quantity);
    }
}
class food2 extends food
{
    public void d3(String name,int price,int quantity)
    {
        System.out.println("name :"+name);
        System.out.println("price :"+price);
        System.out.println("quantity :"+quantity);
    }
}

public class herarchicalinheritance1 {
    public static void main(String[] args) {
        food1 obj=new food1();
        food2 obj1=new food2();
        obj.d1("chiken curry",9);
        obj.d2("egg curry",250,500);
        obj1.d1("panner curry",8);
        obj1.d3("kaju curry",300,250);
    }
}
