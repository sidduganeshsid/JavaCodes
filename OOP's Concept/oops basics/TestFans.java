package oops;

class Fan
{
    float cost;
    String brand;
    int noOfWings;
}


public class TestFans {
    public static void main(String[] args) {
        Fan[] f = new Fan[3];
        f[0] = new Fan();
        f[1] = new Fan();
        f[2] = new Fan();
        f[3] = new Fan();//bufferOverRun problem
    }
}
