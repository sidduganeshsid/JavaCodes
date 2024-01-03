public class FacePattern {

    public static void main(String[] args) {
        drawFace();
    }

    static void drawFace() {
        drawHead();
        drawEyes();
        drawNose();
        drawMouth();
    }

    static void drawHead() {
        System.out.println("   O   ");
        System.out.println("  /|\\  ");
        System.out.println(" / | \\ ");
        System.out.println("/  |  \\");
    }

    static void drawEyes() {
        System.out.println(" | O O | ");
    }

    static void drawNose() {
        System.out.println("   / \\   ");
    }

    static void drawMouth() {
        System.out.println("  \\___/  ");
    }
}
