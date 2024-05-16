
public class q16_q21 {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            System.out.println("Element: " + array[3]);
        } catch (ArrayIndexOutOfBoundsException error) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + error.getMessage());
        }

        try {

            LinkedListExample l = new LinkedListExample();
            l.add(1);
            System.out.println("Element at index 3: " + l.get(3));
        } catch (ArrayIndexOutOfBoundsException error) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + error.getMessage());
        }

        try {

            int[] array = {1, 2, 3};
            recursiveArray(array, 5);
        } catch (ArrayIndexOutOfBoundsException error) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + error.getMessage());
        }

        try {

            int[] array = {1, 2, 3};
            System.out.println("Element at index 5: " + array[5]);
        } catch (ArrayIndexOutOfBoundsException error) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + error.getMessage());
        }

        try {
            int[] array = {1, 2, 3};
            recursiveArray(array, 5);
        } catch (ArrayIndexOutOfBoundsException error) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + error.getMessage());
        }

        try {
            int[][] mat = {{1, 2}, {3, 4}};
            System.out.println("Element at index (2, 2): " + mat[2][2]);
        } catch (ArrayIndexOutOfBoundsException error) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + error.getMessage());
        }
    }

    private static void recursiveArray(int[] array, int idx) {
        if (idx < 0 || idx >= array.length) {
            return;
        }
        System.out.println("Element at index " + idx + ": " + array[idx]);
        recursiveArray(array, idx - 1);
    }
}

class Node {
    int data1;
    Node next;

    Node(int data1) {
        this.data1 = data1;
        this.next = null;
    }
}

class LinkedListExample {
    Node head1;

    public void add(int data1) {
        if (head1 == null) {
            head1 = new Node(data1);
        } else {
            Node temp1 = head1;
            while (temp1.next != null) {
                temp1 = temp1.next;
            }
            temp1.next = new Node(data1);
        }
    }

    public int get(int index) {
        Node curr = head1;
        for (int i = 0; i < index; i++) {
            if (curr == null) {
                throw new ArrayIndexOutOfBoundsException("Index out of bounds");
            }
            curr = curr.next;
        }
        if (curr == null) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        return curr.data1;
    }
}
