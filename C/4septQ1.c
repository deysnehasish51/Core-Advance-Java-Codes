#include<stdio.h>
int main()
{
    int a,b,c,d,e;
    scanf("%d %d %d %d %d",&a,&b,&c,&d,&e);

    int totalMarks=a+b+c+d+e;
    float avg=totalMarks/5.0;

    float percentage=(totalMarks/500.0)*100;
    printf("Total = %d\nAverage = %.2f\n",totalMarks,avg);
    
    percentage>=90&&percentage<=100?printf("Grade = A"):percentage>=75&&percentage<=89?printf("Grade = B"):percentage>=60&&percentage<=74?printf("Grade = C"):percentage>=45&&percentage<=59?printf("Grade = D"):a<0||b<0||c<0||d<0||e<0?printf("Invalid Input"):printf("Grade = F");

    return 0;
}