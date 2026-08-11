class Employee
{
    public static void main(String []args)
    {
        String name="Snehasish Dey";
        double basicSalary=12000.0;

        double da,hra,totalSalary,tax=0.0;

        if(basicSalary>=10000)
        {
            da=basicSalary*0.4;
            hra=basicSalary*0.3;
            totalSalary=basicSalary+da+hra;

            if(totalSalary>50000)
            {
                tax=totalSalary*0.3;
                totalSalary-=tax;
            }
            System.out.println("Name : "+name);
            System.out.println("Basic Pay : Rs."+basicSalary);
            System.out.println("DA : Rs. "+da);
            System.out.println("HRA : Rs. "+hra);
            System.out.println("Monthly Income Tax (if applicable) : Rs. "+tax);
            System.out.println("Net Monthly Salary : Rs. "+totalSalary);
        }
        else if(basicSalary>=5000&&basicSalary<10000)
        {
            da=basicSalary*0.4;
            hra=basicSalary*0.25;
            totalSalary=basicSalary+da+hra;

            if(totalSalary>50000)
            {
                tax=totalSalary*0.3;
                totalSalary-=tax;
            }
            System.out.println("Name : "+name);
            System.out.println("Basic Pay : Rs."+basicSalary);
            System.out.println("DA : Rs. "+da);
            System.out.println("HRA : Rs. "+hra);
            System.out.println("Monthly Income Tax (if applicable) : Rs. "+tax);
            System.out.println("Net Monthly Salary : Rs. "+totalSalary);
        }
        else if(basicSalary>=2000&&basicSalary<=5000)
        {
            da=basicSalary*0.3;
            hra=basicSalary*0.20;
            totalSalary=basicSalary+da+hra;

            if(totalSalary>50000)
            {
                tax=totalSalary*0.3;
                totalSalary-=tax;
            }
            System.out.println("Name : "+name);
            System.out.println("Basic Pay : Rs."+basicSalary);
            System.out.println("DA : Rs. "+da);
            System.out.println("HRA : Rs. "+hra);
            System.out.println("Monthly Income Tax (if applicable) : Rs. "+tax);
            System.out.println("Net Monthly Salary : Rs. "+totalSalary);
        }
        else
        {
            da=basicSalary*0.3;
            hra=basicSalary*0.15;
            totalSalary=basicSalary+da+hra;

            if(totalSalary>50000)
            {
                tax=totalSalary*0.3;
                totalSalary-=tax;
            }
            System.out.println("Name : "+name);
            System.out.println("Basic Pay : Rs."+basicSalary);
            System.out.println("DA : Rs. "+da);
            System.out.println("HRA : Rs. "+hra);
            System.out.println("Monthly Income Tax (if applicable) : Rs. "+tax);
            System.out.println("Net Monthly Salary : Rs. "+totalSalary);
        }
    }
}