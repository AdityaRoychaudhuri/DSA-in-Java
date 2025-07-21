/* Q.25 ==> https://leetcode.com/problems/reverse-nodes-in-k-group/description */


public class reverseKNode {
    private static ListNode head;

    static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        head = reverseKGroup(head, k);

    }

    static ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while(true){
            ListNode check = curr;
            int count = 0;
            while (check != null && count < k) {
                check = check.next;
                count++;
            }
            if (count < k) {
                break;
            }

            ListNode last = prev;
            ListNode newEnd = curr;

            ListNode next = curr.next;

            for(int i=0;curr != null && i< k; i++){
                curr.next = prev;
                prev = curr;
                curr = next;
                if(next != null){
                    next = next.next;
                }
            }

            if(last != null){
                last.next = prev;
            }else{
                head = prev;
            }

            newEnd.next = curr;

            prev = newEnd;
        }

        return head;
    }
}
