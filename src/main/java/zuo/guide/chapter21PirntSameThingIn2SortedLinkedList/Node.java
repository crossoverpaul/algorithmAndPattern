package zuo.guide.chapter21PirntSameThingIn2SortedLinkedList;

public class Node {
    public int value;
    public Node next;
    public Node(int data){
        this.value=data;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}