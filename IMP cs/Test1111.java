class Demo
{
Demo(){
System.out.println("constructor called");
}
}


public class Test1111 {

Demo d = new Demo();
Test1111(){
System.out.println("Test class Constructor");
}
public static void main(String[] args) {
Test1111 t =new Test1111();
}
}