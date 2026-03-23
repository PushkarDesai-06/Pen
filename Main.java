package Pen;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing RefillablePen ---");
        Ink blackInk = new Ink(Color.BLACK, InkType.BALLPOINT);
        Nib ballNib = new Nib(0.5);
        Refill initialRefill = new Refill(blackInk, ballNib, 50.0, 100.0);

        RefillablePen ballpointPen = new RefillablePen("Parker", initialRefill);

        ballpointPen.write("This should fail because pen is closed.");
        ballpointPen.start();
        ballpointPen.write("Hello, World!");
        ballpointPen.write("Testing 123");
        System.out.println("Current Refill Level: " + ballpointPen.getRefill().getInkLevel());

        ballpointPen.close(); // Close the pen
        ballpointPen.write("Should fail again.");

        // Changing refill
        System.out.println("\n--- Changing Refill ---");
        Ink redInk = new Ink(Color.RED, InkType.GEL);
        Nib gelNib = new Nib(0.7);
        Refill newRefill = new Refill(redInk, gelNib, 100.0, 100.0);
        ballpointPen.changeRefill(newRefill);
        ballpointPen.start();
        ballpointPen.write("Writing with new red ink!");
        System.out.println("New Refill Level: " + ballpointPen.getRefill().getInkLevel());

        // Test FountainPen
        System.out.println("\n--- Testing FountainPen ---");
        Ink blueInk = new Ink(Color.BLUE, InkType.FOUNTAIN);
        Nib fountainNib = new Nib(1.0);
        FountainPen fountainPen = new FountainPen("Lamy", blueInk, fountainNib, 50.0);

        fountainPen.start();
        // Starts empty based on constructor logic
        fountainPen.write("Hello");

        System.out.println("Refilling ink...");
        fountainPen.refillInk(30.0);
        fountainPen.write("Hello Fountain Pen!"); // Length 19.
        System.out.println("Fountain Pen Level: " + fountainPen.getCurrentLevel());

        fountainPen.close();
    }
}
