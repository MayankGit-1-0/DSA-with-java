import java.util.Scanner;

public class CircularLL {
    static  class Node{ // node data type
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
        
        Node head=new Node(s); // head node
        head.next=head;
        Node t=head;
        int size=0;
        while(true){  // Creation of circular Linked List with user Input
            String str=sc.nextLine();
            if(str.equals("exit")) break; // If the input is exit then break out of loop
            Node temp=new Node(str);
            t.next=temp;
            temp.next=head;
            t=t.next;
            size++;
        }
        if(size==0) System.out.println("No Node is available in the Circular Linked List."); // if np input is given print not available
        else{
            t=head; // else print all the nodes 
            while(t.next!=head){
                System.out.println(t.val);
                t=t.next;
            }
            System.out.println(t.val);
        }
        sc.close();
    }
}