package SalaryManage;

public class FulltimeEmployee extends Employee{
    private double allowence;
    private double bonus;

    public FulltimeEmployee(String name,int employeeID,int basicSalary,double allowence,double bonus){
        super(name, employeeID, basicSalary);
        this.allowence = allowence;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return this.allowence+this.bonus+this.getSalary();
    }
}
