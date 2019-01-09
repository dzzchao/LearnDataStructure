public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Array array = new Array(10);
        array.addFirst(1);
        array.addFirst(2);
        array.addFirst(3);
        array.addFirst(4);
        array.addFirst(5);
        array.addFirst(6);
        array.addFirst(7);

        array.addLast(333);

        array.add(1,5);
        System.out.println(array.toString());
        System.out.println(array.contains(5));
        System.out.println(array.find(5));
    }
}