public class Triangle {
    int side1;
    int side2;
    int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void perimeter() {
        System.out.println(side1 + side2 + side3);
    }

    public void area() {
        int s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println(String.format("%.2f",area));
    }

}
