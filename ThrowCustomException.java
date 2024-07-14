// ThrowCustomException.java
public class ThrowCustomException {
    public static void main(String[] args) {
        try {
            validateAge(15);  // Passing an age that is less than 18
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above.");  // Throw CustomException if age is less than 18
        } else {
            System.out.println("Age is valid.");
        }
    }
}
