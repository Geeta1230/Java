import java.util.Scanner;
public class nestedif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter A grade value");
        int a=sc.nextInt();
        System.out.println("enter B grade value");
        int b=sc.nextInt();
        System.out.println("enter C grade value");
        int c=sc.nextInt();
        if(a>=90){
            if(c>=70)
            {
                System.out.println(a+"is 1 grade");
            }
            else
            {
                System.out.println(c+"is 3 grade");
            }
        }
        else
        {
            if(b>=80)
            {
                System.out.println(b+"is 2 grade");
            }
            else {
                System.out.println(c+"is 3 grade");
            }
        }
    }
}
