/* Q,143 ==> https://leetcode.com/problems/reorder-list */


public class reorderList {
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

        System.out.print("Original List: ");

        reorderList1(head);

        System.out.print("Reordered List: ");
    }

    static void reorderList1(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode mid = middleNode(head);
        ListNode hf = head;
        ListNode hs = reverse(mid);

        while(hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        if(hf != null){
            hf.next = null;
        }
    }

    static ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static ListNode reverse(ListNode head){
        if(head == null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }
        }

        return prev;
    }
}
