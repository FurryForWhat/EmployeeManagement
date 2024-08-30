package SalaryManage;

public class ContractEmployee extends Employee{
    private int contractDuation;
    private double contractAmount;
    public ContractEmployee(String name, int employeeID, double basicSalary,int contractDuation,double contractAmount){
        super(name, employeeID, basicSalary);
        this.contractAmount = contractAmount;
        this.contractDuation = contractDuation;
    }

    @Override
    public double calculateSalary(){
        return this.contractAmount/this.contractDuation;
    }
}