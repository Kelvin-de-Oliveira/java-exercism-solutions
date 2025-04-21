public class SalaryCalculator {
    public static double  salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1.0;
    }

    public static int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public static double bonusForProductsSold(int productsSold) {
        return productsSold >= 20 ? productsSold * 13 :  productsSold * 10;
    }

    public static double finalSalary(int daysSkipped, int productsSold) {
       double baseSalary = 1000;
       double calculatedSalary = baseSalary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
       return calculatedSalary > 2000 ? 2000 : calculatedSalary;
    } 
}
