public class Main {
    public static void main(String[] args){
        //MyLinkList myLinkList=new MyLinkList();
        /*myLinkList.addFirst(2);
        myLinkList.addFirst(5);
        myLinkList.addFirst(3);
        myLinkList.addFirst(1);
        myLinkList.addFirst(9);*/
       // myLinkList.display();
        /*myLinkList.addLast(7);
        myLinkList.addLast(8);
        myLinkList.addLast(9);
        myLinkList.addLast(0);
        myLinkList.addLast(9);
        myLinkList.display();*/
        /*System.out.println(myLinkList.size());
        Node fl=myLinkList.findLastNode();
        System.out.println(fl.data);
        Node ftl=myLinkList.findTLastNode();
        System.out.println(ftl.data);
        Node fln=myLinkList.findNode(5);
        if(fln==null)
            System.out.println("null");
        else
            System.out.println(fln.data);
        Node f2=myLinkList.findNode(3);
        System.out.println(f2.data);
        System.out.println(myLinkList.contains(5));
        System.out.println(myLinkList.contains(10));
        Node fi=myLinkList.findIndex(4);
        System.out.println(fi.data);
        Node fi2=myLinkList.findIndex(10);
        if(fi2!=null)
            System.out.println(fi2.data);
        myLinkList.addIndex(4,7);
        myLinkList.display();
        Node sp=myLinkList.searchPrev(3);
        if(sp!=null)
            System.out.println(sp.data);
        else
            System.out.println("无当前key前驱");
        myLinkList.remove(2);
        myLinkList.display();
        myLinkList.removeAllKey(8);//删中间
        myLinkList.display();
        myLinkList.removeAllKey(2);
        myLinkList.display();//删头
        myLinkList.removeAllKey(6);
        myLinkList.display();//删尾
        myLinkList.removeKey(3);
        myLinkList.display();
        Node middle=myLinkList.middleNode();
        System.out.println(middle.data);
        myLinkList.reverseList();
        myLinkList.display();
        myLinkList.reverseList2();
        myLinkList.display();
        Node ft=myLinkList.findKthToTail(4);
        System.out.println(ft.data);
        myLinkList.clear();
        myLinkList.display();*/

        /*myLinkList.addLast(2);
        myLinkList.addLast(3);
        myLinkList.addLast(3);
        myLinkList.addLast(4);
        myLinkList.addLast(4);
        myLinkList.addLast(5);
        myLinkList.deleteDuplication(myLinkList.head);
        myLinkList.display();
        myLinkList.part(myLinkList.head,4);
        myLinkList.display();
        myLinkList.addLastA(4);
        myLinkList.addLastA(5);
        myLinkList.addLastA(6);
        myLinkList.addLastA(9);
        myLinkList.display(myLinkList.headA);
        myLinkList.addLastB(1);
        myLinkList.addLastB(3);
        myLinkList.addLastB(7);
        myLinkList.addLastB(8);
        myLinkList.addLastB(10);
        myLinkList.display(myLinkList.headB);
        Node head = myLinkList.mergeTwoLists(myLinkList.headA,myLinkList.headB);
        myLinkList.display(head);*/
        /*myLinkList.addLast(1);
        myLinkList.addLast(2);
        myLinkList.addLast(3);
        myLinkList.addLast(4);
        myLinkList.addLast(5);
        myLinkList.addLast(4);
        myLinkList.addLast(3);
        myLinkList.addLast(2);
        myLinkList.addLast(1);
        myLinkList.display();
        System.out.println(myLinkList.palindromeLink());*/
        /*myLinkList.addLastA(4);
        myLinkList.addLastA(5);
        myLinkList.addLastA(6);
        myLinkList.addLastA(8);
        myLinkList.addLastA(5);
        myLinkList.addLastA(2);
        myLinkList.display(myLinkList.headA);
        myLinkList.addLastB(1);
        myLinkList.addLastB(4);
        myLinkList.addLastB(2);
        myLinkList.addLastB(3);
        myLinkList.addLastB(6);
        myLinkList.addLastB(8);
        myLinkList.addLastB(5);
        myLinkList.addLastB(2);
        myLinkList.display(myLinkList.headB);
        Node com =myLinkList.commonNode(myLinkList.headA,myLinkList.headB);
        System.out.println(com.data);*/
        /*System.out.println(myLinkList.hasRing());
        Node r =myLinkList.findRing();
        System.out.println(r);*/
        /*myLinkList.delNode(9);
        myLinkList.display();*/

        DoubleLinkList doubleLinkList = new DoubleLinkList();
        doubleLinkList.addFirst(4);
        doubleLinkList.addFirst(2);
        doubleLinkList.addFirst(4);
        doubleLinkList.addFirst(4);
        doubleLinkList.addFirst(3);
        doubleLinkList.display();
        doubleLinkList.addLast(9);
        doubleLinkList.addLast(5);
        doubleLinkList.addLast(7);
        doubleLinkList.addLast(4);
        doubleLinkList.addLast(6);
        doubleLinkList.display();
        doubleLinkList.addIndex(3,5);
        doubleLinkList.display();
        System.out.println(doubleLinkList.contains(6));
        System.out.println(doubleLinkList.contains(88));
        doubleLinkList.remove(2);//删中间
        doubleLinkList.remove(3);//删头
        doubleLinkList.remove(6);//删尾
        doubleLinkList.display();
        doubleLinkList.removeAllKey(4);
        doubleLinkList.display();
        doubleLinkList.clear();
    }
}
