import java.util.Scanner;

class Student {
    String name;
    int age;
    int[] marks = new int[5];

    Student(String n, int a, int[] m) {
        name = n;
        age = a;
        marks = m;
    }

    int totalMarks() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }
        return total;
    }

    double averageMarks() {
        return totalMarks() / 5.0;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println("Total Marks: " + totalMarks());
        System.out.println("Average Marks: " + averageMarks());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String n = sc.nextLine();

        System.out.print("Enter age: ");
        int a = sc.nextInt();

        int[] m = new int[5];
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            m[i] = sc.nextInt();
        }

        Student s = new Student(n, a, m);
        s.printDetails();

        sc.close();
    }
}
