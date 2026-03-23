package Pen;

public class RefillablePen extends Pen {
    private Refill refill;

    public RefillablePen(String brand, Refill refill) {
        super(brand);
        this.refill = refill;
    }

    public void setRefill(Refill refill) {
        this.refill = refill;
    }

    public Refill getRefill() {
        return refill;
    }

    @Override
    public void write(String content) {
        if (!isOpen()) {
            System.out.println("Pen is closed. Cannot write.");
            return;
        }

        if (refill == null) {
            System.out.println("No refill inserted.");
            return;
        }

        if (refill.consumeInk((double) content.length())) {
            System.out.println("Writing: " + content);
        } else {
            System.out.println("Cannot write: Not enough ink.");
        }
    }

    public void changeRefill(Refill newRefill) {
        this.refill = newRefill;
    }
}
