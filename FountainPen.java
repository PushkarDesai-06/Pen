package Pen;

public class FountainPen extends Pen {
    private Ink ink;
    private Nib nib;
    private double currentLevel;
    private double maxCapacity;

    public FountainPen(String brand, Ink ink, Nib nib, double maxCapacity) {
        super(brand);
        this.ink = ink;
        this.nib = nib;
        this.maxCapacity = maxCapacity;
        this.currentLevel = 0; // Starts empty or full? Diagram doesn't say. Let's start empty.
    }

    public void refillInk(double amount) {
        if (currentLevel + amount > maxCapacity) {
            System.out.println("Cannot refill: Exceeds max capacity.");
            return;
        }
        this.currentLevel += amount;
        System.out.println("Refilled. Current level: " + currentLevel);
    }

    public Ink getInk() {
        return ink;
    }

    public Nib getNib() {
        return nib;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public void setNib(Nib nib) {
        this.nib = nib;
    }

    @Override
    public void write(String content) {
        if (!isOpen()) {
            System.out.println("Pen is closed. Cannot write.");
            return;
        }

        if (ink == null) {
            System.out.println("No ink filled.");
            return;
        }

        double requiredInk = (double) content.length(); // Assume 1 unit per char
        if (currentLevel >= requiredInk) {
            currentLevel -= requiredInk;
            System.out.println("Writing with Fountain Pen: " + content);
        } else {
            System.out.println("Not enough ink to write.");
        }
    }
}
