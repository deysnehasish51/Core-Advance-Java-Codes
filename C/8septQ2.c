#include<stdio.h>

int main()
{
    int age;
    float no_of_ticekets;
    scanf("%f %d",&no_of_ticekets,&age);

    age>0&&age<=60?printf("Total Cost Before Discount = %.2f\nDiscount Amount = %.2f\nTotal Cost After Discount = %.2f",no_of_ticekets*300,no_of_ticekets*300*0,no_of_ticekets*300):age>=60&&age<=100?printf("Total Cost Before Discount = %.2f\nDiscount Amount = %.2f\nTotal Cost After Discount = %.2f",no_of_ticekets*300,(no_of_ticekets*300)*20/100,(no_of_ticekets*300)-(no_of_ticekets*300)*20/100):printf("Invalid Input");
    return 0;
}