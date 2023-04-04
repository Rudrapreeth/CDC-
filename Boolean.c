/*#include <stdio.h>  
#include<stdbool.h>  
int main()  
{  
bool x=false; // variable initialization.  
if(x==true) // conditional statements  
{  
printf("The value of x is true");  
}  
else  
printf("The value of x is FALSE");  
return 0;  
}  */

/*#include <stdio.h>  
int main()  
{  
bool b[2]={true,false}; // Boolean type array  
for(int i=0;i<2;i++)   
{  
printf("%d,",b[i]); 
}  
return 0;  
}  */

#include <stdio.h>  
#include<stdbool.h>  
int main()  
{  
bool x=false;  
bool y=true;  
printf("The value of x&&y is %d", x&&y);  
printf("\nThe value of x||y is %d", x||y);  
printf("\nThe value of !x is %d", !x);  
}  

