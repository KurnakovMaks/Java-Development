package Figures;

public class Rectangle {

    public Rectangle()
    { a = b = x = y = 1; }

    public Rectangle(int a, int b, int x, int y)
    { this.a = a; this.b = b; this.x = x; this.y = y; }



    private int x;
    private int y;
    private int a;
    private int b;



    public int getA() { return a; }
    private void setA(int a) { this.a = a; }

    public int getB() { return b; }
    private void setB(int b) { this.b = b; }

    public int getX() { return x; }
    private void setX(int x) { this.x = x; }

    public int getY() { return y; }
    private void setY(int y) { this.y = y; }



    public int P() { return a+b+a+b; }
    public int S() { return  a*b; }
    public double diag() { return Math.sqrt(a*a+b*b); }

    public boolean isSquare() { return  a == b ? true : false; }

    public String ToString() { return "this is Rectangle"; }
}
