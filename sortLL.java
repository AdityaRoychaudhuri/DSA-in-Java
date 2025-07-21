/* Q.148 ==> https://leetcode.com/problems/sort-list/description */


public class sortLL {
    private static ListNode head;

    static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        head = sortList(head);
    }

    static ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left, right);
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode tail = ans;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            }else{
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }
        }

        while(list1 != null){
            tail.next = list1;
            tail = tail.next;
            list1 = list1.next;
        }
        while(list2 != null){
            tail.next = list2;
            tail = tail.next;
            list2 = list2.next;
        }

        return ans.next;
    }

    static ListNode middleNode(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
