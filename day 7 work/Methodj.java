abstract class Manvik{
    abstract void show_A();
}
public class Methodj extends Manvik{
    public void show_A(){
        System.out.println("Manvik");
    }
    public static void main(String[] args) {
        Methodj sc = new Methodj();
        sc.show_A();
    }
}

