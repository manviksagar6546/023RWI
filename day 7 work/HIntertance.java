public class HIntertance {
    void G1(){
        System.out.println("I am grandmother");
    }
}
class mother extends HIntertance{
    void G2(){
        System.out.println("I am mother");
    }
}
class child extends HIntertance{
    void G3(){
        System.out.println("I am child");
    }
    public static void main(String[] args) {
        System.out.println("----------------Grandparent class output----------------------");
        HIntertance c = new HIntertance();
        c.G1();
        System.out.println("-----------------parent class output----------------------");
        mother s = new mother();
        s.G1();
        s.G2();
        System.out.println("----------------child class output----------------------");
        child sc = new child();
        sc.G1();
        sc.G3();
    }
}

