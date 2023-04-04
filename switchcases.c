/*#include<stdio.h>  
int main(){    
int number=0;     
printf("enter a number:");    
scanf("%d",&number);    
switch(number){    
case 10:    
printf("number is equals to 10");    
break;    
case 50:    
printf("number is equal to 50");    
break;    
case 100:    
printf("number is equal to 100");    
break;    
default:    
printf("number is not equal to 10, 50 or 100");    
}    
return 0;  
}    */

#include <stdio.h>  
int main () {  
  
   int i = 10;  
   int j = 20;  
   
   switch(i) {  
     
      case 10:   
         printf("the value of i evaluated in outer switch: %d\n",i);  
      case 20:  
         switch(j) {  
            case 20:  
               printf("The value of j evaluated in nested switch: %d\n",j);  
         }  
   }  
     
   printf("Exact value of i is : %d\n", i );  
   printf("Exact value of j is : %d\n", j );  
   
   return 0;  
}  
