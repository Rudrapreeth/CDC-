class Node{
    int data;
    Node next;
    Node prev;
    public Node(int value){
        this.data=value;
        next=null;
        prev=null;
    }
}
class dll{
    public void adde(Node head,int data){
        Node new_node=new Node(data);
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=new_node;
        new_node.prev=cur;
    }
    public void delete(Node head){

    }
    public void printl(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.println();
    }
}
public class doublell {
    public static void main(String[] args) {
        dll d=new dll();
        Node head=new Node(10);
        d.adde(head, 20);
        d.adde(head, 30);
        d.adde(head, 40);
        d.adde(head, 50);
        d.printl(head);
    }
}
