public class Singleintertance {//parent class ( Derived)
    void dumbbell(){
        System.out.println("I am for chest press");
    }
}
class Tools extends Singleintertance{ //child class inherit (extends) qualities of parent
    void chest_press(){
        System.out.println("For chest press we need dumbbell");
    }
    public static void main(String[] args) {
        Tools sc  =  new Tools();
        sc.chest_press();
        sc.dumbbell();
    }
}

