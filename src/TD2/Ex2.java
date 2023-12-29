package TD2;
public class Ex2 {
    public static void main(String[] args) {
        Points point1 = new Points();
        System.out.println("Point 1: " + point1);
        Points point2 = new Points(3.0, 4.0);
        System.out.println("Point 2: " + point2);
        point1.setX(1.0);
        point1.setY(2.0);
        System.out.println("Coordonnées du Point 1 après modification : (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Norme de Point 2: " + point2.norme());
    }
}
     class Points {
        private double x;
        private double y;
        public Points() {}
        public Points(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() {
            return x;
        }
        public void setX(double x) {
            this.x = x;
        }
        public double getY() {
            return y;
        }
        public void setY(double y) {
            this.y = y;
        }
        public double norme() {
            return Math.sqrt(x * x + y * y);
        }
        @Override
        public String toString() {
            return "Point{" + "x=" + x + ", y=" + y + '}';
        }
    }
