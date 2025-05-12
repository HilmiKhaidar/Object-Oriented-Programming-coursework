package P4.Kelompok;

public class Main {
    public static void main(String[] args) {
        // Contoh pembuatan objek dan relasi
        Point p1 = new Point(1.0, 1.0);
        Point p2 = new Point(2.0, 3.0);
        Rectangle rect = new Rectangle(p1, p2);
        Polygon poly = new Polygon(new Point[]{p1, p2});

        DrawingControl dc = new DrawingControl();
        dc.setShape(rect);
        dc.draw();

        Window win = new Window("Main Window");
        win.setDrawingControl(dc);

        System.out.println("Aplikasi berjalan dengan satu jendela: " + win.getTitle());
    }
}

// Abstract Class
abstract class Shape {
    private String color;
    private Point origin;

    public Shape() {}

    public Shape(String color, Point origin) {
        this.color = color;
        this.origin = origin;
    }

    public abstract void draw();

    public String getColor() {
        return color;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }
}

// Class Rectangle
class Rectangle extends Shape {
    private Point p1, p2;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public void draw() {
        System.out.println("Menggambar persegi panjang dari " + p1 + " ke " + p2);
    }
}

// Class Polygon
class Polygon extends Shape {
    private Point[] points;

    public Polygon(Point[] points) {
        this.points = points;
    }

    @Override
    public void draw() {
        System.out.println("Menggambar poligon dengan " + points.length + " titik.");
    }
}

// Class Point
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

// Class DrawingControl (boundary class)
class DrawingControl {
    private Shape shape;

    public void draw() {
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Tidak ada shape untuk digambar.");
        }
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }
}

// Class Window (mengandung DrawingControl)
class Window {
    private String title;
    private DrawingControl drawingControl;

    public Window(String title) {
        this.title = title;
    }

    public void setDrawingControl(DrawingControl dc) {
        this.drawingControl = dc;
    }

    public DrawingControl getDrawingControl() {
        return drawingControl;
    }

    public String getTitle() {
        return title;
    }
}

// Class Event
class Event {
    private String name;

    public Event(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Frame dan DataController hanya direferensikan pada diagram, tidak ada behavior ditampilkan
class Frame {}
class DataController {}

