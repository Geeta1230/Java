//lambda interface using return function
@FunctionalInterface
interface Y
{
   int mul(int a,int b,int c);
}
public class exception3 {
    public static void main(String[] args) {
        Y obj =(a,b,c) -> (a*b*c);
        int r=obj.mul(6,2,7);
        System.out.println(r);
    }
}

//examples
//interface g
//{
//    void mydetails(String name,String loction);
//}
//public class exception3
//{
//    public static void main(String[] args) {
//        g obj=(name,loction) -> System.out.println(name + loction);
//        obj.mydetails("ggg","almel");
//    }
//}