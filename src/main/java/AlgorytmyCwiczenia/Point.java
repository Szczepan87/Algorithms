package AlgorytmyCwiczenia;

import java.util.Objects;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) throws Exception {

        if (x > 1000000000 || y > 1000000000 || x < -1000000000 || y < -1000000000){
            throw new SizeException("Niewłściwa artość punktu!");
        }
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
