public class Bulb {
    private boolean on;

    public Bulb()
    {
        on = false;
    }

    public boolean isOn()
    {
        return on;
    }

    public void setOn(boolean status)
    {
        on = status;
    }

    public String toString()
    {
        return "Bulb on: " + on;
    }
}
