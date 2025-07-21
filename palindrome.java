/* Q.234 ==> https://leetcode.com/problems/palindrome-linked-list/description */


public class palindrome {
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
                        new ListNode(2,
                                new ListNode(1))));

        // Call isPalindrome and print result
        boolean result = isPalindrome(head);
        System.out.println("Is Palindrome: " + result);

    }

    static boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverse(mid);

        while(head != null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }else{
                head = head.next;
                headSecond = headSecond.next;
            }
        }

        return head == null || headSecond == null;
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
