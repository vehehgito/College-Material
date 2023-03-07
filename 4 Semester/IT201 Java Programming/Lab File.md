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
//Java program for creating AWT applications for display of images and texts.

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DisplayImage {
    public static void main(String[] args) throws IOException {

        File file = new File("/home/vehehgito/Learning/College-Material/4 Semester/IT201 Java Programming/02/assets/DMRC map.jpg");
        BufferedImage bufferedImage = ImageIO.read(file);

        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout());
        
        jFrame.setSize(500, 500);
        JLabel jLabel = new JLabel();

        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
```

### Experiment 3: 