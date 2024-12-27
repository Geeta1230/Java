class company
{
    public void empdetails()
    {
        String Ename= "Anju";
        int Eid =276543;
        int Esalary = 30000;
        String Erole= "software";
        System.out.println("Ename= "+Ename+ "Eid= "+Eid+"Esalary= "+Esalary+"Erole= "+Erole);
    }
    public void deptdetails()
    {
        String Dname= "Computer Science";
        int Did =36598;
        int noofemp = 100;
        String depphoneno ="9999999999";
        System.out.println("Dname= "+Dname+ "Did= "+Did+ "no of emp= "+noofemp+ "depphoneno= "+depphoneno);
    }
    public class classandobj2 {
        public static void main(String[] args) {
            company obj1 = new company();
            obj1.empdetails();
            obj1.deptdetails();


        }
    }
}
