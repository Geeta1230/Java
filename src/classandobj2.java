class details
{
    public void s1()
    {
        String name= "Geeta";
        int age =22;
        String branch = "MCA";
        System.out.println("name= "+name+ "age= "+age+"branch= "+branch);
    }
    public void s2()
    {
        String name= "aku";
        int age =20;
        String branch = "Mba";
        int rollno =26;
        System.out.println("name= "+name+ "age= "+age+ "branch= "+branch+ "rollno= "+rollno);
    }
    public void t1()
    {
        String name= "Ramesh";
        int age =35;
        System.out.println("name= "+name+ "age= "+age);
    }
//    public void add(int a,int b)
//    {
//        System.out.println("add="+(a+b));
//    }
//    public void div(int a,int b)
//    {
//        System.out.println("div="+(a/b));
//    }
//    public int sub(int a, int b)
//    {
//        return a-b;
//    }
//    public int mul(int a, int b)
//    {
//        return a*b;
//    }
}
public class classandobj2 {
    public static void main(String[] args) {
//        String a="geeta";
//        int b=2;
//        int c=7;
//        System.out.println(a.length());
//        System.out.println(Math.min(b,c));
//        demo obj1=new demo();
//        obj1.add(4, 1);
//        obj1.div(4,1);
//        int result=obj1.sub(4, 1);
//        System.out.println("sub="+result);
//        int results=obj1.mul(4,1);
//        System.out.println("mul="+results);
        details obj1=new details();
        obj1.s1();
        obj1.s2();
        obj1.t1();

    }
}
