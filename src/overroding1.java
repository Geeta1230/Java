class parent
{
    public void mobile()
    {
        System.out.println("samsung");
    }
}
class child extends parent
{
    public void mobile()
    {
        System.out.println("apple");
    }
}
public class overroding1 {
    public static void main(String[] args) {
        child obj=new child();
        obj.mobile();
    }
}


//constrctra overriding

//class parent
//{
//    parent()
//    {
//        System.out.println("samsung");
//    }
//}
//}
//class child extends parent
//{
//    parent()
//    {
//        System.out.println("apple");
//    }
//}
//}
//public class overroding1 {
//    public static void main(String[] args) {
//     child obj=new child();
//     obj.mobile();
//    }
//}