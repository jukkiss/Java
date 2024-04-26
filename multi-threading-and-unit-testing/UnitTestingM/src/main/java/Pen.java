public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) {
            this.color = color;
        }
        @Override
        public String toString() {
            return this.color;
        }
    }

    private Color color;
    private boolean capOn;

    public Pen() {
        this.color = Color.RED; // Default color is red if not specified
        this.capOn = true;      // Pen starts with the cap on
    }

    public Pen(Color color) {
        this.color = color;
        this.capOn = true;
    }

    public String draw() {
        if (this.capOn) {
            return "";
        } else {
            return "Drawing " + this.color.toString();
        }
    }

    public void changeColor(Color newColor) {
        if (!this.capOn) {  // Color can only be changed when the cap is off
            this.color = newColor;
        }
    }

    public void capOn() {
        this.capOn = true;
    }

    public void capOff() {
        this.capOn = false;
    }
}
