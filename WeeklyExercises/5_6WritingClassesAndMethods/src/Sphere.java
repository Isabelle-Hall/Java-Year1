import java.text.DecimalFormat;

public class Sphere {
    private double diameter;

    public Sphere(double diameterInitialise)
    {
        diameter = diameterInitialise;
    }

    public double getDiameter()
    {
        return diameter;
    }

    public void setDiameter(double diameterUpdate)
    {
        diameter = diameterUpdate;
    }

    public double getRadius()
    {
        return diameter / 2.0;
    }

    public double calculateSA()
    {
        double radius = getRadius();
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double calculateVol()
    {
        double radius = getRadius();
        return (4 *  Math.PI * Math.pow(radius, 3)) /3;
    }

    public String toString()
    {
        DecimalFormat df = new DecimalFormat("0.###");

        return "Sphere diameter: "+ diameter + "    Volume: " + df.format(calculateVol()) + "   Area: " + df.format(calculateSA());
    }

}
