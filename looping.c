/*#include<stdio.h>  
int main(){    
int i=1,number=0;    
printf("Enter a number: ");    
scanf("%d",&number);    
do{    
printf("%d \n",(number*i));    
i++;    
}while(i<=10);    
return 0;  
} */   

/*#include<stdio.h>  
int main(){    
int i=1,number=0,b=9;    
printf("Enter a number: ");    
scanf("%d",&number);    
while(i<=10){    
printf("%d \n",(number*i));    
i++;    
}    
return 0;  
} */

/*#include<stdio.h>  
int main(){  
int i=1,number=0;      
printf("Enter a number: ");    
scanf("%d",&number);    
for(i=1;i<=10;i++){      
printf("%d \n",(number*i));    
}    
return 0;  
} */

/*#include <stdio.h>  
int main()  
{  
    int i,j,k;  
    for(i=0,j=0,k=0;i<4,k<8,j<10;i++)  
    {  
        printf("%d %d %d\n",i,j,k);  
        j+=2;  
        k+=3;  
    }  
}  */

#include <stdio.h>  
int main()  
{  
   printf("Enter the value of n :");    
   for(int i=1;i<=n;i++)    
   {  
       for(int j=1;j<=10;j++)    
       {  
           printf("%d\t",(i*j)); 
       }  
       printf("\n");  
   } } 

//Break

#include<stdio.h>  
void main ()  
{  
    int i = 0;  
    while(1)  
    {  
        printf("%d  ",i);  
        i++;  
        if(i == 10)  
        break;   
    }  
    printf("came out of while loop");  
}  

//Table
#include<stdio.h>  
void main ()  
{  
   int n=2,i,choice;  
   do  
   {  
       i=1;  
       while(i<=10)  
       {  
           printf("%d X %d = %d\n",n,i,n*i);  
           i++;  
       }  
       scanf("%d",&choice);  
    if(choice == 0)  
       {  
           break;  
       }  
       n++;  
   }while(1);  
}  
//continue
#include<stdio.h>  
void main ()  
{  
    int i = 0;   
    while(i!=10)  
    {  
        printf("%d", i);   
        continue;   
        i++;  
    }  
}  
//goto
/*#include <stdio.h>  
int main()   
{  
  int i, j, k;    
  for(i=0;i<10;i++)  
  {  
    for(j=0;j<5;j++)  
    {  
      for(k=0;k<3;k++)  
      {  
        printf("%d %d %d\n",i,j,k);  
        if(j == 3)  
        {  
          goto out;   
        }  
      }  
    }  
  }  
  out:   
  printf("came out of the loop");   
} */ 