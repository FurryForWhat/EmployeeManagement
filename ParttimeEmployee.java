package SalaryManage;

public class ParttimeEmployee extends Employee{
    private int workedHr ;
    private double hrRate;

    public ParttimeEmployee(String name,int employeeID,double basicSalary, int workedHr,double hrRate){
        super(name, employeeID, basicSalary);
        this.workedHr= workedHr;
        this.hrRate = hrRate;
    }

    @Override
    public double calculateSalary(){
        return this.workedHr * this.hrRate; 
    }
}
