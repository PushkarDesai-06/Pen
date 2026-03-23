package Pen;

public class Refill {
    private Ink ink;
    private Nib nib;
    private double currentLevel;
    private double maxCapacity;

    public Refill(Ink ink, Nib nib, double currentLevel, double maxCapacity) {
        this.ink = ink;
        this.nib = nib;
        this.currentLevel = currentLevel;
        this.maxCapacity = maxCapacity;
    }

    public boolean consumeInk(double amount) {
        if (amount > currentLevel) {
            return false;
        }
        this.currentLevel -= amount;
        return true;
    }

    public double getInkLevel() {
        return this.currentLevel;
    }
}
