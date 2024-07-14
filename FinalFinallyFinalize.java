class FinalFinallyFinalize {
    final int MAX_VALUE = 100; // final variable

    // final method
    final void display() {
        System.out.println("This is a final method.");
    }

    // finalize method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called.");
    }

    public static void main(String[] args) {
        FinalFinallyFinalize obj = new FinalFinallyFinalize();

        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception occurred.");
        } finally {
            System.out.println("Finally block is always executed.");
        }

        obj.display(); // Calling final method

        obj = null; // Nullifying the reference to the object

        // Requesting garbage collection explicitly
        System.gc();
    }
}
