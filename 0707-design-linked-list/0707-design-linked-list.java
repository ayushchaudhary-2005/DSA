class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    Node head=null;
    int size=0;

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if(head==null){
            return -1;
        }
        int c=0;
        Node temp=head;
        while(temp!=null){
            if(c==index){
                return temp.val;
            }
            c++;
            temp=temp.next;
            
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node nn=new Node(val);
        nn.next=head;
        head=nn;
        size++;
    }
    
    public void addAtTail(int val) {
        if(head==null){
            head=new Node(val);
            size++;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(val);
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        int idx=0;
        Node temp=head;
        while(idx+1<index){
            temp=temp.next;
            idx++;

        }
        Node nn=new Node(val);
        nn.next=temp.next;
        temp.next=nn;
        size++;
        
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size){
            return;
        }

        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        Node prev=head;
        Node curr=head.next;
        int idx=0;
        while(idx+1<index && curr!=null){
            prev=curr;
            curr=curr.next;
            idx++;
        }
        prev.next=curr.next;
        size--;
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