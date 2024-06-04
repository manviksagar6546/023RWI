public class Streng {
    public static void main(String[] args) {
        String str = "Java program";
        System.out.println(str);
        
        char c[]= {'A','B','C','D'};
        String str1 = new String(c);
        System.out.println(str1);
        
        byte b[] = {65,66,67,68};
        String str2 = new String(b);
        System.out.println(str2);

        String str3 = new String("java");
        String str4 = "java";
        System.out.println(str3+" "+str4);
    }
}
