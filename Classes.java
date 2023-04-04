public class Classes {
    /*int id;
    String name;
}
class TestStudent1{
    public static void main(String args[]){
        Student s1=new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}*/

   /* int id;
    String name;
}
class TestStudent3{
    public static void main(String args[]){
        //Creating objects
        Student s1=new Student();
        Student s2=new Student();
        //Initializing objects
        s1.id=101;
        s1.name="Sonoo";
        s2.id=102;
        s2.name="Amit";
        //Printing data
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}
*/
   /*int id;
    String name;
    float salary;
    void insert(int i, String n, float s) {
        id=i;
        name=n;
        salary=s;
    }
    void display(){System.out.println(id+" "+name+" "+salary);}
}
public class TestEmployee {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        e1.insert(101,"ajeet",45000);
        e2.insert(102,"irfan",25000);
        e3.insert(103,"nakul",55000);
        e1.display();
        e2.display();
        e3.display();
    }  }*/
//Rectangle
   /*int length;
    int width;
    void insert(int l,int w){
        length=l;
        width=w;
    }
    void calculateArea(){System.out.println(length*width);}
}
class TestRectangle2{
    public static void main(String args[]){
        Rectangle r1=new Rectangle(),r2=new Rectangle();//creating two objects
        r1.insert(11,5);
        r2.insert(3,15);
        r1.calculateArea();
        r2.calculateArea();
    }
}  */
//Example
   class Account{
       int acc_no;
       String name;
       float amount;
       //Method to initialize object
       void insert(int a,String n,float amt){
           acc_no=a;
           name=n;
           amount=amt;
       }
       //deposit method
       void deposit(float amt){
           amount=amount+amt;
           System.out.println(amt+" deposited");
       }
       //withdraw method
       void withdraw(float amt){
           if(amount<amt){
               System.out.println("Insufficient Balance");
           }else{
               amount=amount-amt;
               System.out.println(amt+" withdrawn");
           }
       }
       //method to check the balance of the account
       void checkBalance(){System.out.println("Balance is: "+amount);}
       //method to display the values of an object
       void display(){System.out.println(acc_no+" "+name+" "+amount);}
   }
    //Creating a test class to deposit and withdraw amount
    class TestAccount{
        public static void main(String[] args){
            Account a1=new Account();
            a1.insert(832345,"Ankit",1000);
            a1.display();
            a1.checkBalance();
            a1.deposit(40000);
            a1.checkBalance();
            a1.withdraw(15000);
            a1.checkBalance();
        }}