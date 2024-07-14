// ExternalClass.java
package externalpackage;

public class ExternalClass {
    private int privateField;
    int defaultField;
    protected int protectedField;
    public int publicField;

    public ExternalClass() {
        privateField = 1;
        defaultField = 2;
        protectedField = 3;
        publicField = 4;
    }

    private void privateMethod() {
        System.out.println("Private method called");
    }

    void defaultMethod() {
        System.out.println("Default method called");
    }

    protected void protectedMethod() {
        System.out.println("Protected method called");
    }

    public void publicMethod() {
        System.out.println("Public method called");
    }
}
// SamePackageClass.java
package externalpackage;

public class SamePackageClass {
    public static void main(String[] args) {
        ExternalClass externalObj = new ExternalClass();

        // Accessing fields of ExternalClass
        // Can access all fields because SamePackageClass is in the same package
        System.out.println("privateField: " + externalObj.privateField);  // Compilation error: privateField has private access in ExternalClass
        System.out.println("defaultField: " + externalObj.defaultField);
        System.out.println("protectedField: " + externalObj.protectedField);
        System.out.println("publicField: " + externalObj.publicField);

        // Accessing methods of ExternalClass
        // Can access all methods because SamePackageClass is in the same package
        externalObj.privateMethod();  // Compilation error: privateMethod() has private access in ExternalClass
        externalObj.defaultMethod();
        externalObj.protectedMethod();
        externalObj.publicMethod();
    }
}
