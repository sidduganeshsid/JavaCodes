public class staticConcept {
    static int a=200;
    static int b;

    static{
         System.out.println("static variables are executed first, value of 'a' : "+a);
         System.out.println("Then static block");
       
        a = 10;
        b = 20;
        System.out.println("value of 'a' initialized using static block is : "+a);
    }

    static void disp(){
        System.out.println("static method");
        System.out.println("static var a : "+a);
        System.out.println("static var b : "+b);
    }
    
    int x;
    int y;

    {
        System.out.println("instance block or JAVA block");
        x=10;
        y=20;
    }
    public staticConcept()
    {
        System.out.println("constructor of staticConcept");
    }

    void disp2()
    {
        System.out.println("instance method");
    }
    public static void main(String[] args) {
        
    }
}

class Test23 {
    static int a;
    static int b;

    static{
        System.out.println("static block");
        a = 10;
        b = 20;
    }

    static void disp(){
        System.out.println("static method");
        System.out.println("static var a : "+a);
        System.out.println("static var b : "+b);
    }
    
    int x;
    int y;

    {
        System.out.println("instance block or JAVA block");
        x=10;
        y=20;
    }
    public Test23()
    {
        System.out.println("constructor of Test23");
    }

    void disp2()
    {
        System.out.println("instance method");
    }


}
