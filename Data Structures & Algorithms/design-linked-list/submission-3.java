
class Node{
    public int val;
    public Node next;

    public Node(int val){
        this.val = val;
        this.next = null;
    }
}
class MyLinkedList {
    private Node head;
    int length = 0;

    public MyLinkedList() {
        this.head = new Node(0);
    }
    
    public int get(int index) {
        if(index < 0 || index >= length){
            return -1;
        }
        Node current = head.next;

        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(length == 0){
            head.next = newNode;
        }else{
            newNode.next = head.next;
            head.next = newNode;
        }
        length++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        Node current = head.next;

        if(length == 0){
            head.next = newNode;
            length++;
            return;
        }
        
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        length++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > length){
            return;
        }
        Node newNode = new Node(val);
        Node current = head;

        for(int i = 0; i < index; i++){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        length++;
        
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= length){
            return;
        }

        Node current = head;

        for(int i = 0; i < index; i++){
            current = current.next;
        }
        current.next = current.next.next;
        length--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */