public class multiSphere {
    public static void main(String[] args)
    {
        Sphere s1 = new Sphere(4.25);
        Sphere s2 = new Sphere(6.32);
        Sphere s3 = new Sphere(9.56);

        System.out.println("Sphere 1: "+s1.getDiameter());
        s2.setDiameter(18.4);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
