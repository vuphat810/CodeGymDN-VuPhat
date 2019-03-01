package point2D;

public class Point3D extends Point2D {
    float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    @Override
    public String toString() {
        return "x = " + x + " ; y = " + y + " ; z = " + z;
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        Point3D point3D1 = new Point3D(1,2,3);
        System.out.println(point3D1);
    }
}
