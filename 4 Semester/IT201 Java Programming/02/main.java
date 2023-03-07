//Java programs for creating AWT applications for display of images and texts.

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class AWTImageTextDemo extends Frame {
    private BufferedImage image;

    public AWTImageTextDemo() {
        super("AWT Image and Text Demo");

        // Load the image
        try {
            image = ImageIO.read(new File("image.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create a panel for displaying the image and text
        Panel panel = new Panel(new BorderLayout());

        // Create a label for displaying the image
        Label imageLabel = new Label(new ImageIcon(image));
        panel.add(imageLabel, BorderLayout.CENTER);

        // Create a label for displaying the text
        Label textLabel = new Label("Hello, World!");
        textLabel.setFont(new Font("Arial", Font.BOLD, 24));
        textLabel.setAlignment(Label.CENTER);
        panel.add(textLabel, BorderLayout.SOUTH);

        // Add the panel to the frame
        add(panel);

        // Set the frame properties
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTImageTextDemo();
    }
}
