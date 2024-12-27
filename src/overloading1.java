class demo
{
    demo(int a,int b)
    {
        System.out.println(a+b);
    }
    demo(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}

public class overloading1 {
    public static void main(String[] args) {
        demo obj=new demo(4,9,8);
        System.out.println();
    }
}
