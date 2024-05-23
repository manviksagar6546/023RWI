//Use to set visibility 
public class Access_Modifier {
    public static void main(String[] args) {
        //main method

        Access_Modifier sc = new Access_Modifier();
        sc.publicMethod();
        sc.privateMethod();
        sc.protectedMethod();
        sc.defaultMethod();
    }

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    void defaultMethod() {
        System.out.println("This is a default method.");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
}
