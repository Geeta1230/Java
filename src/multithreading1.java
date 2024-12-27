// class use

//class degree extends Thread
//{
//    public void show()
//    {
//        for(int i=0;i<=2; i++) {
//            System.out.println("VTU");
//            try {
//            Thread.sleep(1000);
//            }
//            catch (Exception e) {
//            }
//            }
//        }
//    }
//class inter extends Thread
//{
//    public void show()
//    {
//        for(int i=0;i<=2; i++) {
//            System.out.println("R D Patil");
//        }
//    }
//}
//class highschool extends Thread
//{
//    public void show()
//    {
//        for(int i=0;i<=2; i++) {
//            System.out.println("RMSA");
//        }
//    }
//}
//
//public class multithreading1 {
//    public static void main(String[] args) {
//        highschool obj1=new highschool();
//        inter obj2=new inter();
//        degree obj3=new degree();
//        obj1.show();
//        obj2.show();
//        obj3.show();
//    }
//}


 // interface use
 class degree implements Runnable
{
    public void run()
    {
        for(int i=0;i<=2; i++) {
            System.out.println("VTU");
            try {
            Thread.sleep(1000);
            }
            catch (Exception e) {
            }
            }
        }
    }
class inter implements Runnable
{
    public void run()
    {
        for(int i=0;i<=2; i++) {
            System.out.println("R D Patil");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
    }
}
class highschool implements Runnable
{
    public void run()
    {
        for(int i=0;i<=2; i++) {
            System.out.println("RMSA");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
    }
}

public class multithreading1 {
    public static void main(String[] args) {
        Runnable obj1=new degree();
        Runnable obj2=new inter();
        Runnable obj3=new highschool();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        Thread t3=new Thread(obj3);

        t1.run();
        t2.run();
        t3.run();
    }
}