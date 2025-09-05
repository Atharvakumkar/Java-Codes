import java.util.Scanner;

class marriageError extends Exception {
    public marriageError(String message) {
        super(message);
    }
}

class Shaadicom {
    int age;

    public Shaadicom(int age) {
        this.age = age;
    }

    public void verifyAge() throws marriageError {
        if (age < 18) {
            throw new marriageError("Too young to marry :(");
        } else if (age > 60) {
            throw new marriageError("Too old to marry :(");
        } else {
            System.out.println("Marriage successful!");
        }
    }
}

public class matrimony {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        System.out.print("Enter age: ");
        age = input.nextInt();
        Shaadicom marriageVerify = new Shaadicom(age);

        try {
            marriageVerify.verifyAge();
        } catch (marriageError e) {
            System.out.println("Exception: " + e.getMessage());
        }
        input.close();
    }
}