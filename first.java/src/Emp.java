import java.util.*;

class Emp {
    int sal;
    int no_of_hrs;

    public void getInfo(int salary, int numbs) {
        sal = salary;
        no_of_hrs = numbs;
    }

    public void printInfo() {
        System.out.println("Salary: " + sal);
        System.out.println("Number of Hours: " + no_of_hrs);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Emp employee = new Emp();

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter number of hours worked: ");
        int hours = sc.nextInt();

        employee.getInfo(salary, hours);
        employee.printInfo();

        sc.close();
    }
}
