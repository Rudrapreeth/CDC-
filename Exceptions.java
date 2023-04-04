import java.io.FileNotFoundException;
public class Exceptions {
    /*public static void main(String args[]){
        try{
            int data=100/0;
        }catch(ArithmeticException e){System.out.println(e);}
        System.out.println("rest of the code...");
    }
}*/
   /* public class TryCatchExample5 {

        public static void main(String[] args) {
            try
            {
                int data=50/0; //may throw exception
            }
            // handling the exception
            catch(Exception e)
            {
                // displaying the custom message
                System.out.println("Can't divided by zero");
            }
        }

    }*/
       /* public static void main(String[] args) {


            PrintWriter pw;
            try {
                pw = new PrintWriter("jtp.txt"); //may throw exception
                pw.println("saved");
            }
// providing the checked exception handler
            catch (FileNotFoundException e) {

                System.out.println(e);
            }
            System.out.println("File saved successfully");
        }
    }*/

    /*public static void main(String args[]){
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(Exception e){System.out.println("common task completed");}
        catch(ArithmeticException e){System.out.println("task1 is completed");}
        catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}
        System.out.println("rest of the code...");
    }
}   */
   /* public static void main(String args[]){

        try {

            System.out.println("Inside the try block");

            //below code throws divide by zero exception
            int data=25/0;
            System.out.println(data);
        }
        //cannot handle Arithmetic type exception
        //can only accept Null Pointer type exception
        catch(NullPointerException e){
            System.out.println(e);
        }

        //executes regardless of exception occured or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code...");
    }
}    */

    void method()throws IOException{
        throw new IOException("device error");
    }
}
public class Testthrows2{
    public static void main(String args[]){
        try{
            M m=new M();
            m.method();
        }catch(Exception e){System.out.println("exception handled");}

        System.out.println("normal flow...");
    }
}
