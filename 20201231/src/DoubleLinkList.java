class ListNode {
    private int val;
    private ListNode next;
    private ListNode prev;

    public ListNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}
public class DoubleLinkList {
    private ListNode head;
    private ListNode last;
    //打印
    public void display() {
        ListNode cur = this.head;
        while(cur !=null) {
            System.out.print(cur.getVal()+" ");
            cur = cur.getNext();
        }
        System.out.println();
    }
    //得到单链表的长度
    public int size() {
        ListNode cur = this.head;
        int count =0;
        while (cur !=null) {
            count++;
            cur =cur.getNext();
        }
        return count;
    }
    //头插
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else{
            node.setNext(this.head);
            this.head.setPrev(node);
            this.head = node;
        }
    }
    //尾插
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else{
            this.last.setNext(node);
            node.setPrev(this.last);
            this.last = node;
        }
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        if(index < 0||index > size()) {
            return;
        }
        if(index == 0){
            addFirst(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }
        ListNode cur =this.head;
        while (index != 0) {
            cur = cur.getNext();
            index--;
            }
        ListNode node = new ListNode(data);
        node.setNext(cur);
        node.setPrev(cur.getPrev());
        cur.getPrev().setNext(node);
        cur.setPrev(node);
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.getVal() == key) {
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.getVal() == key) {
                if (cur == this.head) {
                    this.head = this.head.getNext();
                    this.head.setPrev(null);
                } else if (cur == this.last) {
                    cur.getPrev().setNext(null);
                    this.last = this.last.getPrev();
                } else {
                    cur.getPrev().setNext(cur.getNext());
                    cur.getNext().setPrev(cur.getPrev());
                }
                return;
            }
            cur = cur.getNext();
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.getVal() == key) {
                if (cur == this.head) {
                        this.head = this.head.getNext();
                        if(this.head != null) {
                        this.head.setPrev(null);
                    }
                } else if (cur == this.last) {
                    cur.getPrev().setNext(null);
                    this.last = this.last.getPrev();
                } else {
                    cur.getPrev().setNext(cur.getNext());
                    cur.getNext().setPrev(cur.getPrev());
                }
            }
            cur = cur.getNext();
        }
    }
    //清空
    public void clear() {
        this.head = null;
        this.last = null;
        System.out.println("null");
    }
}
