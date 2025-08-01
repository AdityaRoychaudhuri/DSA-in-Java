/* Q.23 ==> https://leetcode.com/problems/merge-k-sorted-lists */


import java.util.PriorityQueue;

public class mergerKLL {
    static ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = new ListNode(1);
        ListNode merger = ans;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode list: lists){
            while(list != null){
                pq.add(list.val);
                list = list.next;
            }
        }

        while(!pq.isEmpty()){
            merger.next = new ListNode(pq.remove());
            merger = merger.next;
        }

        return ans.next;
    }
}
