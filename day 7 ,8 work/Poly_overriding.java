class Show_a{
    public void manvik(int i){
        System.out.println("hi"+i);
    }
}

class Show_b extends Show_a{

    public void manvik(){
        System.out.println("hello");
    }
}
public class Poly_overriding {
    public static void main(String[] args) {
        Show_b sc = new Show_b();
        sc.manvik();
        sc.manvik(1);
    }
}
