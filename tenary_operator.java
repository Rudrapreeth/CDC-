import java.util.Scanner;

/*import java.util.Scanner;
public class tenary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String ans = x%2==0 ? "e3ven" : "odd";
        System.out.println(ans);
}}
*/
/*public class tenary_operator {
    public static void main(String[] args) {
        boolean flag=false;
        if(!flag){
            System.out.println("h");
        }
    }}*/
//Max Value//
public class tenary_operator{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();

        int maxValue=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            int current=sc.nextInt();
            maxValue=Math.max(maxValue,current);
        }
        System.out.println(maxValue);

    }
        }

