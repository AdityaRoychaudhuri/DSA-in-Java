/* Q.206 ==> https://leetcode.com/problems/reverse-linked-list */


public class reverseLL {
    private static ListNode head;

    static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        ListNode reversed = reverseList(head);

        System.out.print("Reversed Linked List: ");
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }

    }

    static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode nextNode = present.next;

        while (present != null){
            present.next = prev;
            prev = present;
            present = nextNode;
            if (nextNode != null){
                nextNode = nextNode.next;
            }
        }
        return prev;
    }
}
