package models;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    private List<Point> points = new ArrayList<>();
    public void addPoint(Point point) {
        points.add(point);
    }
    public double calculatePerimeter() {
        double p = 0.0;
        int size = points.size();

        if (size < 2) {
            return 0.0;
        }
        for (int i = 0; i < size; i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % size);

            p += current.distance(next);
        }

        return p;
    }
    public double getAverageSide() {
        int size = points.size();
        if (size < 2) {
            return 0.0;
        }

        return calculatePerimeter() / size;
    }
    public double getLongestSide() {
        double a = 0.0;
        int size = points.size();

        if (size < 2) {
            return 0.0;
        }

        for (int i = 0; i < size; i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % size);

            double distance = current.distance(next);
            if (distance > a) {
                a = distance;
            }
        }

        return a;
    }
}