public class Mlintertance {
    void G1(){
        System.out.println("I am grandmother");
    }
}
class mother extends Mlintertance{
    void G2(){
        System.out.println("I am mother");
    }
}
class child extends mother{
    void G3(){
        System.out.println("I am child");
    }
    public static void main(String[] args) {
        System.out.println("----------------Grandparent class output----------------------");
        Mlintertance c = new Mlintertance();
        c.G1();
        System.out.println("-----------------parent class output----------------------");
        mother s = new mother();
        s.G1();
        s.G2();
        System.out.println("----------------child class output----------------------");
        child sc = new child();
        sc.G1();
        sc.G2();
        sc.G3();
    }
}

