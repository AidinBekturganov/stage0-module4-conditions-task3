package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float answer = salary;

        if (answer <= 10000 && answer > 0) {
            answer = answer - (answer / 100 * 15);
            System.out.println(answer);
        } else if (answer <= 20000 && answer > 10000) {
            answer = answer - (answer / 100 * 18);
            System.out.println(answer);
        } else if (answer > 20000) {
            answer = answer - (answer / 100 * 20);
            System.out.println(answer);
        } else {
            System.out.println("wrong input!");
        }
    }
}
