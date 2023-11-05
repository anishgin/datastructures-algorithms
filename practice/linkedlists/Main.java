package practice.linkedlists;

public class Main {

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.createLL(1);
        ll.insertNode(2);
        ll.insertNode(3);
        ll.insertNode(4);
        ll.insertNode(5);
        ll.insertNode(5);
        ll.insertNode(6);
        ll.traversalLL();

        // Interview Questions
        //1. Delete duplicate element
        //ll = ll.deleteDupNode(ll);
        //ll.traversalLL();

        //2. Return Nth to Last
        //int element = ll.returnNLast(ll, 7);
        //System.out.println("Element : "+element);

        //element = ll.returnNLast2(ll, 1);
        //System.out.println("Element : "+element);

        //3. Partition
        LinkedList ll_2 = ll.partition(ll, 3);
        ll_2.traversalLL();
    }
}
