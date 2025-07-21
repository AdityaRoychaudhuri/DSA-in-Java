/* Q.142 ==> https://leetcode.com/problems/linked-list-cycle-ii/description */


public class entryOfCycle {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

    }

    static ListNode detectCycleEasy(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                ListNode temp = head;
                while (temp != slow){
                    temp = temp.next;
                    slow = slow.next;
                }
                return temp;
            }
        }

        return null;
    }

    static ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                length = lengthOfCycle(slow);
                break;
            }
        }

        if(length == 0){
            return null;
        }

        ListNode f = head;
        ListNode s = head;
        while( length > 0 ){
            s = s.next;
            length--;
        }

        while(f!=s){
            f = f.next;
            s = s.next;
        }

        return s;

    }

    static int lengthOfCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }

}
