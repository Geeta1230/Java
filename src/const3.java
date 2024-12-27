class E1{

    E1(String name,String role,int salary,String gender){

        System.out.println("Name :"+name);
        System.out.println("role :"+role);
        System.out.println("salary :"+salary);
        System.out.println("gender :"+gender);
    }
    E1(String name,int age,String location,int experince){

        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("location:"+location);
        System.out.println("experince:"+experince);
    }

    public void h1(String name,String companyname,int id){

        System.out.println("Name:"+name);
        System.out.println("company name:"+companyname);
        System.out.println("id:"+id);
    }
    public void d1(String depname,String loction, int depid){
        System.out.println("depname:"+depname);
        System.out.println("loction:"+loction);
        System.out.println("dep id:"+depid);

    }
}


public class const3 {

    public static void main(String[] args) {

        E1 ob=new E1("Geeta","Software enginnering",50000,"Female");
        System.out.println();

        E1 ob1=new E1("Aku",21,"Almel",2);
        System.out.println();

        ob.h1("Geeta","capgemini",2532);
        System.out.println();

        ob.d1("computer science","davangere",2532);
    }
}