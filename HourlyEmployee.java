package fa.training.entities;

public class HourlyEmployee extends Employee implements Payable {
    private double wage;
    private double workingHour;

    public HourlyEmployee(double wage, double workingHour) {
        this.wage = wage;
        this.workingHour = workingHour;
    }

    public HourlyEmployee(String ssn, String firstName, String lastName, String birthDate, String phone, String email, double wage, double workingHour) {
        super(ssn, firstName, lastName, birthDate, phone, email);
        this.wage = wage;
        this.workingHour = workingHour;
    }

    public HourlyEmployee() {
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(double workingHour) {
        this.workingHour = workingHour;
    }

    @Override
    public String toString() {
        return "hourlyEmployee{" +
                "wage=" + wage +
                ", workingHour=" + workingHour +
                '}';
    }

    @Override
    public double getPaymentAmount() {
        return wage*workingHour;
    }
}
