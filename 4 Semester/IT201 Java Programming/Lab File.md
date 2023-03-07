### Experiment 1: Java programs using classes & objects and various control constructs such as loops etc, and data structures such as arrays, structures and functions

```java
// Define a class called Student
class Student {
  // Properties of the Student class
  String name;
  int age;
  double gpa;
  
  // Constructor for the Student class
  public Student(String name, int age, double gpa) {
    this.name = name;
    this.age = age;
    this.gpa = gpa;
  }
  
  // Method to print the student's details
  public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("GPA: " + gpa);
  }
}

public class Main {
  public static void main(String[] args) {
    // Declare an array of students
    Student[] students = new Student[3];
    
    // Create three student objects and store them in the array
    students[0] = new Student("Alice", 18, 3.5);
    students[1] = new Student("Bob", 20, 3.2);
    students[2] = new Student("Charlie", 19, 3.8);
    
    // Use a for loop to print the details of each student
    for (int i = 0; i < students.length; i++) {
      students[i].printDetails();
    }
  }
}
```

### Experiment 2: Java programs for creating AWT applications for display of images and texts.

```java
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
```

### Experiment 3: 