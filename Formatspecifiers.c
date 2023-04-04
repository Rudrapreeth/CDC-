#include<stdio.h>
int main()  
{  
  int b=6;  
  int c=8;  
  printf("Value of b is:%d", b);  
  printf("\nValue of c is:%d",c);  
  
    return 0;  
} 
int main(){
int a=0100;  
  printf("Octal value of a is: %o", a);  
  printf("\nInteger value of a is: %d",a);  
  return 0;  
}

int main()  
{  
  int y=0xA;  
  printf("Hexadecimal value of y is: %x", y);  
  printf("\nHexadecimal value of y is: %X",y);  
  printf("\nInteger value of y is: %d",y);  
    return 0;  
}  
int main()  
{  
  float y=3.4;  
  printf("Floating point value of y is: %f", y);  
  return 0;  
}
int main()  
{  
  float y=3;  
  printf("Exponential value of y is: %E", y);  
  return 0;  
}  
int main()  
{  
  float y=3.8;  
  printf("Float value of y is: %g", y);  
  return 0;  
}  
int main()  
{  
  int y=5;  
  printf("Address value of y in hexadecimal form is: %p", &y);  
  return 0;  
}  
int main()  
{  
  char a='c';  
  printf("Value of a is: %c", a);  
  return 0;  
}  

//spacing in c
int main()  
{  
 int x=12;  
  printf("%08d", x);  
  return 0;  
}  

//precision
int main()  
{  
 float x=12.2;  
  printf("%.2f", x);  
  return 0;  
}  