package polygon;

public class Main {

    public static void main(String[] args) {
        Polygon polygon = PolygonUtility.getPolygonWithBiggestPerimiter(PolygonUtility.createPolygons());
        System.out.println("The polygon with the biggest perimeter is:");
        System.out.println(polygon.toString());
    }

}
