//int array
//public class array1
//{
//    public static void main(String[] args) {
//        int[] a={1,2,3,4,5};
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//        System.out.println(a[4]);
//    }
//}

//char array
//public class array1
//{
//    public static void main(String[] args) {
//        char[] my_array={'h','a','i'};
//        for(int i=0;i<=my_array.length-1;i++)
//        {
//            System.out.println(my_array[i]);
//        }
//    }
//}

//array sum and average

public class array1{
    public static void main(String[] args) {
        double[] myList= {1.9,2.9,3.4,3.5};
        for (int i=0;i<myList.length;i++){
            System.out.println(myList[i]+" ");
        }
        double sum = 0;
        for (int i=0;i<myList.length;i++){
            sum +=myList[i];
        }

        System.out.println("sum is:" +sum);
        double avg=0;
        avg=sum/myList.length;
        System.out.println("avg is: "+avg);
    }
}


//array maxvalue
//public class array1 {
//    public static void main(String[] args) {
//        int[] a= {9,7,1,2,10};
//        int max = a[0];
//        for (int i = 0;i < a.length; i++)
//        {
//            if (a[i]>max)
//            {
//                max=a[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//arrayminvalue
//public class array1 {
//    public static void main(String[] args) {
//        int[] a= {9,7,1,2,10};
//        int min = a[0];
//        for (int i = 0;i < a.length; i++)
//        {
//            if (a[i]<min)
//            {
//                min=a[i];
//            }
//        }
//        System.out.println(min);
//    }
//}
