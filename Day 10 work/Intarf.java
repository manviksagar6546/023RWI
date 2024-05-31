interface manvik{
    void gym();
}

class abhinav implements manvik{
    public void gym(){
        System.out.println("gym");
    }
}

public class Intarf {
    public static void main(String[] args) {
        abhinav sc = new abhinav();
        sc.gym();
    }
    
}
