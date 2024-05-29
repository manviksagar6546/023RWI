public class Poly_overloading {
    //method overloading (compile time)
    public void manvik(int i){
        System.out.println("Hi i am first manvik ");
    }
    public void manvik(){
        System.out.println("Hi i am Secound manvik ");
    }
    public static void main(String[] args) {
        Poly_overloading sc = new Poly_overloading();
        sc.manvik();
        sc.manvik(5);
    }
}
