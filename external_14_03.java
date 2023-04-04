package java_practice;

class Node{
    int data; // to store data
    Node next; // to store next address
    public Node(int value){
        this.data=value;
        next=null;
    }
}
class LL{
    public void addElement(Node head,int data){
        Node new_node=new Node(data);
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=new_node;
    }
    public void deleteElement(Node head){
        Node cur=head;
        while(cur.next.next!=null){
            cur=cur.next;
        }
        cur.next=null;

    }
    public void printList(Node head){
        Node cur=head;
        while(cur.next!=null){
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.println();
    }
}

public class external_14_03 {
    public static void main(String[] args) {
        LL h=new LL();
        Node head=new Node(10);
        h.addElement(head, 20);
        h.addElement(head, 30);
        h.addElement(head, 40);
        h.printList(head);
    }
}