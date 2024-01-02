public class Test {
    public static void main(String[] args) {
    try{
    int i=Integer.parseInt("10");
    System.out.println(i);
    }
    catch(NullPointerException e){
    // System.out.println(i);//CE: 'i' not declared
    }
    }
    
    
}
