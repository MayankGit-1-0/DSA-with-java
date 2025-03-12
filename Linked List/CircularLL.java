import java.util.Scanner;

public class CircularLL {
    static  class Node{
        String val;
        Node next;
        Node(){}
        Node(String val){
            this.val=val;
            next=null;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="Circular Linked List:";
        
        Node head=new Node(s);
        head.next=head;
        Node t=head;
        int size=0;
        while(true){
            String str=sc.nextLine();
            if(str.equals("exit")) break;
            Node temp=new Node(str);
            t.next=temp;
            temp.next=head;
            t=t.next;
            size++;
        }
        if(size==0) System.out.println("No Node is available.");
        else{
            t=head;
            while(t.next!=head){
                System.out.println(t.val);
                t=t.next;
            }
            System.out.println(t.val);
        }
        sc.close();
    }
}