package dip.lab1.student.solution1;



/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee {

    private double annualSalary;
    private double annualBonus;

    

    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualWages(annualSalary);
        setAnnualBonus(annualBonus);
    }

    public double getAnnualWages() {
        return annualSalary + annualBonus;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualWages(double annualSalary) {
        //validate
        this.annualSalary = annualSalary;
    }

    public void setAnnualBonus(double annualBonus) {
        //validate
        this.annualBonus = annualBonus;
    }
    
}
