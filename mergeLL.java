/* Q.21 ==> https://leetcode.com/problems/merge-two-sorted-lists/description */


public class mergeLL {
    private static ListNode head;

    static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));

        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        ListNode merged = mergeTwoLists(list1, list2);

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

}
