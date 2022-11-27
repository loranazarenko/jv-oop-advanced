package core.basesyntax;

public abstract class Figure implements Area, Draw {
    public Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Figure(Color color) {
        this.color = color;
    }
}
