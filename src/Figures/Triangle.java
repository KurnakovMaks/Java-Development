package Figures;

public class Triangle {

    public Triangle() {
        a = 3;
        b = 4;
        c = 5;
    }

    public Triangle(int a, int b, int c)
    { this.a = a; this.b = b; this.c = c; }



    private int a;
    private int b;
    private int c;



    public int getA() { return a; }
    private void setA(int a) { this.a = a; }

    public int getB() { return b; }
    private void setB(int b) { this.b = b; }

    public int getC() { return c; }
    private void setC(int c) { this.c = c; }



    public int P() { return a + b + c; }
    public double S() { return Math.sqrt((P()/2)*((P()/2)-a)*((P()/2)-b)*((P()/2)-c)); }

    public boolean isExist()
    { return a+b>c &&  b+c>a && a+c>b ? true : false; }

    public String ToString() { return "this is Triangle"; }

}
