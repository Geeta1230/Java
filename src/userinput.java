import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter a val:");
//        int a=sc.nextInt();
//        System.out.println("enter b val:");
//        int b=sc.nextInt();
//        int c=a+b;
//        System.out.println(c);
        System.out.println("enter a first name:");
        String firstname=sc.nextLine();
        System.out.println("enter a last name:");
        String lastname=sc.nextLine();
        System.out.println("enter a college name:");
        String collegename=sc.nextLine();
        System.out.println("enter a branch name:");
        String branchname=sc.nextLine();
        System.out.println("enter a usn:");
        String usn=sc.nextLine();
        System.out.println("enter a mobile no:");
        String mobileno =sc.nextLine();
        System.out.println("enter a age:");
        int age =sc.nextInt();
        System.out.println(firstname+" "+ lastname+" "+ collegename+" "+ branchname+" "+ mobileno+" "+ age+" "+ usn);



    }
}
