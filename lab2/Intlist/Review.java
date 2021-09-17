public class Review {
    public static void main(String[] args) {
        IntList list1 = new IntList(5, null);
        // Add a new node to the end.
        list1.rest = new IntList(10, new IntList(15, new IntList(2, null)));
        // 1 - for loop to calculate size of Intlist.

        // int, double, char
        // reference type -
        IntList list2 = list1;
        int count = 1;
        while(list2.rest != null) {
            count++;
            list2 = list2.rest;
        }
        System.out.println("Count: " + count);
    }
}
