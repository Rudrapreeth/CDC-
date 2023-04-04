//import java.util.Scanner;
//public class external_ {
   // public static void main(String [] args){
                                                                                    /*(29-11-22)*/
       // int a = 5,b = 7, c = 9, t =0, d=6,e='d';
        /*if(a>b && a>c){
            System.out.println(a);
        }
        if(b>a && b>c){ `
            System.out.println(b);
        }
        if(c>a && c>b) {
            System.out.println(c);
        }*/
       /*if(a>=b && a>=c)t=a;
       else if(b>=c)t=b;
       else t=c;
       System.out.println(t);*/


        //System.out.println(a>=b? a>=c? a>=d? a:d : b>=c? b>=d? b:d : c>=d? c:d:b);
        /*System.out.println(Math.max(Math.max(a,b),c));
        System.out.println(Math.min(Math.min(a,b),c));*/

        /*int id =15;
        String name="Chiru";
        System.out.printf("My id is %d. My name is %s.\n",id,name);
        System.out.println("My id is "+id+". My name is "+name+".");
        System.out.println(d+e);// as int byte is greater than char then int dominates the char

        byte f=5; String y ="3";
        System.out.println(a+y);

        Scanner  rudra = new Scanner(System.in);
        System.out.print("Enter two inputs: ");
        int g = rudra.nextInt(+split(",")), h =rudra.nextInt();
        System.out.println("sum : "+(g+h));
        System.out.println("sum : " + g+h);*/


//{6-12-2022}
/*import java.util.Scanner;
class IAREStudent{
    int id; String name, branch;
}
public class external_{
    public static void main(String[] args){
        /*IAREStudent stud1 = new IAREStudent();
        IAREStudent stud2 = new IAREStudent();
        stud1.id = 143;
        stud1.name = "Shasi";
        stud1.branch="ECE";
        stud2.id = 420;
        stud2.name ="rudy";
        stud2.branch = "ECE";
        System.out.println(stud1.id+" "+stud1.name+" "+stud1.branch);
        System.out.println(stud2.id+" "+stud2.name+" "+stud2.branch);
//IAREStudent ==class || stud1,stud2==Object.
        //new keyword means object is created. */

        //int arr[]= new int[10];
        //arr is a integer object

        //arr[0]=12; arr[1]=15; arr[6]=67;
        /*int arr[]= new int[]{12,4,2,789,123};
        //ARRAY SYANTAX: type arrayname[] = new type[size]
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");}*/

        /*int arr[]= new int[]{12,4,2,789,123};
        for(int i: arr) System.out.print(i+" ");*/


      /*  Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        for(int i: arr) System.out.print(i+" ");
        //reversing
        for(int j=n-1;j>=0;j--){
            System.out.print(arr[j]+" ");

*/
import java.util.*;
public class external_{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            if (n%i==0){
                System.out.println(i);
            }
        }
    }
}
