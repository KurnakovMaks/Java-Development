package Figures;

public class Circle {

    public Circle() { r = 1; }

    public Circle(int r) { this.r = r; }



    private int r;



    public int getR() { return r; }
    private void setR(int r) { this.r = r; }



    public int d() { return 2*r; }
    public double C() { return Math.PI*d(); }
    public double S() { return Math.PI*r*r; }

    public String ToString() { return "this is Circle"; }

}
