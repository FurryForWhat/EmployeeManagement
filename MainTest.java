package SalaryManage;

public class MainTest {
    public static void main(String[] args){
        Employee pt1 = new ParttimeEmployee("Lwin Hein Khant", 0, 1000, 3, 500);
        Employee ft1= new FulltimeEmployee("Feliz",2,5000,2300,3000);
        Employee c1 = new ContractEmployee("LinLat", 1, 15000, 120,1300);

        pt1.display();
        ft1.display();
        c1.display();
    }
}
