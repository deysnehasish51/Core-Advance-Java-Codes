class SalaryCalculation
{
    public static void main(String []agrs)
    {
        double basicSalary=50000.0;
        double rentAllowance=basicSalary*0.15;
        double conveyanceAllowance=basicSalary*0.15;
        double entertainmentAllowance=basicSalary*0.1;

        double totalSalary=basicSalary+rentAllowance+conveyanceAllowance+entertainmentAllowance;

        System.out.println("Monthly Salary Slip");
        System.out.println("-------------------");
        System.out.println("Basic Salary : "+basicSalary);
        System.out.println("House Rent Allowance : "+rentAllowance);
        System.out.println("Conveyance Allowance : "+conveyanceAllowance);
        System.out.println("Entertainment Allowance : "+entertainmentAllowance);
        System.out.println("Total Salary : "+totalSalary);


    }
}