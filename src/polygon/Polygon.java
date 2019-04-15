package polygon;

import java.util.Arrays;
import java.util.List;

public class Polygon {

    private static Integer polygonCount = 0;
    private Integer id;
    private List<Integer> lengths;

     // Polygon(list)
    public Polygon(List<Integer> lengths) {
        this.lengths = lengths;
        polygonCount++;
        this.id = polygonCount;
    }
    // Integer[] arr; Polygon(arr); // Polygon(1,2,3,4);
    public Polygon(Integer... lengths) {
        this(Arrays.asList(lengths));
    }

    public List<Integer> getLengths() {
        return lengths;
    }

    public void setLengths(List<Integer> lengths) {
        this.lengths = lengths;
    }

    public Integer getPerimeter() {
        Integer perimeter = 0;
        for (Integer length : lengths) {
            perimeter += length;
        }
        return perimeter;
    }

    public static Integer getPolygonCount() {
        return polygonCount;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(" ").append(this.getId()).append("\n");
        sb.append("[");
        for (Integer i = 0; i < lengths.size(); i++) {
            sb.append(lengths.get(i));
            if (i < lengths.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]").append("\n");
        sb.append("Perimeter: ").append(this.getPerimeter().toString()).append("\n");

        return sb.toString();
    }
}
