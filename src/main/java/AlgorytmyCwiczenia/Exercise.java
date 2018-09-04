package AlgorytmyCwiczenia;

public class Exercise {

    public boolean arePointsDifferent(Point[] points) throws Exception {

        if (points.length > 1000000) {
            throw new SizeException("Zbyt duża wartość tablicy!");
        }

        for (int i = 0; i < points.length; i++) {
            for (int j = i; j < points.length; j++) {
                if (j != i && points[i].equals(points[j])) {
                    return false;
                }
            }
        }
        return true;
    }

}
