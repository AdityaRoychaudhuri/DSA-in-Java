/* Q.876 ==> https://leetcode.com/problems/middle-of-the-linked-list/description */


public class midOfLL {
    private static ListNode head;

    static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode mid = middleNode(node);
        System.out.println(mid.val);
    }

    static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
