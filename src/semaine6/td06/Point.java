class Point {
    private int x,y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static boolean similar(Point p1, Point p2) {
        return p1.x == p2.x && p1.y == p2.y;
    }

    public similarTo (Point p) {
        return similar(this, p);
    }
}