public class WorldMap {
    public static void main(String[] args) {
        int width = StdIn.readInt();
        int height = StdIn.readInt();
        StdDraw.setCanvasSize(800, 600);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        while (!StdIn.isEmpty()) {
            String region = StdIn.readString();
            int points = StdIn.readInt();
            double[] x = new double[points];
            double[] y = new double[points];

            for (int i = 0; i < points; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }

            StdDraw.polygon(x, y);
        }
    }
}
