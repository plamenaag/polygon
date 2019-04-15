package polygon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PolygonUtility {

    private static Scanner scanner = new Scanner(System.in);

    public static List<Polygon> createPolygons() {
        Integer count = 0;
        do {
            System.out.print("Input polygon count:");
            count = scanner.nextInt();
            if (count <= 1) {
                System.out.println("Value is invalid! Must be > 1!");
            }
        } while (count <= 1);

        List<Polygon> polygons = new ArrayList<>();
        for (Integer i = 0; i < count; i++) {
            polygons.add(createPolygon());
        }

        return polygons;
    }

    public static Polygon createPolygon() {
        Integer sides = 0;
        do {
            System.out.print("Input polygon sides count:");
            sides = scanner.nextInt();
            if (sides <= 1) {
                System.out.println("Value is invalid! Must be > 1!");
            }
        } while (sides <= 1);

        Integer[] lengths = new Integer[sides];

        for (Integer i = 0; i < sides; i++) {
            do {
                System.out.printf("Input polygon side %d length:", i + 1);
                lengths[i] = scanner.nextInt();
                if (lengths[i] <= 1) {
                    System.out.println("Value is invalid! Must be > 1!");
                }
            } while (lengths[i] <= 1);
        }
        Polygon newPolygon = new Polygon(lengths);
        System.out.println(newPolygon.toString());
        return newPolygon;
    }

    public static Polygon getPolygonWithBiggestPerimiter(List<Polygon> polygons) {
        Polygon maxPerimiterPolygon = null;
        for (Polygon polygon : polygons) {
            if (maxPerimiterPolygon == null || maxPerimiterPolygon.getPerimeter() < polygon.getPerimeter()) {
                maxPerimiterPolygon = polygon;
            }
        }
        return maxPerimiterPolygon;
    }

}
