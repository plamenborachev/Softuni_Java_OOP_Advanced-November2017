package p01ShapesDrawing;

public class Circle implements Drawable {
    private int radius;
    private int centerX;
    private int centerY;

    public Circle(int radius, int centerX, int centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    @Override
    public void draw() {
        double r_in = this.radius -0.4;
        double r_out = this.radius + 0.4;
        for (double y = this.radius; y >= -this.radius; --y) {
            for (double x = -this.radius; x < r_out; x += 0.5) {
                double value = x * x + y * y;
                if (value >= r_in * r_in && value <= r_out * r_out) {
                    System.out.print("*");
                }
                    else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
