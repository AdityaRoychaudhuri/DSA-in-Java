/* Q. 1290 ==> https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/?envType=daily-question&envId=2025-07-14 */


class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class binToDecimalLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(0,new ListNode(1)));
        int decimalValue = getDecimalValue(head);
        System.out.println(decimalValue);
    }

    static int getDecimalValue(ListNode head){
        int result = 0;
        while(head!=null){
            result = (result << 1) | head.val;
            head = head.next;
        }

        return result;
    }
}
