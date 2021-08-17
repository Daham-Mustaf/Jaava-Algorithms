package mathmatics;

public class Distance {
    public Distance() { }

    /*
     * The Chebyshev distance between two vectors or points x and y, with standard coordinates Xi and Yi respectively
     */
    public static final long chebyshevDistance(long[] point1, long[] point2) {
        long x1 = point1[0];
        long y1 = point1[1];
        long x2 = point2[0];
        long y2 = point2[1];
        return Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2));
    }

     /*
     *squared distance between two vectors x = [ x1 x2 ] and y = [ y1 y2 ]
     * is the sum of squared. differences in their coordinates
     */
    public static final double squaredDistance(double x1, double y1, double x2, double y2) {
        double x = x1 - x2;
        double y = y1 - y2;
        double sqr = (x * x) + (y * y);
        return sqr;
    }

    /*
    *Euclidean space is the length of a line segment between the two points.
    * It can be calculated from the Cartesian coordinates of the points using the Pythagorean theorem,
    * therefore occasionally being called the Pythagorean distance.
    */
    public static final double euclideanDistance(double x1, double y1, double x2, double y2) {
        double x = Math.pow((x1 - x2), 2);
        double y = Math.pow((y1 - y2), 2);
        double sqrt = Math.sqrt(x + y);
        return sqrt;
    }
    /*The Manhattan distance between two vectors, A and B, is calculated as:
    * Σ|Ai – Bi|
    */

    public static final  double manhattanDistance(double x1, double y1, double x2, double y2){
        double manDistance = Math.abs(x1-x2) + Math.abs(y1-y2);
        return manDistance;
    }
}


