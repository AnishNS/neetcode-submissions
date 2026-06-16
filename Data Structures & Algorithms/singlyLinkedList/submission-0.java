class LinkedList {
    class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
            this.next=null;
        }
    }
    Node head;

    public LinkedList() {
        head=null;
    }

    public int get(int index) {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(i==index)
            {
                return temp.val;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
    }

    public void insertTail(int val) {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public boolean remove(int index) {
        if(head==null)
        {
            return false;
        }
        if(index==0)
        {
            head=head.next;
            return true;
        }
        Node temp=head;
        int  i=0;
        if(temp!=null && i<index-1)
        {
            temp=temp.next;
            i++;
        }
        if(temp==null || temp.next==null)
        {
            return false;
        }
        temp.next=temp.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list=new ArrayList<>();
        Node temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        return list;
    }
}
