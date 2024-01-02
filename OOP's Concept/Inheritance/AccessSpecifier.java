class Check{
    String name = "siddu";

    private void disp()
    {
        System.out.println(name);
    }
}
public class AccessSpecifier
{
    public static void main(String[] args) {
        Check c = new Check();
        System.out.println(c.name);
        c.disp();
    }
}