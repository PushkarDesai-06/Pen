package Pen;

public class Ink {
    private Color color;
    private InkType type;

    public Ink(Color color, InkType type) {
        this.color = color;
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public InkType getType() {
        return type;
    }

    public void setType(InkType type) {
        this.type = type;
    }

}
