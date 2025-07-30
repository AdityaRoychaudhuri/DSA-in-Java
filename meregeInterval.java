/* Q.56 ==> https://leetcode.com/problems/merge-intervals/description */


import java.util.Arrays;
import java.util.LinkedList;

public class meregeInterval {
    static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));
        LinkedList<int[]> ans = new LinkedList<int[]>();

        for(int[] ele : intervals){
            if(ans.isEmpty() || ans.getLast()[1] < ele[0]){
                ans.add(ele);
            }else{
                ans.getLast()[1] = Math.max(ans.getLast()[1], ele[1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
