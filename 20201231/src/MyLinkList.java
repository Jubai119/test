class Node {
    public int data;
    public Node next;
    public Node(){

    }
    public Node head;
    public Node(int data){
        this.data = data;
    }
        }
public class MyLinkList {
    public Node head;
    public Node headA;
    public Node headB;

    //输出
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //任意位置输出
    public void display(Node newHead) {
        Node cur = newHead;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //得到长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public int size(Node head) {
        Node cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //头插法
    public void addFirst(int data) {
        Node cur = new Node(data);
        cur.next = this.head;
        this.head = cur;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    public void addLastA(int data) {
        Node node = new Node(data);
        if (this.headA == null) {
            this.headA = node;
        } else {
            Node cur = this.headA;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    public void addLastB(int data) {
        Node node = new Node(data);
        if (this.headB == null) {
            this.headB = node;
        } else {
            Node cur = this.headB;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //找最后一个
    public Node findLastNode() {
        if (this.head == null) {
            System.out.println("链表为空！");
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    //找倒数第二个
    public Node findTLastNode() {
        if (this.head == null) {
            System.out.println("链表为空！");
        }
        Node cur = this.head;
        while (cur.next.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    //找第n个
    public Node findNode(int n) {
        Node cur = this.head;
        if (this.head == null || n <= 0 || n > this.size()) {
            return null;
        }
        int count = 0;
        while (count != n) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    //找key是否存在
    public boolean contains(int key) {
        Node cur = this.head;
        if (cur == null) {
            System.out.println("链表为空！");
        } else {
            cur = cur.next;
        }
        if (cur.data == key)
            return true;
        else
            return false;
    }

    //下标为index的节点
    public Node findIndex(int index) {
        if (index < 0 || index > size()) {
            System.out.println("index不合法！");
            return null;
        }
        Node cur = this.head;
        int count = 0;
        while (count != index) {
            count++;
            cur = cur.next;
        }
        return cur;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        Node node = new Node(data);
        if (index < 0 || index > size()) {
            System.out.println("index不合法！");
        }
        if (index == 0) {
            addFirst(data);
        }
        if (index == size()) {
            addLast(data);
        } else {
            Node cur = findIndex(index);
            node.next = cur.next;
            cur.next = node;
        }
    }

    //找key的前驱
    public Node searchPrev(int key) {
        Node cur = this.head;
        if (cur == null) {
            return null;
        }
        while (cur.next != null) {
            if (cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            return;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = searchPrev(key);
        if (prev == null) {
            System.out.println("无当前key前驱");
        } else {
            prev.next = prev.next.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = prev.next;
        while (cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }

    //删除所有值为key的节点2
    public void removeKey(int key) {
        Node p;
        Node q = null;
        for (p = this.head; p != null && p.data != key; q = p, p = p.next) ;
        if (p != null) {
            if (p == this.head) {
                this.head = this.head.next;
            } else {
                q.next = p.next;
            }
        }
    }

    //反转链表
    public Node reverseList() {
        Node cur = this.head;//cur 代表当前要反转的节点
        Node prev = null;//prev 代表当前需要反转的节点的前驱
        Node newHead = null;
        while (cur != null) {
            Node curNext = cur.next;//curNext 代表当前需要反转的下一个节点
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        this.head = newHead;
        return newHead;

    }

    //反转链表头插法
    public Node reverseList2() {
        Node prev = null;
        while (head != null) {
            Node cur = head;
            head = head.next;
            cur.next = prev;
            prev = cur;
        }
        this.head = prev;
        return prev;
    }

    //找到中间节点
    //slow一个一个跑，fast两个两个跑
    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //倒数第K个
    public Node findKthToTail(int k) {
        if (head == null || k <= 0) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (k - 1 != 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                return null;//k过大
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    //

    //将两个升序合并为一个
    public Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node();
        Node tmp = newHead;
        while (headA != null && headB != null) {
            if (headA.data < headB.data) {
                tmp.next = headA;
                headA = headA.next;
            } else {
                tmp.next = headB;
                headB = headB.next;
            }
            tmp = tmp.next;
        }
        //代码走到这里肯定是一个为空 一个不为空
        if (headA != null) {
            tmp.next = headA;
        }
        if (headB != null) {
            tmp.next = headB;
        }
        return newHead.next;
    }

    //删除重复
    public Node deleteDuplication(Node pHead) {
        if (pHead == null) {
            return null;
        }
        Node newHead = new Node();
        Node tmp = newHead;
        Node cur = pHead;
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            } else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }

    //小于K在前，大于K在后
    public Node part(Node pHead, int x) {
        if (pHead == null) {
            return null;
        }
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = pHead;
        while (cur != null) {
            if (cur.data < x) {
                if (bs == null) {
                    bs = cur;
                    be = cur;
                } else {
                    be.next = cur;
                    be = be.next;
                }
            } else {
                if (as == null) {
                    as = cur;
                    ae = cur;
                } else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        if (bs == null) {
            return as;
        }
        be.next = as;
        if (as != null) {
            ae.next = null;
        }
        return bs;
    }

    //链表的回文结构。
    public boolean palindromeLink() {
        Node be = this.head;
        Node prev = middleNode();
        Node cur = prev.next;
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        while (be != prev) {
            if (be.data != prev.data) {
                return false;
            }
            be = be.next;
            prev = prev.next;
            if (be.next == prev) {
                return true;
            }
        }
        return true;
    }

    //输入两个链表，找出它们的第一个公共结点。
    public Node commonNode(Node headA, Node headB) {
        Node ll = headA;
        Node ls = headB;
        if (ll == null || ls == null) {
            return null;
        }
        int lenA = size(headA);
        int lenB = size(headB);
        int len = lenA - lenB;
        if (len < 0) {
            ll = headB;
            ls = headA;
            len = -len;
        }
        while (len != 0) {
            ll = ll.next;
            len--;
        }
        if (ll != ls) {
            ll = ll.next;
            ls = ls.next;
        }
        return ls.next;
    }

    //给定一个链表，判断链表中是否有环。
    public boolean hasRing() {
        if (this.head == null) {
            return false;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return false;
        }
        return true;
    }

    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public Node findRing() {
        if (this.head == null) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = this.head;
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
    //删除链表中间key节点  O(1)
    public void delNode(int key) {
        Node cur = this.head;
        while (cur.data != key){
            cur = cur.next;
        }
        cur.data = cur.next.data;
        cur.next = cur.next.next;
    }
    //旋转链表

    //清空
    public void clear(){
        this.head=null;
        System.out.println("null");
    }
}
