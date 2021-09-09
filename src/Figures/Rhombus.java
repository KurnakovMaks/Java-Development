package Figures;

public class Rhombus {

    public Rhombus() { s = 1; z = 45;}

    public Rhombus(int s, int z) { this.s = s; this.z = z; Swap(this.z); }

    private double a;
    private double b;
    public void Swap(int z)
    {
        z = Math.abs(z);
        if (z < 90) { a = z; b = 180-z;}
        else { b = z; a = 180 - z;}
    }



    private int s;
    private int z;



    public int getS() { return s; }
    private void setS(int s) { this.s = s; }

    public int getZ() { return z; }
    private void setZ(int z) { this.z = z; Swap(this.z); }



    public double q = Math.cos(0.0);
    public double d1() { return s * Math.sqrt(2+2 * Math.cos(a)); }
    public double d2() { return s * Math.sqrt(2+2 * Math.cos(b)); }
    public int P() { return 4*s; }
    public double S() { return d1()*d2()/2; }

    public String ToString() { return "this is Rhombus"; }

}
