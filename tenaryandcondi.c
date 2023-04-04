/*#include <stdio.h>  
int main()  
{  
    int age; 
    printf("Enter your age");  
    scanf("%d",&age);   
    (age>=18)? (printf("eligible for voting")) : (printf("not eligible for voting"));  // conditional operator  
    return 0;  
}  */

/*#include <stdio.h>  
int main()  
{  
   int a=5,b;    
   b=((a==5)?(3):(2)); 
   printf("The value of 'b' variable is : %d",b);  
    return 0;  
}  

//bitwise operators
#include <stdio.h>  
int main()  
{  
    int a=5; // variable initialization  
    printf("The value of a<<2 is : %d ", a<<2);  
    return 0;  
}  */

//IF-ELSE 
/*#include <stdio.h>  
int main()  
{  
    int a, b, c;   
     printf("Enter three numbers?");  
    scanf("%d %d %d",&a,&b,&c);  
    if(a>b && a>c)  
    {  
        printf("%d is largest",a);  
    }  
    if(b>a  && b > c)  
    {  
        printf("%d is largest",b);  
    }  
    if(c>a && c>b)  
    {  
        printf("%d is largest",c);  
    }  
    if(a == b && a == c)   
    {  
        printf("All are equal");   
    }  
}  */

#include<stdio.h>    
int main(){    
int number=0;    
printf("enter a number:");    
scanf("%d",&number);     
if(number==10){    
printf("number is equals to 10");    
}    
else if(number==50){    
printf("number is equal to 50");    
}    
else if(number==100){    
printf("number is equal to 100");    
}    
else{    
printf("number is not equal to 10, 50 or 100");    
}    
return 0;  
}    