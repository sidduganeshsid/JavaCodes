// package OOP's Concept.Inheritance;
class GrandFather //extends Object class
{
    //object class properties and methods are present
    String surName = "Musa";
    private String name = "Narayana";
    String[] houses = {"kazipet"};
    private static int salary = 40000;//to prevent encapsulation doesn't participate in inheritance
    private float money = 2_30_000.50f;


    //getter for home
    public String[] getHouses() {
        return houses;
    }

    //getter and setter for money
    public float getMoney() {
        return money;
    }
    public void setMoney(float money) {
        this.money = money;
    }
    public void setHome(String[] houses) {
        this.houses = houses;
    }
   
    //getter (read-only)
    public String getSurName() {
        return surName;
    }

    //

}

class Father extends GrandFather
{
    //constructors will not participate in inheritance
    private String name = "Srinivas";
}

class Son extends Father
{
    private String name = "SidduGanesh";
}

class Daughter extends Father{
    String surname = "uzumaki";
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
