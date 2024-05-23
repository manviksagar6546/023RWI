final public class FinalExample {//It cannot be subclassed
    final int x = 10; // final variable
    
    final public void finalMethod() {//cannot be overridden by subclasses.
        System.out.println("This is a final method.");
    }
    
    public static void main(String[] args) {
        FinalExample example = new FinalExample();
        System.out.println("Value of final variable x: " + example.x);
        example.finalMethod();
    }
}
