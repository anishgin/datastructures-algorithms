package practice.linkedlists;

import java.util.HashSet;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;


    /*
    1. Create Head and Tail, initialize with null
    2. Create a blank Node and assign a value to it and reference to null.
    3. Link Head and Tail with these Node
     */
    public void createLL(int nodeValue) {
        Node newnode = new Node();
        newnode.value = nodeValue;
        newnode.next = null;
        head = newnode;
        tail = newnode;
        size= 1;
    }

    public void insertNode(int nodeValue) {
        if (head == null) {
            createLL(nodeValue);
            return;
        }

        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void traversalLL() {
        Node tempNode = head;
        for (int i =0; i<size; i++) {
            System.out.print(tempNode.value);
            if (i != size -1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }

    public void deleteNode(int i) {
    }

    public LinkedList deleteDupNode(LinkedList ll) {
        HashSet<Integer> hs = new HashSet();
        Node current = ll.head;
        Node prev = null;

        while(current != null){
            if(hs.contains(current.value) ){
                prev.next = current.next;
                ll.size--;
            } else {
                hs.add(current.value);
                prev = current;
            }
            current = current.next;
        }
        return ll;
    }

    public int returnNLast(LinkedList ll, int lastPosition) {
        System.out.println(ll.tail);
        System.out.println(ll.size +" find this element "+ (ll.size-lastPosition+1));

        Node tmp = ll.head;
        int valu = 0;
        for(int i=1; i<=ll.size; i++){
            if(i == (ll.size-lastPosition+1)){
                valu = tmp.value;
                break;
            }
            tmp = tmp.next;
        }
        return valu;
    }

    public int returnNLast2(LinkedList ll, int lastPosition) {
        /*
        Using 2 pointers
        */
        Node p1 = ll.head;
        Node p2 = ll.head;

        for(int i=1; i<= lastPosition; i++){
            p2 = p2.next;
        }
        while (p2 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1.value;
    }

    public LinkedList partition(LinkedList ll, int x) {
        Node tmp_node  = ll.head;
        ll.tail = ll.head;

        while(tmp_node != null){
            Node next = tmp_node.next;
            if (tmp_node.value < x){
                System.out.println("tmp _ node _ smaller : "+ tmp_node.value);
                tmp_node.next = ll.head;
                ll.head = tmp_node;
            } else {
                System.out.println("tmp _ node _ greater : "+ tmp_node.value);
                ll.tail.next = tmp_node;
                ll.tail = tmp_node;
            }

            tmp_node = next;

        }


        return ll;
    }
}
