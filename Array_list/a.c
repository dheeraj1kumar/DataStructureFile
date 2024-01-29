#include<stdio.h>
void main() {
    float a,a1,a2;
    printf("Enter the population of city : ");  
    // here Enter the population that is 30000 by your question so enter 30000
    scanf("%f",&a);
    a1=a+a*0.20;  
    //for first year population will increase 20 percent 
    a2=a1+a1*0.30;   
     // and for second year population will
    // increase 30 percent of first year increases population that is =36000
    printf("Population after 2 year is : %f",a2); 

}