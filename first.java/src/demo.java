public class demo {
    public static void main(String[] args) {
        String sname = "RameshwaR";
        try {
            if (sname == null) 
                throw new NullPointerException("Student name cannot be null");
            else 
                System.out.println("Attendance for " + sname + " marked successfully!");
            
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}