// package OOP's Concept.Inheritance;
class GrandFather //extends Object class
{
    //object class properties and methods are present
    String surName = "Musa";
    private String name = "Narayana";
    String[] Home = {"kazipet"};
    private static int salary = 40000;//to prevent encapsulation doesn't participate in inheritance


    //getter and setters
    public String[] getHome() {
        return Home;
    }
    public void setHome(String[] home) {
        Home = home;
    }
   
    //getter (read-only)
    public String getSurName() {
        return surName;
    }

}

class Father extends GrandFather
{
    //constructors will not participate in inheritance
    private String name = "Srinivas";
}
class Me extends Father
{
    private String name = "SidduGanesh";
}


public class Family {
    public static void main(String[] args) {
        Me sid = new Me();
        int i=0;
        while (i<sid.Home.length) {
            System.out.println(sid.Home[i]);
            i++;
        }
        System.out.println(sid.getSurName());
        // sid.getSalary()
        // System.out.println(sid.getSalary());
    }
}
