interface Animal
{
    public void eat();
    public void travel();
}
class mammal implements Animal
{
    public void eat()
    {
        System.out.println("mammal eats");
    }
    public void travel()
    {
        System.out.println("mammal travels");
    }
}
public class abstract2
{
    public static void main(String[] args) {
        mammal obj=new mammal();
        obj.eat();
        obj.travel();
    }
}
