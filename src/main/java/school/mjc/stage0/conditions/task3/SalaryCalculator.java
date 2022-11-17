package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10_000){
            int taxes = (salary * 15) / 100;
            salary -= taxes;
            System.out.println(salary);
        } else if (salary > 10_000 && salary <= 20_000){
            int taxes = (salary * 18) / 100;
            salary -= taxes;
            System.out.println(salary);
        } else if (salary > 20_000) {
            int taxes = (salary * 20) / 100;
            salary -= taxes;
            System.out.println(salary);
        } else if (salary == 0){
            System.out.println("wrong input");
        }
    }
}
