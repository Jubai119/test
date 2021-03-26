public class Main {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0, 3);
        myArrayList.add(1, 4);
        myArrayList.add(2, 8);
        myArrayList.add(3, 5);
        myArrayList.add(4, 1);
        myArrayList.display();
        System.out.println(myArrayList.isFull());
        System.out.println(myArrayList.contains(4));
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.search(8));
        System.out.println(myArrayList.getPos(2));
        myArrayList.setPos(1, 3);
        myArrayList.display();
        myArrayList.remove(1);
        myArrayList.display();
        myArrayList.clear();
    }
}