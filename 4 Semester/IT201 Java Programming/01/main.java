//Java programs using classes & objects and various control constructs such as loops etc, and data structures such as arrays, structures and functions

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
