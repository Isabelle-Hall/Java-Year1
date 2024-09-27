public class Lights {
    public static void main(String[] args)
    {
        Bulb b1 = new Bulb();
        Bulb b2 = new Bulb();

        b1.setOn(true);
        b2.setOn(false);

        System.out.println(b1);
        System.out.println(b2);
    }
}
