/* Q.83 ==> https://leetcode.com/problems/remove-duplicates-from-sorted-list */

public class removeDupliLL {
    private static ListNode head;

    static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
            ListNode node = new ListNode(1,new ListNode(0,new ListNode(1,new ListNode(2,new ListNode(1,new ListNode(4))))));
            node = deleteDuplicates(node);
    }
    static ListNode deleteDuplicates(ListNode head) {
        removeDupliLL.head = head;
        ListNode temp = head;
        if(temp == null){
            return head;
        }
        while(temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}
