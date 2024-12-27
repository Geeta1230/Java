//interface abc
//{
//    int a=6;
//    int b=3;
//    public void add();
//    public void sub();
//}
//class def implements abc
//{
//    public void add()
//    {
//        System.out.println("add");
//    }
//    public void sub()
//    {
//        System.out.println("sub");
//    }
//}
//public class interface1
//{
//    public static void main(String[] args) {
//        def obj=new def();
//        obj.add();
//        obj.sub();
//    }
//}
//
// mulptiple interface
//interface Swimmer{
//    void swim();
//}
//interface Flyer{
//    void fly();
//}
//class bird implements Swimmer,Flyer{
//    public void swim(){
//        System.out.println("bird swimming");
//    }
//    public void fly(){
//        System.out.println("bird flying");
//    }
//}
//public class interface1
//{
//    public static void main(String[] args) {
//        bird obj=new bird();
//        obj.swim();
//        obj.fly();
//    }
//}

//multilevel inter
//interface a{
//    public void add();
//    public void sub();
//}
//interface b extends a{
//    public void multiply();
//    public void div();
//}
//class c implements b{
//    public void add(){
//        System.out.println("ADDITION");
//    }
//    public void sub(){
//        System.out.println("SUBSTRACTION");
//    }
//    public void multiply(){
//        System.out.println("MULTYplication");
//    }
//    public void div(){
//        System.out.println("DIVISION");
//    }
//}
//public class interface1 {
//    public static void main(String [] args){
//        c obj = new c();
//        obj.add();
//        obj.div();
//        obj.sub();
//        obj.multiply();
//    }
//}

//herarchical interface

interface a {
    public void add();
    public void sub();
}


class b implements a {
    public void add() {
        System.out.println("ADDITION");
    }

    public void sub() {

    }
}


class c implements a {
    public void add() {

    }

    public void sub() {
        System.out.println("SUBSTRACTION");
    }
}

public class interface1 {
    public static void main(String[] args) {

        b objB = new b();
        objB.add();
        objB.sub();

        c objC = new c();
        objC.add();
        objC.sub();
    }
}
