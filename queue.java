import java.util.ArrayList;

class Q{
    ArrayList<Integer> qe=new ArrayList<Integer>();
    int size =5;
    public void push(int e){
        if(qe.size()==size){
            System.out.println("Overflow: Queue is full");
        }
        else{
            qe.add(e);
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Underflow: Queue is empty");
        }
        else{
            qe.remove(0);
        }
    }
    public boolean isEmpty(){
        if(qe.size()==0){
            return true;
        }
        return false;
    }
    public void printQ(){
        System.out.println(qe);
    }
}
public class queue {
    public static void main(String[] args) {
        Q q=new Q();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.printQ();
        q.pop();
        q.printQ();
        q.push(10);
        q.printQ();
    }  
}