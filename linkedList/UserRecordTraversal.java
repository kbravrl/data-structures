package LinkedList;

import java.util.Scanner;

class ListNode2 {
    String data;
    ListNode2 next;
    ListNode2 previous;

    ListNode2() {
        this.data = "";
        this.next = null;
        this.previous = null;
    }

    ListNode2(String data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    ListNode2(String data, ListNode2 next) {
        this.data = data;
        this.next = next;
        this.previous = null;
    }

    ListNode2(String data, ListNode2 next, ListNode2 previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }
}

public class UserRecordTraversal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name: ");
        String name = input.next();
        System.out.println("Surname: ");
        String surname = input.next();
        System.out.println("Number: ");
        String number = input.next();

        ListNode2 a = new ListNode2(name);
        ListNode2 b = new ListNode2(surname);
        ListNode2 c = new ListNode2(number);

        a.next = b;
        b.previous = a;
        b.next = c;
        c.previous = b;

        ListNode2 start = a;
        while (true) {
            System.out.println("Press 1 to go to the next element, press 2 to go to the previous element, press 0 to exit: ");
            int tus = input.nextInt();
            if (tus == 0) {
                System.out.println("Program terminated.");
                break;
            } else if (tus == 1 && start.next != null) {
                start = start.next;
                System.out.println(start.data);
            } else if (tus == 2 && start.previous != null) {
                start = start.previous;
                System.out.println(start.data);
            }
        }
    }
}
