import java.awt.FlowLayout;
import javax.swing.JFrame;
import uk.ac.leedsbeckett.oop.OOPGraphics;

public class MainClass extends OOPGraphics {
    public static void main(String[] args) {
        new MainClass();
    }

    public MainClass() {
        JFrame MainFrame = new JFrame();
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.setLayout(new FlowLayout());
        MainFrame.add(this);
        MainFrame.pack();
        MainFrame.setVisible(true);
        this.about();
    }

    public void processCommand(String command) {
    }
}