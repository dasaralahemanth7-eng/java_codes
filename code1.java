    class Student {
    String name;
    int rollNumber;
    int age;
    double marks;

    void display() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Rahul";
        s1.rollNumber = 101;
        s1.age = 20;
        s1.marks = 85.5;

        s1.display();
    }
}
