class Fan{
    int cost;
    String brand;
    int noOfWings;
}

public class TestOpps {
    public static void main(String[] args) {
        Fan[] f = new Fan[3];
        f[0] = new Fan();
        f[1] = new Fan();
        f[2] = new Fan();
        // f[3] = new Fan(); //bufferOverRun occurs but not shown

        f[0].brand = "bajaj";
        f[0].cost = 2500;
        f[0].noOfWings = 3; 
    }
}
