/*public class if_else {
    public static void main(String[] args) {
        String Weather="rainy";
        if(Weather == "rainy"){
            System.out.println("True");
        }
        else if (Weather == "Sunny"){
            System.out.println("False");
        }
        System.out.println("Hello world!");
    }
}
*/

/*import java.util.Scanner;

public class if_else {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        if (x>0){
            System.out.println("Positive Number");

        }
        else if (x<0){
            System.out.println("Negative Number");
        }
    }
}*/
/*import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even");
        } else if (x % 2 != 0) {
            System.out.println("Odd");
        }
    }
}*/
/*import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1 -> {
                System.out.println("January");
                System.out.println("31 days");
            }
            case 2 -> {
                System.out.println("Febrraury");
                System.out.println("28days");
            }
            default -> System.out.println("Invalid");
        }

    }
}

 */
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        switch (x) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowels");
                break;
            default:
                System.out.println("Co");
        }
    }
}