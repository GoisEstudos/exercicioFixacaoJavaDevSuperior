package entities;

public class Rectangle {

    private Double width;
    private Double height;

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double area() {
        return width * height;
    }

    public Double perimeter() {
        return 2 * (width + height);
    }

    public Double Diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }


    @Override
    public String toString() {
        return String.format("AREA = %.2f \nPERIMETER = %.2f \nDIAGONAL = %.2f",
                area(), perimeter(), Diagonal());
    }
}
