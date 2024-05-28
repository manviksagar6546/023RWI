public class Encap {
    private int emp_id;

    public void setEmp_id(int emp_id){
        this.emp_id = emp_id;
    }
    public int getEmp_id(){
        return emp_id;
    }

    public static void main(String[] args) {
        Encap sc = new Encap();
        sc.setEmp_id(23);
        int id = sc.getEmp_id();
        System.out.println(id);
    }
}
