/*#include<stdio.h>  
int main(){      
int i=0;    
int marks[5];//declaration of array       
marks[0]=80;//initialization of array    
marks[1]=60;    
marks[2]=70;    
marks[3]=85;    
marks[4]=75;    
//traversal of array    
for(i=0;i<5;i++){      
printf("%d \n",marks[i]);    
}//end of for loop     
return 0;  
}    */

//
/*#include<stdio.h>  
int main(){      
int i=0;    
int marks[5]={20,30,40,50,60};//declaration and initialization of array    
 //traversal of array    
for(i=0;i<5;i++){      
printf("%d \n",marks[i]);    
}    
return 0;  
} */

//sorted array
/*#include<stdio.h>    
void main ()    
{    
    int i, j,temp;     
    int a[10] = { 10, 9, 7, 101, 23, 44, 12, 78, 34, 23};     
    for(i = 0; i<10; i++)    
    {    
        for(j = i+1; j<10; j++)    
        {    
            if(a[j] > a[i])    
            {    
                temp = a[i];    
                a[i] = a[j];    
                a[j] = temp;     
            }     
        }     
    }     
    printf("Printing Sorted Element List ...\n");    
    for(i = 0; i<10; i++)    
    {    
        printf("%d\n",a[i]);    
    }    
} */

//Max element
#include<stdio.h>  
void main ()  
{  
    int arr[100],i,n,largest,sec_largest;  
    scanf("%d",&n);  
    for(i = 0; i<n; i++)  
    {  
        scanf("%d",&arr[i]);  
    }  
    largest = arr[0];  
    sec_largest = arr[1];  
    for(i=0;i<n;i++)  
    {  
        if(arr[i]>largest)  
        {  
            sec_largest = largest;  
            largest = arr[i];  
        }  
        else if (arr[i]>sec_largest && arr[i]!=largest)  
        {  
            sec_largest=arr[i];  
        }  
    }  
    printf("largest = %d, second largest = %d",largest,sec_largest);  
      
}  