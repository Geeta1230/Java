//Collection concept
//import java.util.ArrayList;
//import java.util.Collection;
//
//public class collection1 {
//    public static void main(String[] args) {
//        Collection<Integer> number=new ArrayList<Integer>();
//        number.add(10);
//        number.add(20);
//        number.add(90);
//        number.remove(90);
//        //number.add("geeta");
//        System.out.println(number);
//    }
//}


// exmple
//import java.util.ArrayList;
//import java.util.Collection;
//public class collection1 {
//    public static void main(String[] args) {
//        Collection<String> names=new ArrayList<String>();
//        names.add("Geeta");
//        names.add("Geetu");
//        names.add("Geee");
//        names.remove("Geee");
//        //number.add("geeta");
//        System.out.println("Names:" +names);
//    }
//}


//arraylist
//import java.util.ArrayList;
//import  java.util.Collection;
//import java.util.List;
//public class collection1 {
//    public static void main(String[] args) {
//        List details=new ArrayList();
//        details.add("geeta");
//        details.add("almel");
//        details.add("dosa");
//        details.add("My home");
//        details.add("5");
//        details.add("23");
//        details.add("kashmir");
//        details.add("jamun");
//        System.out.println(details);
//        details.add(1,"Bijapur");
//        System.out.println(details);
//        System.out.println(details.get(2));
//        details.remove("dosa");
//        System.out.println(details);
//        details.remove(1);
//        details.add(3,"aku");
//        System.out.println(details);
//        details.remove("23");
//        System.out.println(details);
//
//
//    }
//}


//linkedlist
//import java.util.*;
//import java.util.LinkedList;
//import java.util.List;
//
//
//public class collection1 {
//    public static void main(String[] args) {
//        List<String> details = new LinkedList<String>();
//        details.add("Geetanjali");
//        details.add("Khandare");
//        details.add("RMSA");
//        details.add("R D Patil");
//        details.add("Secab");
//        details.add("VTU");
//        details.add("2vx22mc035");
//        System.out.println(details);
//        details.add(2,"cse");
//        System.out.println(details);
//        details.add(4,"almel");
//        System.out.println(details);
//        details.remove("RMSA");
//        System.out.println(details);
//        details.remove(5);
//        System.out.println(details);
//    }
//}


//vector
//import java.util.Vector;
//import java.util.List;
//import java.util.*;
//
//public class collection1 {
//    public static void main(String[] args) {
//        List<Integer> details = new Vector<Integer>();
//        details.add(10);
//        details.add(20);
//        details.add(30);
//        details.add(40);
//        details.add(50);
//        System.out.println(details);
//        details.remove(2);
//        System.out.println(details);
//        details.add(3,60);
//        System.out.println(details);
//        details.add(70);
//        System.out.println(details);
//        details.remove(1);
//        System.out.println(details);
//        details.remove(2);
//        System.out.println(details);
//        Collections.sort(details);
//        System.out.println(details);
//    }
//}

//stack

import java.util.Stack;
import java.util.List;

public class collection1 {
    public static void main(String[] args) {
        Stack<Integer> number = new Stack<Integer>();
        number.add(10);
        number.add(20);
        number.add(30);
        System.out.println(number);
        number.pop();
        number.push(40);
        number.add(0,60);
        System.out.println(number);

    }
}





