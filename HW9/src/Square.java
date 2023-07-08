public class Square {
    int side;

    public Square(int side) {
        this.side = side;
    }

    public String toString() {
        int perimeter = side * 4;
        float area = side * side;
        float diagonal = side * 1.414f;
        return (String.format("Периметр: %d, Площадь: %f, Диагональ: %f", perimeter, area, diagonal));
    }
}
