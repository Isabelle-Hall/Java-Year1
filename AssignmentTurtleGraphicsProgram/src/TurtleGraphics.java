import java.awt.*;
import javax.swing.JFrame;
import uk.ac.leedsbeckett.oop.OOPGraphics;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


public class TurtleGraphics extends OOPGraphics {
    public static void main(String[] args) {
        new TurtleGraphics();
    }

    public TurtleGraphics() {
        JFrame MainFrame = new JFrame();
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.setLayout(new FlowLayout());
        MainFrame.add(this);
        MainFrame.pack();
        MainFrame.setVisible(true);
        this.about();

        penDown();
    }

    public void processCommand(String command) {

        String[] commands = command.split(" ");
        String commandString = commands[0];


        int distance = 0;

        if (commands.length > 1) {
            try {
                distance = Integer.parseInt(commands[1]);

                if (distance < 0) {
                    displayMessage("Invalid parameter: " + commands[1]);
                    return;
                }

            } catch (NumberFormatException e) {
                displayMessage("Invalid parameter: " + commands[1]);
                return;
            }


        }
        switch (commands[0]) {
            case "about":
                about();
                break;

            case "penup":
                penUp();
                break;

            case "pendown":
                penDown();
                break;

            case "penwidth":
                if (commands.length < 2) {
                    displayMessage("Invalid or missing parameter");
                    return;
                }
                penWidth(distance);
                break;

            case "turnleft":
                if (commands.length < 2) {
                    displayMessage("Invalid or missing parameter");
                    return;
                }
                turnLeft(distance);
                break;

            case "turnright":
                if (commands.length < 2) {
                    displayMessage("Invalid or missing parameter");
                    return;
                }
                turnRight(distance);
                break;

            case "forward":
                if (commands.length < 2) {
                    displayMessage("Invalid or missing parameter");
                    return;
                }
                forward(distance);
                break;

            case "backward":
                if (commands.length < 2) {
                    displayMessage("Invalid or missing parameter");
                    return;
                }
                forward(distance * -1);
                break;

            case "square":
                if (commands.length < 2) {
                    displayMessage("Invalid or missing parameter");
                    return;
                }
                drawSquare(distance);
                break;

            case "triangle":
                if (commands.length < 2) {
                    displayMessage("Invalid or missing parameter");
                    return;
                }
                drawTriangle(distance);
                break;

            case "black":
                setPenColour(Color.black);
                break;

            case "green":
                setPenColour(Color.green);
                break;

            case "red":
                setPenColour(Color.red);
                break;

            case "white":
                setPenColour(Color.white);
                break;

            case "pen":
                Color colour = new Color(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]), Integer.parseInt(commands[3]));
                setPenColour(colour);
                break;

            case "reset":
                reset();
                break;

            case "clear":
                clear();
                break;

            case "save":
                saveImage("turtle_graphics.png");
                break;

            default:
                displayMessage("Invalid Command");
        }
    }

    public void about() {
        displayMessage("Izzy's OOP Graphics");
        super.about();
    }

    public void drawSquare(int distance) {
        for (int i = 0; i < 4; i++) {
            forward(distance);
            turnRight(90);
        }
    }

    public void penWidth(int distance) {
        setStroke(distance);
    }

    public void drawTriangle(int distance) {
        for (int i = 0; i < 3; i++) {
            forward(distance);
            turnRight(120);
        }
    }

    public void saveImage(String filename) {
        try {
            BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = image.createGraphics();
            paint(g2d);
            g2d.dispose();

            File file = new File(filename);
            ImageIO.write(image, "png", file);

            System.out.println("Image saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving image: " + e.getMessage());
        }

    }
}
