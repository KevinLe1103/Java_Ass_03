package fa.training.entities;

public class SalariedEmployee extends Employee implements Payable {
    private double commissionRate;
    private double grossSale;
    private double basicSalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(double commissionRate, double grossSale, double basicSalary) {
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
        this.basicSalary = basicSalary;
    }

    public SalariedEmployee(String ssn, String firstName, String lastName, String birthDate, String phone, String email, double commissionRate, double grossSale, double basicSalary) {
        super(ssn, firstName, lastName, birthDate, phone, email);
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
        this.basicSalary = basicSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "commissionRate=" + commissionRate +
                ", grossSale=" + grossSale +
                ", basicSalary=" + basicSalary +
                '}';
    }

    public static void main(String[] args) {
        SalariedEmployee slrEmp1 = new SalariedEmployee("SE1", "Tri", "Le", "11/03/1995", "0379828008", "mimi@mimi",0.01,1000.0,300);
        System.out.println(slrEmp1);
    }

    @Override
    public double getPaymentAmount() {
        return commissionRate*grossSale+basicSalary;
    }
}
