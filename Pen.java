package Pen;

public abstract class Pen {
    private boolean isOpen;
    private String brand;

    public Pen(String brand) {
        this.brand = brand;
        this.isOpen = false;
    }

    public void start() {
        this.isOpen = true;
    }

    public void close() {
        this.isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void write(String content);
}