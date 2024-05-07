public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees = 0;

    public Employee(int baseSalary, int hourlyRate) {
        setHourlyRate(hourlyRate);
        setBaseSalary(baseSalary);
    }

    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
    public int calculateWage(){
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0) throw new IllegalArgumentException("Salary can not be less than 0");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate <= 0) throw new IllegalArgumentException("Hourly rate can not be 0 or less.");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }
}
