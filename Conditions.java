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

public class if_else {
    /*public static void main(String[] args) {
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
}*/

    /*public static void main(String[] args) {
        int number=13;
        if(number%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
}  */
    /*public class IfElseTernaryExample {
        public static void main(String[] args) {
            int number=13;
            //Using ternary operator
            String output=(number%2==0)?"even number":"odd number";
            System.out.println(output);
        }
    }    */
   /* public static void main(String[] args) {
        int marks=65;

        if(marks<50){
            System.out.println("fail");
        }
        else if(marks>=50 && marks<60){
            System.out.println("D grade");
        }
        else if(marks>=60 && marks<70){
            System.out.println("C grade");
        }
        else if(marks>=70 && marks<80){
            System.out.println("B grade");
        }
        else if(marks>=80 && marks<90){
            System.out.println("A grade");
        }else if(marks>=90 && marks<100){
            System.out.println("A+ grade");
        }else{
            System.out.println("Invalid!");
        }
    }
}  */
    /*public static void main(String[] args) {
        int age=25;
        int weight=48;
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            } else{
                System.out.println("You are not eligible to donate blood");
            }
        } else{
            System.out.println("Age must be greater than 18");
        }
    }  }*/
    /*public static void main(String[] args) {
        int month=7;
        String monthString="";
        //Switch statement
        switch(month){
            case 1: monthString="1 - January";
                break;
            case 2: monthString="2 - February";
                break;
            case 3: monthString="3 - March";
                break;
            case 4: monthString="4 - April";
                break;
            case 5: monthString="5 - May";
                break;
            case 6: monthString="6 - June";
                break;
            case 7: monthString="7 - July";
                break;
            case 8: monthString="8 - August";
                break;
            case 9: monthString="9 - September";
                break;
            case 10: monthString="10 - October";
                break;
            case 11: monthString="11 - November";
                break;
            case 12: monthString="12 - December";
                break;
            default:System.out.println("Invalid Month!");
        }
        System.out.println(monthString);
    }
}

     */

    public static void main(String args[])
    {
        //C - CSE, E - ECE, M - Mechanical
        char branch = 'C';
        int collegeYear = 4;
        switch( collegeYear )
        {
            case 1:
                System.out.println("English, Maths, Science");
                break;
            case 2:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Computer Organization, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            case 4:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Data Communication and Networks, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Embedded System, Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology, Thermal Engineering");
                        break;
                }
                break;
        }
    }
}
