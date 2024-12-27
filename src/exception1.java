//airthmatic exception
//public class exception1 {
//    public static void main(String[] args) {
//        int a=4;
//        int b=0;
//        try {
//            System.out.println(a/b);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
//    }
//}

//array exception
//public class exception1 {
//    public static void main(String[] args) {
//        int[] array=new int[4];
//        int a=8;
//        int b=2;
//        try {
//            System.out.println(a/b);
//            for(int i=0; i<=4; i++)
//            {
//                System.out.println(array[i+1]);
//            }
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("divide by zero is not acceptable");
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("array size is exceding" +e);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
//    }
//}

//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class exception1 {
//    public static void main(String[] args) throws IOException {
//        File file = new File("E://file.txt");
//        FileReader fr = null;
//
//        fr = new FileReader(file);
//        System.out.println("File opened successfully.");
//
//        if (fr != null) {
//            fr.close();
//        }
//    }
//}